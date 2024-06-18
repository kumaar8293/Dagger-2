package com.example.dagger_2.repository

import javax.inject.Inject

interface NotificationService {
    fun sendTo(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : NotificationService {
    override fun sendTo(to: String, from: String, body: String) {
        println("LENSA sendEmail $to from $from body $body")
    }
}

class SMSService : NotificationService {
    override fun sendTo(to: String, from: String, body: String) {
        println("LENSA SMS send to $to from $from body $body")
    }
}