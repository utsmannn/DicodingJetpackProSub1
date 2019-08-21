package com.utsman.dicoding.jetpacksubmission1.viewmodel

import androidx.lifecycle.ViewModel

class DetailViewModel : ViewModel() {

    fun getChipGenre(genre: String): List<String> {
        return genre.split(",").map { it.trim() }
    }
}