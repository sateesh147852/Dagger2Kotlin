package com.dagger2.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.bumptech.glide.RequestManager
import com.dagger2.databinding.ActivityMainBinding
import com.dagger2.utilites.Utility
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named

class MainActivity : DaggerAppCompatActivity() {

  private val TAG: String = "MainActivity"

  @field:[Inject Named("FirstName")]
  lateinit var firstName: String

  @field:[Inject Named("LastName")]
  lateinit var lastName: String

  @Inject
  lateinit var requestManager: RequestManager

  @Inject
  lateinit var utility: Utility

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    loadImage()
    printNames()
    loadFragment()
    setOnClickListener()
  }

  private fun setOnClickListener() {
    binding.button.setOnClickListener {
      startActivity(Intent(this,SecondActivity::class.java))
    }
  }

  private fun loadFragment() {
    supportFragmentManager.beginTransaction()
      .replace(binding.flContainer.id, HomeFragment.newInstance())
      .addToBackStack(null)
      .commit()
  }

  private fun printNames() {
    Log.i(TAG, "onCreate: $firstName  $lastName")
  }

  private fun loadImage() {
    requestManager.load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFZbPduh7DVvaSplCeCQZdmv8FwlXgyqZkDw&usqp=CAU")
      .into(binding.ivImageView)

    if (utility.isNetworkAvailable(this))
      Toast.makeText(this,"Internet is available",Toast.LENGTH_SHORT).show()
    else
      Toast.makeText(this,"Internet is not available",Toast.LENGTH_SHORT).show()

  }
}