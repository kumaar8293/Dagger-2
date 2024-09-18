package com.example.dagger_2.repository

import com.example.dagger_2.dagger.annotation.ActivityScope
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun sendTo(to: String, from: String, body: String)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun sendTo(to: String, from: String, body: String) {
        println("LENSA sendEmail $to from $from body $body")
    }
}

class SMSService(private val retryCount: Int) : NotificationService {
    override fun sendTo(to: String, from: String, body: String) {
        println("LENSA SMS send to $to from $from body $body  retry $retryCount")
    }
}