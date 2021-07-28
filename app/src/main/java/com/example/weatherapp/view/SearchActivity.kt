package com.example.weatherapp.view

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.R
import com.example.weatherapp.viewModel.searchActivityViewModel


class SearchActivity : AppCompatActivity() {
    private lateinit var viewModel :searchActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        viewModel=ViewModelProvider(this).get(searchActivityViewModel::class.java)


        val searchImage: ImageView = findViewById(R.id.iv_set)
        val searchProgressbar:ProgressBar=findViewById(R.id.search_progress)
        val searchEdit:EditText=findViewById(R.id.et_search)
        searchImage.setOnClickListener {
            //if (searchEdit.text!!.isNotEmpty)
            viewModel.SearchLocation(searchEdit.text.toString())

        }
        viewModel.showProgress.observe(this, Observer {
            if (it){
                searchProgressbar.visibility=VISIBLE

            }
            else{
                searchProgressbar.visibility=GONE
            }
        })



    }
}