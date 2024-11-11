package com.example.di

import com.example.data.location.DefaultLocationTracker
import com.example.data.repository.DataRepositoryImpl
import com.example.domain.location.LocationTracker
import com.example.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImpl: DataRepositoryImpl): WeatherRepository
    

}