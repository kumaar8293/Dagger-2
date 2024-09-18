package com.example.dagger_2.dagger.component

import com.example.dagger_2.dagger.module.AnalyticsModule
import com.example.dagger_2.repository.AnalyticsService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getAnalyticsService(): AnalyticsService
}