package com.example.dagger_2.sample_project.di

import com.example.dagger_2.sample_project.ui.activity.SampleActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(sampleActivity: SampleActivity)
}