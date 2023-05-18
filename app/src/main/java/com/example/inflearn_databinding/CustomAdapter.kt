package com.example.inflearn_databinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.inflearn_databinding.databinding.ItemTextRowBinding

class CustomAdapter(private val dataSet: ArrayList<String>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = ItemTextRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ViewHolder(private val binding: ItemTextRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(item: String) {
            binding.tvText.text = item
        }
    }

}