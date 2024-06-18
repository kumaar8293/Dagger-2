package com.example.dagger_2.repository

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {
    fun registerUser(
        email: String,
        password: String
    ) {
        userRepository.saveUser(email, password)
        notificationService.sendTo(
            email,
            "abc@gmail.com",
            "User registered"
        )
    }
}