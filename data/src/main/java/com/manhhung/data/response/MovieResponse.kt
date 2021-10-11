package com.manhhung.data.response

import com.google.gson.annotations.SerializedName
import com.manhhung.data.entity.MovieData

data class MovieResponse(
    @SerializedName("results")
    val results: List<MovieData>
)
