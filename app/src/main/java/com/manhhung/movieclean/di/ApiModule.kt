package com.manhhung.movieclean.di

import com.manhhung.data.service.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single {
        get<Retrofit>().create(ApiService::class.java)
    }
}