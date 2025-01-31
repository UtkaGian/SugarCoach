package com.sugarcoachpremium.ui.daily_detail.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J,\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150 2\u0006\u0010\u001d\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b!\u0010\"J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0016J\u0014\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0%0$H\u0016J\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0%0$H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020,0$2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0$H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u0002000$H\u0016J\u001e\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001b2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002062\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00108\u001a\u000209H\u0016J,\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150 2\u0006\u00108\u001a\u000209H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b;\u0010<R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInterador;", "Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInteractorImp;", "treamentRepo", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "dailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "userRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "(Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "apiRepository", "Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "getApiRepository", "()Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "setApiRepository", "(Lcom/sugarcoachpremium/data/api_db/ApiRepository;)V", "onlineId", "", "getOnlineId", "()Ljava/lang/String;", "setOnlineId", "(Ljava/lang/String;)V", "deleteRegister", "Lio/reactivex/Observable;", "", "id", "", "deleteRegistersCall", "Lkotlin/Result;", "deleteRegistersCall-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lio/reactivex/Single;", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getEmotions", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "getExercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getUser", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "saveRegisterPhotoCall", "Lcom/sugarcoachpremium/data/network/RegisterSavePhotoResponse;", "photo", "Ljava/io/File;", "setIdOnline", "", "updateRegister", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "updateRegisterCall", "updateRegisterCall-gIAlu-s", "(Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DailyDetailInterador extends com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor implements com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper = null;
    @javax.inject.Inject
    public com.sugarcoachpremium.data.api_db.ApiRepository apiRepository;
    public java.lang.String onlineId;
    
    @javax.inject.Inject
    public DailyDetailInterador(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepo, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.UserRepo userRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ApiHelper apiHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.api_db.ApiRepository getApiRepository() {
        return null;
    }
    
    public final void setApiRepository(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.api_db.ApiRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOnlineId() {
        return null;
    }
    
    public final void setOnlineId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void setIdOnline(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteRegister(int id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> updateRegister(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> getRegister(int id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> getCategories() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<com.sugarcoachpremium.data.network.RegisterSavePhotoResponse> saveRegisterPhotoCall(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.io.File photo) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> getExercises() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> getEmotions() {
        return null;
    }
}