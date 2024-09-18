package com.example.dagger_2.dagger.module

import com.example.dagger_2.repository.FirebaseAnalytics
import com.example.dagger_2.repository.FirebaseRepository
import com.example.dagger_2.repository.SQLRepository
import com.example.dagger_2.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserRepositoryModule {
    @Singleton
    @Provides
    fun getFirebaseRepository(analytics: FirebaseAnalytics): UserRepository {
        return FirebaseRepository(analytics)
    }
}