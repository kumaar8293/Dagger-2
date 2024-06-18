package com.example.dagger_2.repository

import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

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
