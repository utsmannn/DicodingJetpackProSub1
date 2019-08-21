package com.utsman.dicoding.jetpacksubmission1.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.utsman.dicoding.jetpacksubmission1.data.Movies
import com.utsman.dicoding.jetpacksubmission1.R
import com.utsman.dicoding.jetpacksubmission1.data.loadWithGlide
import com.utsman.dicoding.jetpacksubmission1.ui.DetailActivity
import kotlinx.android.synthetic.main.item_view.view.*

class MainMovieAdapter(private val list: List<Movies>) : RecyclerView.Adapter<MainMovieHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainMovieHolder =
            MainMovieHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MainMovieHolder, position: Int) {
        val movie = list[position]
        holder.bind(movie)
    }
}

class MainMovieHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(movies: Movies) = itemView.run {
        val imgUrl = movies.poster
        val title = movies.title
        val releaseDate = movies.release_date
        val rate = movies.score

        img_poster.loadWithGlide(imgUrl)
        text_title.text = title
        text_release_date.text = releaseDate
        text_rating.text = rate.toString()

        setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("movie", movies)
            }

            context.startActivity(intent)
        }
    }
}