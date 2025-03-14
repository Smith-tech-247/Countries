package com.example.walmartapp

import androidx.room.TypeConverter
import com.example.walmartapp.model.Currency
import com.example.walmartapp.model.Language
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CountryTypeConverter {
    private val gson = Gson()

    //Currency Converters
    @TypeConverter
    fun fromCurrency(currency: Currency?): String {
        return gson.toJson(currency)
    }

    @TypeConverter
    fun toCurrency(currencyString: String?): Currency? {
        return gson.fromJson(currencyString, object : TypeToken<Currency?>() {}.type)
    }

    // Language Converters
    @TypeConverter
    fun fromLanguage(language: Language?): String {
        return gson.toJson(language)
    }

    @TypeConverter
    fun toLanguage(languageString: String?): Language? {
        return gson.fromJson(languageString, object : TypeToken<Language?>() {}.type)
    }
}