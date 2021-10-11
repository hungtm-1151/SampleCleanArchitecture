package com.manhhung.domain

import com.manhhung.domain.models.Movie

interface IMovieUseCase {
    suspend fun getMovies(): List<Movie>
}