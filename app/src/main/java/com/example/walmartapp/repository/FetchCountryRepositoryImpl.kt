package com.example.walmartapp.repository

import com.example.walmartapp.apiservice.ApiService
import com.example.walmartapp.model.Country
import com.example.walmartapp.room.CountryDao
import javax.inject.Inject

class FetchCountryRepositoryImpl @Inject constructor(
    private val countryDao: CountryDao,
    private val apiService: ApiService
) : FetchCountryRepository {
    override suspend fun fetchCountriesFromApi(): List<Country> {
        return apiService.getCountries()
    }

    override suspend fun fetchCountriesFromDB(): List<Country> {
        return countryDao.getAllCountries()
    }

    override  suspend fun getCountryCountFromDB(): Int {
       return countryDao.getCountryCountFromTable()
    }

    override suspend fun insertCountriesIntoDB(countries: List<Country>) {
        return countryDao.insertItemList(countries)
    }

}