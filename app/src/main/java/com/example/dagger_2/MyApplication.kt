package com.example.dagger_2

import android.app.Application
import com.example.dagger_2.dagger.component.AppComponent
import com.example.dagger_2.dagger.component.DaggerAppComponent

class MyApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}