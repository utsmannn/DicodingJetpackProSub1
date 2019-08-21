package com.utsman.dicoding.jetpacksubmission1.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import com.google.android.material.chip.Chip
import com.utsman.dicoding.jetpacksubmission1.R
import com.utsman.dicoding.jetpacksubmission1.data.Movies
import com.utsman.dicoding.jetpacksubmission1.data.loadWithGlide
import com.utsman.dicoding.jetpacksubmission1.ui.adapter.CastMovieAdapter
import com.utsman.dicoding.jetpacksubmission1.viewmodel.DetailViewModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private val movie by lazy {
        intent.getParcelableExtra<Movies>("movie")
    }

    private val detailViewModel by lazy {
        ViewModelProviders.of(this)[DetailViewModel::class.java]
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        toolbar.setNavigationOnClickListener { onBackPressed() }

        img_poster.loadWithGlide(movie.poster)
        text_title.text = movie.title
        text_rating.text = movie.score.toString()
        text_release_date.text = movie.release_date
        text_lang.text = "Language: ${movie.lang}"
        text_runtime.text = movie.runtime
        text_overview.text = movie.overview

        recycler_view_cast.layoutManager = LinearLayoutManager(this)
        recycler_view_cast.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))
        recycler_view_cast.adapter = CastMovieAdapter(movie.cast)

        detailViewModel.getChipGenre(movie.genre).map {genre ->
            val chip = Chip(this)
            chip.text = genre
            chip_genre.addView(chip)
        }
    }
}