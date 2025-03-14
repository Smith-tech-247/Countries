package com.example.walmartapp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.walmartapp.model.Country

@Dao
interface CountryDao {
    @Insert
    suspend fun insertItemList(items: List<Country>)

    @Query("SELECT * FROM country_table ORDER BY name ")
    suspend fun getAllCountries(): List<Country>

    @Query("SELECT * FROM country_table WHERE name = :name")
    suspend fun getCountryFromList(name: Int): List<Country>

    @Query("SELECT COUNT(*) FROM country_table")
    suspend fun getCountryCountFromTable(): Int
}