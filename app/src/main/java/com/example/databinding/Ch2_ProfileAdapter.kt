package com.example.databinding

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.Ch2RcyListItemBinding

class Ch2_ProfileAdapter(private val context : Context) : RecyclerView.Adapter<Ch2_ProfileAdapter.ProfileVH>() {
    var data = listOf<Ch2_ProfileData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileVH {
        val binding = Ch2RcyListItemBinding.inflate(
            LayoutInflater.from(context), parent, false
        )
        return ProfileVH(binding)
    }

    override fun onBindViewHolder(holder: ProfileVH, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int = data.size

    class ProfileVH(val binding : Ch2RcyListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data : Ch2_ProfileData) {
            binding.user = data
        }
    }
}