package com.sugarcoachpremium.ui.main;

import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp;
import com.sugarcoachpremium.ui.main.presenter.MainPresenter;
import com.sugarcoachpremium.ui.main.presenter.MainPresenterImp;
import com.sugarcoachpremium.ui.main.view.MainView;
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
public final class MainActivityModule_ProvideMainPresenter$app_releaseFactory implements Factory<MainPresenterImp<MainView, MainInteractorImp>> {
  private final MainActivityModule module;

  private final Provider<MainPresenter<MainView, MainInteractorImp>> mainPresenterProvider;

  public MainActivityModule_ProvideMainPresenter$app_releaseFactory(MainActivityModule module,
      Provider<MainPresenter<MainView, MainInteractorImp>> mainPresenterProvider) {
    this.module = module;
    this.mainPresenterProvider = mainPresenterProvider;
  }

  @Override
  public MainPresenterImp<MainView, MainInteractorImp> get() {
    return provideMainPresenter$app_release(module, mainPresenterProvider.get());
  }

  public static MainActivityModule_ProvideMainPresenter$app_releaseFactory create(
      MainActivityModule module,
      Provider<MainPresenter<MainView, MainInteractorImp>> mainPresenterProvider) {
    return new MainActivityModule_ProvideMainPresenter$app_releaseFactory(module, mainPresenterProvider);
  }

  public static MainPresenterImp<MainView, MainInteractorImp> provideMainPresenter$app_release(
      MainActivityModule instance, MainPresenter<MainView, MainInteractorImp> mainPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideMainPresenter$app_release(mainPresenter));
  }
}
