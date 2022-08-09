package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityCh1MainBinding

class Ch1_MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCh1MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ch1_main)
        binding.user = Ch1_UserProfile("소영", "이")
    }
}