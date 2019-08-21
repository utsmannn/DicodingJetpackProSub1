package com.utsman.dicoding.jetpacksubmission1.viewmodel

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {
    private lateinit var mainViewModel: MainViewModel

    @Before
    fun setup() {
        mainViewModel = MainViewModel()
    }

    @Test
    fun getMovie() {
        assertEquals(11, mainViewModel.getMovieData("movie").size)
        assertEquals(10, mainViewModel.getMovieData("show").size)
    }
}