package com.example.dagger_2

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {
    fun registerUser(
        email: String,
        password: String
    ) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(
            email,
            "abc@gmail.com",
            "User registered"
        )
    }
}