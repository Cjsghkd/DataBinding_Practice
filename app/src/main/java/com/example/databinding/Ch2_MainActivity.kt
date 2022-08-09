package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databinding.databinding.ActivityCh2MainBinding

class Ch2_MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCh2MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ch2_main)
        binding.activity = this@Ch2_MainActivity
        setRcv()
    }

    fun btnClick(view : View) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }

    fun setRcv() {
        val profileAdapter = Ch2_ProfileAdapter(this)
        binding.mainRcv.layoutManager = LinearLayoutManager(this)
        binding.mainRcv.adapter = profileAdapter
        profileAdapter.data = listOf(
            Ch2_ProfileData(name = "Kang", age = 26),
            Ch2_ProfileData(name = "Kim", age = 25),
            Ch2_ProfileData(name = "Park", age = 18)
        )
        profileAdapter.notifyDataSetChanged()
    }
}