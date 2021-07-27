package com.example.weatherapp.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.Repository.SearchActivityRepository

class searchActivityViewModel(application: Application): AndroidViewModel(application) {
    val repository= SearchActivityRepository(application)
    val showProgress:LiveData<Boolean>
    init {
        this.showProgress=repository.showProgress
    }
    fun changeState(){
        repository.changeState()
    }

}