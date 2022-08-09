package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityCh2MainBinding

class Ch2_MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCh2MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ch2_main)
        binding.activity = this@Ch2_MainActivity
    }

    fun btnClick(view : View) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}