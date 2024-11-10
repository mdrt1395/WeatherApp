package com.example.domain.repository

import com.example.domain.util.Resource
import com.example.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat:Double, long: Double): Resource<WeatherInfo>
}