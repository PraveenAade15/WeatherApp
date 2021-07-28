package com.example.weatherapp.Repository

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.weatherapp.model.Location
import com.example.weatherapp.model.WeatherResponse
import com.example.weatherapp.network.BASE_URL
import com.example.weatherapp.network.WeatherNetwork
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SearchActivityRepository ( val application: Application){

    val showProgress=MutableLiveData<Boolean>()
    fun changeState(){
        showProgress.value=!(showProgress.value!=null && showProgress.value!!)

    }
    fun SearchLocation(searchString: String)

    {
        showProgress.value=true
        //Networkcall
        val retrofit=Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        val service=retrofit.create(WeatherNetwork::class.java)
       service.getWeather("2427032").enqueue(object : Callback<WeatherResponse> {
           override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
              Log.d("SearchRepository","Response:${Gson().toJson(response.body())}")
               showProgress.value = false


           }

           override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
               showProgress.value = false
               Toast.makeText(application, "Error while accessing the API", Toast.LENGTH_SHORT).show()

           }

       })


    }


}