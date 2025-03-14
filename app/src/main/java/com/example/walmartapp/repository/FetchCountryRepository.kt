package com.example.walmartapp.repository

import com.example.walmartapp.model.Country

interface FetchCountryRepository {

    suspend fun fetchCountriesFromApi() : List<Country>

    suspend fun fetchCountriesFromDB() : List<Country>

    suspend fun getCountryCountFromDB() : Int

    suspend fun insertCountriesIntoDB(countries: List<Country>)

}