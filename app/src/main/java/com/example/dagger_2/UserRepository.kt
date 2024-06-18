package com.example.dagger_2

import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String) {
        println("LENSA saveUser $email and $password")
    }
}