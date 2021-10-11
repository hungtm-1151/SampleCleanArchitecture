package com.manhhung.data.entity

import com.google.gson.annotations.SerializedName

data class MovieData(
    @SerializedName("id")
    val id: Int,
    @SerializedName("poster_path")
    val poster: String,
)
