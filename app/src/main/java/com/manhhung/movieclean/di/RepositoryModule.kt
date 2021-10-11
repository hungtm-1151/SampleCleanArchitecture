package com.manhhung.movieclean.di

import com.manhhung.data.repository.MovieRepositoryImpl
import com.manhhung.domain.repository.MovieRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
}