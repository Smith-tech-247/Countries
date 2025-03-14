package com.example.walmartapp

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.walmartapp.model.Country
import com.example.walmartapp.ui.screens.CountryDataLayout
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith



@OptIn(ExperimentalTestApi::class)
@RunWith(AndroidJUnit4::class)
class CountryDataLayoutKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun countryDataLayout_displaysCorrectCountryDetails() {
        // Sample Country Data
        val sampleCountry = Country(
            name = "France",
            region = "Europe",
            code = "FR",
            capital = "Paris"
        )

        // Set the Composable content
        composeTestRule.setContent {
            CountryDataLayout(sampleCountry)
        }

        // Verify if country name is displayed
        composeTestRule.onNodeWithText("France,").assertExists()

        // Verify if region is displayed
        composeTestRule.onNodeWithText("Europe").assertExists()

        // Verify if country code is displayed
        composeTestRule.onNodeWithText(" FR").assertExists()

        // Verify if capital is displayed
        composeTestRule.onNodeWithText(" Paris").assertExists()
    }

    @Test
    fun countryDataLayout_handlesLongTextCorrectly() {
        val longCountry = Country(
            name = "The United Kingdom of Great Britain and Northern Ireland",
            region = "Europe",
            code = "GB",
            capital = "London"
        )

        composeTestRule.setContent {
            CountryDataLayout(longCountry)
        }

        // Verify if long country name is displayed correctly
        composeTestRule.onNodeWithText("The United Kingdom of Great Britain and Northern Ireland,")
            .assertExists()

        // Verify if capital is displayed correctly
        composeTestRule.onNodeWithText(" London").assertExists()
    }
}