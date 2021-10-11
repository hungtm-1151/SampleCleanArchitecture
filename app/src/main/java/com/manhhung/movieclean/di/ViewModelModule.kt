package com.manhhung.movieclean.di

import com.manhhung.movieclean.movieScreen.MovieViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
}