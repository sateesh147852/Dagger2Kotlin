package com.dagger2.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dagger2.R
import com.dagger2.databinding.FragmentHomeBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import javax.inject.Named

class HomeFragment : DaggerFragment() {

  @field:[Inject Named("FirstName")]
  lateinit var name : String

  @field:[Inject Named("LastName")]
  lateinit var lastName: String

  lateinit var binding: FragmentHomeBinding


  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
    binding.tvName.text = "$name $lastName"
    return binding.root
  }

  companion object {

    fun newInstance(): HomeFragment = HomeFragment()

  }
}
