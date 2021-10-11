package com.manhhung.data.repository

import com.manhhung.data.service.ApiService
import com.manhhung.domain.models.Movie
import com.manhhung.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieService: ApiService
) : MovieRepository {

    override suspend fun getMovies(): List<Movie> =
        movieService.getMovies().results.map {
            return@map Movie(
                it.id,
                it.poster
            )
        }
}
