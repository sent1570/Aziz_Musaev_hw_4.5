package com.example.aziz_musaev_hw_45.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun calculatePercentage(
        @Query("fname")firstName:String,
        @Query("sname")secondName:String,
        @Header("X-RapidAPI-Key") key:String = "12d92d7067mshecd7392487ac803p1bbcd8jsn72e02bf2470c",
        @Header("X-RapidAPI-Host") host:String = "love-calculator.p.rapidapi.com"
    ):Call<LoveModel>
}