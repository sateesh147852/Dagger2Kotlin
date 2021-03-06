package com.dagger2.utilites

import com.dagger2.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AppController : DaggerApplication() {

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    val appComponent = DaggerAppComponent.builder().application(this).build()
    appComponent.inject(this)
    return appComponent;
  }
}