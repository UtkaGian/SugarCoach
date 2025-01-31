package com.sugarcoachpremium.ui.signEmail;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\nJ-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000fH\u0001\u00a2\u0006\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/sugarcoachpremium/ui/signEmail/SignEmailActivityModule;", "", "()V", "provideFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideFirebaseAuth$app_debug", "providesignInteractor", "Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractorImp;", "signEmailInteractor", "Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractor;", "providesignInteractor$app_debug", "providesignPresenter", "Lcom/sugarcoachpremium/ui/signEmail/presenter/SignEmailPresenterImp;", "Lcom/sugarcoachpremium/ui/signEmail/view/SignEmailView;", "signEmailPresenter", "Lcom/sugarcoachpremium/ui/signEmail/presenter/SignEmailPresenter;", "providesignPresenter$app_debug", "app_debug"})
public final class SignEmailActivityModule {
    
    public SignEmailActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp providesignInteractor$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractor signEmailInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp<com.sugarcoachpremium.ui.signEmail.view.SignEmailView, com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp> providesignPresenter$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenter<com.sugarcoachpremium.ui.signEmail.view.SignEmailView, com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp> signEmailPresenter) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth$app_debug() {
        return null;
    }
}