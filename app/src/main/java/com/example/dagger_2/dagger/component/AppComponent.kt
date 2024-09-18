package com.example.dagger_2.dagger.component

import com.example.dagger_2.dagger.module.AnalyticsModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationComponentFactory() : B_UserRegistrationComponent.Factory
}