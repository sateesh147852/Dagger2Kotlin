package com.dagger2.utilites

import android.content.Context
import android.net.ConnectivityManager

class Utility {

  fun isNetworkAvailable(context: Context): Boolean {
    val connectivityManager: ConnectivityManager =
      context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo = connectivityManager.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
  }

  fun getNames(): MutableList<String> {

    val names: MutableList<String> = mutableListOf<String>()
    names.add("Dhoni")
    names.add("ruturaj")
    names.add("faf")
    names.add("Robin")
    names.add("Moen")
    names.add("Raina")
    names.add("Rayidu")
    names.add("Bravo")
    names.add("Thakur")
    names.add("Deepak")
    names.add("Josh")
    names.add("jadeja")
    names.add("watson")
    names.add("curun")
    return names
  }


}