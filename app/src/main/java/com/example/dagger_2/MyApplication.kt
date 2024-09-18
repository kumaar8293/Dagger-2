package com.example.dagger_2

import android.app.Application
import com.example.dagger_2.dagger.component.AppComponent
import com.example.dagger_2.dagger.component.B_UserRegistrationComponent
import com.example.dagger_2.dagger.component.DaggerAppComponent
import com.example.dagger_2.dagger.component.DaggerB_UserRegistrationComponent

class MyApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}