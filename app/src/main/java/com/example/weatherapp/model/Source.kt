package com.example.weatherapp.model


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("crawl_rate")
    val crawlRate: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)