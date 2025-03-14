package com.example.walmartapp.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.walmartapp.viewmodel.FetchCountryViewModel


@Composable
fun CountryUi(viewModel: FetchCountryViewModel = hiltViewModel(), modifier: Modifier) {
    val countries = viewModel.country

    LazyColumn(modifier = modifier) {

            items(countries.size){
                CountryDataLayout(countries[it])
            }
    }
}