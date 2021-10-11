package com.manhhung.movieclean

import android.app.Application
import com.manhhung.movieclean.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                listOf(
                    networkModule,
                    apiModule,
                    viewModelModule,
                    repositoryModule,
                    useCaseModule
                )
            )
        }
    }
}