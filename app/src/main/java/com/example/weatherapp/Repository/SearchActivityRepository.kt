package com.example.weatherapp.Repository

import android.app.Application
import androidx.lifecycle.MutableLiveData

class SearchActivityRepository (application: Application){

    val showProgress=MutableLiveData<Boolean>()
    fun changeState(){
        showProgress.value=!(showProgress.value!=null && showProgress.value!!)

    }


}