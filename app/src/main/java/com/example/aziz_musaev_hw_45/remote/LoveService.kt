package com.example.aziz_musaev_hw_45.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoveService {
   private val retrofit = Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/").addConverterFactory(GsonConverterFactory.create()).build()
var api = retrofit.create(LoveApi::class.java)
}