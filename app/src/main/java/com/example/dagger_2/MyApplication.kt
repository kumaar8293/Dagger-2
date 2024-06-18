package com.example.dagger_2

import android.app.Application
import com.example.dagger_2.dagger.component.B_UserRegistrationComponent
import com.example.dagger_2.dagger.component.DaggerB_UserRegistrationComponent

class MyApplication : Application() {
    lateinit var userRegistrationComponent: B_UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerB_UserRegistrationComponent.factory().create(10)
    }
}