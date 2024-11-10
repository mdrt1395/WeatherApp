package com.example.data.repository

import com.example.data.mappers.toWeatherInfo
import com.example.data.remote.WeatherApi
import com.example.domain.repository.WeatherRepository
import com.example.domain.util.Resource
import com.example.domain.weather.WeatherInfo
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (
            e: Exception
        ){
            e.printStackTrace()
            Resource.Error(e.message?: "An unknown error ocurred")
        }
    }
}