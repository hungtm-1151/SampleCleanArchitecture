package com.manhhung.movieclean.entity

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MoviePresentation(
    val id: Int,
    val poster: String
) : Parcelable {
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<MoviePresentation>() {
            override fun areItemsTheSame(oldItem: MoviePresentation, newItem: MoviePresentation) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: MoviePresentation, newItem: MoviePresentation) =
                oldItem == newItem
        }
    }
}
