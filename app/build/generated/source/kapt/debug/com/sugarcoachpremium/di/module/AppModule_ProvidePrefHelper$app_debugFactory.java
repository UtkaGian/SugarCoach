package com.sugarcoachpremium.di.module;

import com.sugarcoachpremium.data.preferences.AppPreferenceHelper;
import com.sugarcoachpremium.di.preferences.PreferenceHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvidePrefHelper$app_debugFactory implements Factory<PreferenceHelper> {
  private final AppModule module;

  private final Provider<AppPreferenceHelper> appPreferenceHelperProvider;

  public AppModule_ProvidePrefHelper$app_debugFactory(AppModule module,
      Provider<AppPreferenceHelper> appPreferenceHelperProvider) {
    this.module = module;
    this.appPreferenceHelperProvider = appPreferenceHelperProvider;
  }

  @Override
  public PreferenceHelper get() {
    return providePrefHelper$app_debug(module, appPreferenceHelperProvider.get());
  }

  public static AppModule_ProvidePrefHelper$app_debugFactory create(AppModule module,
      Provider<AppPreferenceHelper> appPreferenceHelperProvider) {
    return new AppModule_ProvidePrefHelper$app_debugFactory(module, appPreferenceHelperProvider);
  }

  public static PreferenceHelper providePrefHelper$app_debug(AppModule instance,
      AppPreferenceHelper appPreferenceHelper) {
    return Preconditions.checkNotNullFromProvides(instance.providePrefHelper$app_debug(appPreferenceHelper));
  }
}
