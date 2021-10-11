package com.manhhung.movieclean.di

import com.manhhung.domain.IMovieUseCase
import com.manhhung.domain.usecase.MovieUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single<IMovieUseCase> { MovieUseCase(get()) }
}