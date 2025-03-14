package com.example.walmartapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.walmartapp.model.Country
import com.example.walmartapp.repository.FetchCountryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FetchCountryViewModel @Inject constructor(private val countryRepo: FetchCountryRepository) : ViewModel() {

    var country by mutableStateOf<List<Country>>(emptyList())
        private set

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val countryCountInDB = countryRepo.getCountryCountFromDB()
            if (countryCountInDB > 0) {
                fetchCountriesFromDB()
            } else {
                val onlineCountries = countryRepo.fetchCountriesFromApi()
                countryRepo.insertCountriesIntoDB(onlineCountries)
                fetchCountriesFromDB()
            }
        }
    }

    private fun fetchCountriesFromDB() {
        viewModelScope.launch(Dispatchers.IO) {
             country = countryRepo.fetchCountriesFromDB()
        }
    }
}