package com.utsman.dicoding.jetpacksubmission1.viewmodel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {
    private val genreSample = "action, science fiction, thriller, adventure"
    private lateinit var detailViewModel: DetailViewModel

    @Before
    fun setup() {
        detailViewModel = DetailViewModel()
    }

    @Test
    fun getChipGenre() {
        assertEquals(4, detailViewModel.getChipGenre(genreSample).size)
    }
}