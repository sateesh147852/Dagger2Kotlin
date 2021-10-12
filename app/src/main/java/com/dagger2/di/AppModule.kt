package com.dagger2.di

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.dagger2.adapter.NamesAdapter
import com.dagger2.utilites.Utility
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AppModule {

  @Provides
  @Named("FirstName")
  fun getName(): String {
    return "Sateesh"
  }

  @Provides
  @Named("LastName")
  fun getLastName(): String = "Chikkalagi"

  @Provides
  fun getRequestManager(context: Context): RequestManager {
    return Glide.with(context)
  }

  @Provides
  fun getUtility(): Utility {
    return Utility()
  }

  @Provides
  fun getNamesAdapter(): NamesAdapter {
    return NamesAdapter()
  }


}