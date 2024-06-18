package com.example.dagger_2.repository

import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@Singleton
class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        println("LENSA saveUser to SQL $email and $password")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        println("LENSA saveUser to firebase $email and $password")
    }
}
