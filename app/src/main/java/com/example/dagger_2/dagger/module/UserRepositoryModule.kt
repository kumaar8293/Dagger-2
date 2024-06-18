package com.example.dagger_2.dagger.module

import com.example.dagger_2.repository.FirebaseRepository
import com.example.dagger_2.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {
    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }
}