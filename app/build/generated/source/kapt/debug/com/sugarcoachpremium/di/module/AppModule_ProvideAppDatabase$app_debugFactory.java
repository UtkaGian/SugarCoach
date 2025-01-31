package com.sugarcoachpremium.di.module;

import android.content.Context;
import com.sugarcoachpremium.data.database.AppDatabase;
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
public final class AppModule_ProvideAppDatabase$app_debugFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideAppDatabase$app_debugFactory(AppModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase$app_debug(module, contextProvider.get());
  }

  public static AppModule_ProvideAppDatabase$app_debugFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvideAppDatabase$app_debugFactory(module, contextProvider);
  }

  public static AppDatabase provideAppDatabase$app_debug(AppModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDatabase$app_debug(context));
  }
}
