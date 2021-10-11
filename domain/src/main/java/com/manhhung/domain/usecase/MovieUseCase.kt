package com.manhhung.domain.usecase

import com.manhhung.domain.IMovieUseCase
import com.manhhung.domain.models.Movie
import com.manhhung.domain.repository.MovieRepository

class MovieUseCase(
    private val repo: MovieRepository
) : IMovieUseCase {
    override suspend fun getMovies(): List<Movie> =
        repo.getMovies()
}
