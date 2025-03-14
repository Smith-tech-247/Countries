package com.example.walmartapp.di


import com.example.walmartapp.repository.FetchCountryRepository
import com.example.walmartapp.repository.FetchCountryRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindFetchCountryRepository(impl: FetchCountryRepositoryImpl): FetchCountryRepository
}