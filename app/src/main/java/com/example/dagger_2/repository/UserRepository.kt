package com.example.dagger_2.repository

import com.example.dagger_2.dagger.annotation.FirebaseAnalyticsAnnotation
import com.example.dagger_2.dagger.annotation.MixPanelNameAnnotation
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@Singleton
class SQLRepository @Inject constructor(
    private val analyticsService: AnalyticsService
) : UserRepository {
    override fun saveUser(email: String, password: String) {
        println("LENSA saveUser to SQL $email and $password")
        analyticsService.trackEvent("Save-User", "custom-event")
    }
}

class FirebaseRepository(
    private val analyticsService: AnalyticsService,
    private val customerSupport: CustomerSupportService
) : UserRepository {
    override fun saveUser(email: String, password: String) {
        println("LENSA saveUser to firebase $email and $password")
        analyticsService.trackEvent("Save-User", "custom-event")
        customerSupport.connectToCustomerCare("6969696969","Please help")
    }
}
