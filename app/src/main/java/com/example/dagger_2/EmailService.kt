package com.example.dagger_2

import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(email: String, from: String, body: String) {
        println("LENSA sendEmail $email from $from body $body")
    }
}