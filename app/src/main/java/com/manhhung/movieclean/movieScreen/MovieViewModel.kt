package com.manhhung.movieclean.movieScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.manhhung.domain.IMovieUseCase
import com.manhhung.domain.usecase.MovieUseCase
import com.manhhung.movieclean.base.BaseViewModel
import com.manhhung.movieclean.entity.MoviePresentation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieViewModel(private val iMovieUseCase: IMovieUseCase) : BaseViewModel() {

    private val _movies = MutableLiveData<List<MoviePresentation>>()
    val movies: LiveData<List<MoviePresentation>> get() = _movies

    init {
        getMovies()
    }

    private fun getMovies() {
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val movieFromApi = iMovieUseCase.getMovies().map {
                MoviePresentation(
                    it.id,
                    it.poster
                )
            }
            _movies.postValue(movieFromApi)
        }
    }
}