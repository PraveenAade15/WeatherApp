package com.example.weatherapp.Adapter

import android.content.Context
import android.location.Location
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R

class LocationAdapter (private val list: List<Location>,private val context: Context):RecyclerView.Adapter<LocationAdapter.ViewHodler>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationAdapter.ViewHodler {

    }

    override fun onBindViewHolder(holder: LocationAdapter.ViewHodler, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    class ViewHolder(v:View):RecyclerView.ViewHolder(v) {
        val responseTitle: TextView = itemView.findViewById(R.id.tv_location_name)
        val responseSubtitle: TextView = itemView.findViewById(R.id.tv_lat_lng)

    }
}
