package com.utsman.dicoding.jetpacksubmission1.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.utsman.dicoding.jetpacksubmission1.R
import com.utsman.dicoding.jetpacksubmission1.data.Cast
import com.utsman.dicoding.jetpacksubmission1.data.loadWithGlide
import kotlinx.android.synthetic.main.item_view_cast.view.*

class CastMovieAdapter(private val list: List<Cast>) : RecyclerView.Adapter<CastMovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastMovieViewHolder =
            CastMovieViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_cast, parent, false))

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CastMovieViewHolder, position: Int) {
        val cast = list[position]
        holder.bind(cast)
    }
}


class CastMovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(cast: Cast) = itemView.run {
        img_cast.loadWithGlide(cast.photo)
        text_name.text = cast.name
        text_cast.text = cast.character
    }
}