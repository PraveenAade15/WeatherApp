package com.example.weatherapp.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.weatherapp.Repository.DetailsActivityRepository

class DetailsActivityViewModel (application: Application):AndroidViewModel(application){

val repository=DetailsActivityRepository(application)
}