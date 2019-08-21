package com.utsman.dicoding.jetpacksubmission1.viewmodel

import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.utsman.dicoding.jetpacksubmission1.data.Movies
import com.utsman.dicoding.jetpacksubmission1.data.moviesData
import com.utsman.dicoding.jetpacksubmission1.data.showsData


class MainViewModel : ViewModel() {

    fun getMovieData(type: String): List<Movies> {
        val dataString = dataString(type)
        val typeModel = object : TypeToken<List<Movies>>() {}.type

        return Gson().fromJson(dataString, typeModel)
    }

    private fun dataString(type: String): String {
        return if (type.contains("movie")) {
            moviesData
        } else {
            showsData
        }
    }
}