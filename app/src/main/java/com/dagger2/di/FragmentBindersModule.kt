package com.dagger2.di

import com.dagger2.ui.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindersModule {


  @ContributesAndroidInjector
  abstract fun providerHomeFragment() : HomeFragment
}