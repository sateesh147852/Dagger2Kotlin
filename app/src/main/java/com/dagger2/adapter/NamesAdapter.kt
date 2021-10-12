package com.dagger2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dagger2.databinding.NamesItemBinding

class NamesAdapter : RecyclerView.Adapter<NamesAdapter.NamesViewHolder>() {

  private  var names = mutableListOf<String>()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
    val binding = NamesItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return NamesViewHolder(binding)
  }

  public fun setNames(names : MutableList<String>) {
    this.names = names
  }

  override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
    holder.binding.tvName.text = names[position]
  }

  override fun getItemCount(): Int {
    return names?.size ?: 0
  }


  class NamesViewHolder(val binding: NamesItemBinding) : RecyclerView.ViewHolder(binding.root)
}