package com.example.aziz_musaev_hw_45.repository

import android.telecom.Call
import androidx.lifecycle.MutableLiveData
import com.example.aziz_musaev_hw_45.remote.LoveModel
import com.example.aziz_musaev_hw_45.remote.LoveService
import retrofit2.Response
import javax.security.auth.callback.Callback

class Repository {
    fun getLove(firstName:String,secondName:String): MutableLiveData<LoveModel>{
        val liveLoveData = MutableLiveData<LoveModel>()

        LoveService().api.calculatePercentage(firstName, secondName).enqueue(object:retrofit2.Callback<LoveModel>{
            override fun onResponse(call: retrofit2.Call<LoveModel>, response: Response<LoveModel>,
            ) {
                if (response.isSuccessful){
                    liveLoveData.postValue(response.body())
                }
            }

            override fun onFailure(call: retrofit2.Call<LoveModel>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

return liveLoveData
    }
}