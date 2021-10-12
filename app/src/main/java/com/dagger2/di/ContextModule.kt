package com.dagger2.di

import android.content.Context
import com.dagger2.utilites.AppController
import dagger.Binds
import dagger.Module

@Module
interface ContextModule {

  @Binds
  fun provideContext(appController: AppController): Context
}