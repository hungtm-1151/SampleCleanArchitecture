package com.manhhung.domain.repository

import com.manhhung.domain.models.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>
}
