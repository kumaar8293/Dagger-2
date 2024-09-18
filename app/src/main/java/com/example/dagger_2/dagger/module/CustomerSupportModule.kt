package com.example.dagger_2.dagger.module

import com.example.dagger_2.repository.CustomerCallSupport
import com.example.dagger_2.repository.CustomerSupportService
import dagger.Module
import dagger.Provides

@Module
class CustomerSupportModule {

    @Provides
    fun provideCustomerCallSupport() :CustomerSupportService{
        return CustomerCallSupport()
    }
}