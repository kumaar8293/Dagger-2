package com.example.dagger_2.sample_project.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.dagger_2.sample_project.ui.activity.SampleActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Component.Factory
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class, DatabaseModule::class, ViewmodelModule::class])
interface ApplicationComponent {

    fun inject(sampleActivity: SampleActivity)

    fun getMap(): Map<Class<*>, ViewModel>

    /**
     * Since to create Database object we need Context and pass the Context we will be using
     * Factory pattern to get the Context as a parameter
     */

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}