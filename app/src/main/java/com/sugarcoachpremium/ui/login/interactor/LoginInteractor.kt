package com.sugarcoachpremium.ui.login.interactor

import android.content.Context
import android.util.Log
import com.google.gson.GsonBuilder
import com.google.gson.internal.`$Gson$Types`
import com.sugarcoachpremium.GetUserByUIDQuery
import com.sugarcoachpremium.data.api_db.ApiRepository
import com.sugarcoachpremium.data.database.repository.dailyregister.*
import com.sugarcoachpremium.data.database.repository.treament.*
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.ApiHelper
import com.sugarcoachpremium.data.network.LoginRequest
import com.sugarcoachpremium.data.network.LoginResponse
import com.sugarcoachpremium.data.network.RegistersResponse
import com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.FileUtils
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject
import kotlin.Result.Companion.failure
import kotlin.Result.Companion.success


class LoginInteractor @Inject constructor(private val mContext: Context, private  val dailyRepoHelper: DailyRegisterRepo,
                                          private val treamentRepoHelper: TreamentRepo, userRepoHelper: UserRepo,
                                          preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) :
    BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    LoginInteractorImp {

    @Inject
    lateinit var apiRepository: ApiRepository


    override suspend fun getUserData(userUID: String?): Result<GetUserByUIDQuery.Data1?> {
        return apiRepository.getUserId(userUID!!)
    }
    override suspend fun doServerLoginpiCall(email: String, password: String): Observable<LoginResponse> {
       val loginResponse = coroutineScope {
           val response = this.async {
               apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email = email, pass = password))
                   .subscribeOn(Schedulers.io())
                   .map { it }
           }
           response.await()
       }
        return loginResponse
    }

    override suspend fun makeLocalUser(cloudUser: GetUserByUIDQuery.Data1?): Observable<Boolean>{
        val data = apiRepository.getUserData(cloudUser?.id!!)
        if (data == null) {
            return Observable.just(false)
        }
        val user = User(
            1,
            cloudUser.attributes!!.username,
            false,
            cloudUser.attributes.email,
            "",
            true,
            data.sex,
            data.name,
            null,
            data.weight?.toFloat(),
            data.height?.toFloat(),
            //data.birth_date?.let { SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(it) },
            //data.debut_date?.let { SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(it) },
            null,
            null,
            false,
            false,
            false,
            false,
            "",
            "",
            "2",
            cloudUser.id.toInt(),
            data.sugar_points!!
        )
         Log.i("OnLoginInteractor", "El Id del user: ${cloudUser.id}")
        setUserId(cloudUser.id)
        return userHelper.insertRegister(user)
    }

    override fun getRegistersCall(): Observable<List<RegistersResponse>> {
        return apiHelper.performGetRegisters(token = "Bearer "+preferenceHelper.getAccessToken().toString()).subscribeOn(
            Schedulers.io())
            .map { it }
        /*CoroutineScope(Dispatchers.IO).async {
            apiRepository.getDailyRegisters()
        }*/
    }
    override fun updateUserInSharedPref(loginResponse: LoginResponse, mirror: Boolean, medico: Boolean) {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        var json = gson.toJson(loginResponse.user)
        var user: User = gson.fromJson(json.toString(), User::class.java)
        user.medico = medico
        if (mirror){
            user.mirror_id ="12"
            user.typeAccount="3"
        }
        userHelper.insertRegister(user)
        preferenceHelper.let {
            it.setCurrentUserId(loginResponse.user?.id)
            it.setAccessToken(loginResponse.accessToken)
            it.setUserLoged(true)
        }
    }

    override fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean> {
        if (dailyRepoHelper.loadDailyRegistersTotal() > 0 || dailyRepoHelper.isRegisterRepoEmpty()) {
            registersResponse.map {
                if (it.exercise.isNullOrEmpty()){
                    it.exercise = null
                }
                if (it.emotionalState.isNullOrEmpty()){
                    it.emotionalState = null
                }
            }
            dailyRepoHelper.insertRegisters(registersResponse)
            return Observable.just(true)
        }else{
            return Observable.just(true)

        }
    }

    override fun treament(treament: Treament): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isTreamentRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    treamentRepoHelper.insertTreament(treament)
                } else
                    Observable.just(false)
            }
    }


    override fun category(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dailyRepoHelper.isCategoriesRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Category::class.java)
                    val categoryList = gson.fromJson<List<Category>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_CATEGORY),
                        type)
                    dailyRepoHelper.insertCategories(categoryList)
                } else
                    Observable.just(false)
            }
    }


    override fun exercises(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dailyRepoHelper.isExercisesRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Exercises::class.java)
                    val itemList = gson.fromJson<List<Exercises>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_EXERCISES),
                        type)
                    dailyRepoHelper.insertExercise(itemList)
                } else
                    Observable.just(false)
            }
    }


    override fun states(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dailyRepoHelper.isStatesRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, States::class.java)
                    val itemList = gson.fromJson<List<States>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_STATES),
                        type)
                    dailyRepoHelper.insertStates(itemList)
                } else
                    Observable.just(false)
            }
    }

    override fun treamentHorarios(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isTreamentCategoryRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, TreamentHorarios::class.java)
                    val categoryList = gson.fromJson<List<TreamentHorarios>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_TREATMENT_HORARIOS),
                        type)
                    categoryList.forEach{ it.treatment_id = 1 }
                    treamentRepoHelper.insertTreamentCategory(categoryList)
                } else
                    Observable.just(false)
            }
    }

    override fun treatmentHorariosCorrectora(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isTreamentCategoryCorrectoraRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, TreamentCorrectoraHorarios::class.java)
                    val categoryList = gson.fromJson<List<TreamentCorrectoraHorarios>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_TREATMENT_HORARIOS),
                        type)
                    categoryList.forEach{ it.treatment_id = 1 }
                    treamentRepoHelper.insertTreamentCategoryCorrectora(categoryList)
                } else
                    Observable.just(false)
            }
    }

    override fun treatmentBasalHora(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isTreamentBasalHoraRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, TreamentBasalHora::class.java)
                    val categoryList = gson.fromJson<List<TreamentBasalHora>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_TREATMENT_BASAL_HORA),
                        type)
                    categoryList.forEach{ it.treatment_id = 1 }
                    treamentRepoHelper.insertTreamentBasalHoras(categoryList)
                } else
                    Observable.just(false)
            }
    }

    override fun getBasal(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isBasalRepoEmpty().subscribeOn(Schedulers.io()).concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, BasalInsuline::class.java)
                val basalList = gson.fromJson<List<BasalInsuline>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.DATABASE_BASAL),
                    type)
                treamentRepoHelper.insertBasal(basalList)
            } else
                Observable.just(false)
        }
    }

    override fun getMedidor(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isMedidorRepoEmpty().subscribeOn(Schedulers.io()).concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Medidor::class.java)
                val list = gson.fromJson<List<Medidor>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.DATABASE_MEDIDOR),
                    type)
                treamentRepoHelper.insertMedidor(list)
            } else
                Observable.just(false)
        }
    }

    override fun getCorrectora(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isBasalRepoEmpty().subscribeOn(Schedulers.io()).concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, CorrectoraInsuline::class.java)
                val basalList = gson.fromJson<List<CorrectoraInsuline>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.DATABASE_Correctora),
                    type)
                treamentRepoHelper.insertCorrectora(basalList)
            } else
                Observable.just(false)
        }
    }

    override fun getBombas(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isBombasRepoEmpty().subscribeOn(Schedulers.io()).concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, BombaInfusora::class.java)
                val list = gson.fromJson<List<BombaInfusora>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.DATABASE_BOMBAS),
                    type)
                treamentRepoHelper.insertBombas(list)
            } else
                Observable.just(false)
        }
    }

}