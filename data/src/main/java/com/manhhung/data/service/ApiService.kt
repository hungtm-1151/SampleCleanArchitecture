package com.manhhung.data.service

import com.manhhung.data.response.MovieResponse
import retrofit2.http.GET

interface ApiService {
    @GET("movie/popular?api_key=8f4464d353e943f2c418c0fd14062822")
    suspend fun getMovies(): MovieResponse
}