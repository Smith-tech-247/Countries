package com.example.walmartapp.di

import android.content.Context
import androidx.room.Room
import com.example.walmartapp.room.CountryDB
import com.example.walmartapp.room.CountryDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): CountryDB {
        return Room.databaseBuilder(
            context = context,
            CountryDB::class.java,
            "country_db"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideCountryDao(countryDB: CountryDB): CountryDao {
        return countryDB.countryDao
    }
}