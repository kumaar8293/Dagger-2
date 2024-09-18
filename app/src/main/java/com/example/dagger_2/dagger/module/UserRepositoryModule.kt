package com.example.dagger_2.dagger.module

import com.example.dagger_2.dagger.annotation.ActivityScope
import com.example.dagger_2.repository.AnalyticsService
import com.example.dagger_2.repository.CustomerSupportService
import com.example.dagger_2.repository.FirebaseAnalytics
import com.example.dagger_2.repository.FirebaseRepository
import com.example.dagger_2.repository.SQLRepository
import com.example.dagger_2.repository.UserRepository
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserRepositoryModule {
    @ActivityScope
    @Provides
    fun getFirebaseRepository(
        analytics: AnalyticsService,
        customerSupportService: CustomerSupportService
    ): UserRepository {
        return FirebaseRepository(analytics, customerSupportService)
    }
}