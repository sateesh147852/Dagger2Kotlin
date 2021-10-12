package com.dagger2.di

import com.dagger2.utilites.AppController
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
  modules = [AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBindersModule::class,
    ContextModule::class,
    FragmentBindersModule::class]
)
interface AppComponent : AndroidInjector<AppController> {

  override fun inject(instance: AppController?)

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(appController: AppController): Builder

    fun build(): AppComponent

  }
}