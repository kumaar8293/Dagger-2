package com.example.dagger_2.repository

import javax.inject.Inject

interface AnalyticsService  {
    fun trackEvent(name :String , type : String)
}

class FirebaseAnalytics  : AnalyticsService{
    override fun trackEvent(name: String, type: String) {
       println("LENSA FirebaseAnalytics $name and $type")
    }
}

class MixPanel : AnalyticsService{
    override fun trackEvent(name: String, type: String) {
        println("LENSA MixPanel $name and $type")
    }
}