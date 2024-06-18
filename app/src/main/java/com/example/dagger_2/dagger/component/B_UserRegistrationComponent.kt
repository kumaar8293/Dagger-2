package com.example.dagger_2.dagger.component

import com.example.dagger_2.MainActivity
import com.example.dagger_2.dagger.module.NotificationServiceModule
import com.example.dagger_2.dagger.module.UserRepositoryModule
import com.example.dagger_2.repository.NotificationService
import dagger.Component

@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface B_UserRegistrationComponent {
    /**
     * Suppose we any class need many dependencies, then it’s
     * hard to maintain inside a component file.
     */
    fun inject(mainActivity: MainActivity)
}