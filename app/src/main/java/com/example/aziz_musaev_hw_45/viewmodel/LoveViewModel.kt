package com.example.aziz_musaev_hw_45.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.aziz_musaev_hw_45.remote.LoveModel
import com.example.aziz_musaev_hw_45.repository.Repository

class LoveViewModel: ViewModel() {
    private val repository = Repository()

    fun getLiveLove(firstName:String ,secondName: String): LiveData<LoveModel>{
        return repository.getLove(firstName,secondName)
    }
}