package com.manhhung.movieclean.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:loadImage")
fun ImageView.loadImage(uri: String?) {
    Glide.with(context)
        .load("https://image.tmdb.org/t/p/w500/$uri")
        .into(this)
}