package com.dagger2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dagger2.R
import com.dagger2.adapter.NamesAdapter
import com.dagger2.databinding.ActivitySecondBinding
import com.dagger2.utilites.Utility
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SecondActivity : DaggerAppCompatActivity() {

  private lateinit var binding: ActivitySecondBinding

  @Inject
  lateinit var namesAdapter: NamesAdapter

  @Inject
  lateinit var utility: Utility



  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivitySecondBinding.inflate(layoutInflater)
    setContentView(binding.root)

    setRecyclerView()
  }

  private fun setRecyclerView() {
    val linearLayoutManager = LinearLayoutManager(this)
    binding.rvItems.layoutManager = linearLayoutManager
    binding.rvItems.adapter = namesAdapter
    namesAdapter.setNames(utility.getNames())
  }
}