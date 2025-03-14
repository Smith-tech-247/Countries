package com.example.walmartapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.walmartapp.CountryTypeConverter
import com.example.walmartapp.model.Country

@TypeConverters(CountryTypeConverter::class)
@Database(entities = [Country::class], version = 1)
abstract class CountryDB : RoomDatabase() {

    // DAO
    abstract val countryDao: CountryDao
}