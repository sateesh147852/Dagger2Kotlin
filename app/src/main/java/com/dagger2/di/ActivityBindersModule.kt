package com.dagger2.di

import com.dagger2.ui.MainActivity
import com.dagger2.ui.SecondActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindersModule {


  @ContributesAndroidInjector
  abstract fun provideMainActivity() : MainActivity

  @ContributesAndroidInjector
  abstract fun provideSecondActivity() : SecondActivity
}