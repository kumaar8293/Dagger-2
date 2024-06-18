package com.example.dagger_2.dagger.component

import com.example.dagger_2.MainActivity
import com.example.dagger_2.dagger.module.NotificationServiceModule
import com.example.dagger_2.dagger.module.UserRepositoryModule
import com.example.dagger_2.repository.NotificationService
import dagger.BindsInstance
import dagger.Component

@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface B_UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): B_UserRegistrationComponent
    }
}