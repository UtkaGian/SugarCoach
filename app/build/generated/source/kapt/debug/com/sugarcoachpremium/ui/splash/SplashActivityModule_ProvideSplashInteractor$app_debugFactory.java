package com.sugarcoachpremium.ui.splash;

import com.sugarcoachpremium.ui.splash.interactor.SplashInteractor;
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SplashActivityModule_ProvideSplashInteractor$app_debugFactory implements Factory<SplashInteractorImp> {
  private final SplashActivityModule module;

  private final Provider<SplashInteractor> splashInteractorProvider;

  public SplashActivityModule_ProvideSplashInteractor$app_debugFactory(SplashActivityModule module,
      Provider<SplashInteractor> splashInteractorProvider) {
    this.module = module;
    this.splashInteractorProvider = splashInteractorProvider;
  }

  @Override
  public SplashInteractorImp get() {
    return provideSplashInteractor$app_debug(module, splashInteractorProvider.get());
  }

  public static SplashActivityModule_ProvideSplashInteractor$app_debugFactory create(
      SplashActivityModule module, Provider<SplashInteractor> splashInteractorProvider) {
    return new SplashActivityModule_ProvideSplashInteractor$app_debugFactory(module, splashInteractorProvider);
  }

  public static SplashInteractorImp provideSplashInteractor$app_debug(SplashActivityModule instance,
      SplashInteractor splashInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideSplashInteractor$app_debug(splashInteractor));
  }
}
