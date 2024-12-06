package com.example.dagger_2

import android.app.Application
import com.example.dagger_2.dagger.component.AppComponent
import com.example.dagger_2.dagger.component.DaggerAppComponent
import com.example.dagger_2.sample_project.di.ApplicationComponent
import com.example.dagger_2.sample_project.di.DaggerApplicationComponent
import dagger.Component

class MyApplication : Application() {
    lateinit var appComponent: AppComponent
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}