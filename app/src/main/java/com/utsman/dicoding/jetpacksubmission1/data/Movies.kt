package com.utsman.dicoding.jetpacksubmission1.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movies(val id: String,
                  val title: String,
                  val release_date: String,
                  val score: Double,
                  val poster: String,
                  val overview: String,
                  val lang: String,
                  val runtime: String,
                  val genre: String,
                  val cast: List<Cast>) : Parcelable

@Parcelize
data class Cast(val name: String,
                val character: String,
                val photo: String) : Parcelable