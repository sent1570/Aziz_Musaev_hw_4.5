package com.example.aziz_musaev_hw_45

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.findNavController
import com.example.aziz_musaev_hw_45.databinding.ActivityMainBinding
import com.example.aziz_musaev_hw_45.viewmodel.LoveViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}