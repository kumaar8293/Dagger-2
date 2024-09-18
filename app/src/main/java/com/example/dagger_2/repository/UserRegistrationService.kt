package com.example.dagger_2.repository

import com.example.dagger_2.dagger.annotation.FirebaseAnalyticsAnnotation
import com.example.dagger_2.dagger.annotation.SMSAnnotation
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @SMSAnnotation private val notificationService: NotificationService
    //@Named("sms") private val notificationService: NotificationService
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