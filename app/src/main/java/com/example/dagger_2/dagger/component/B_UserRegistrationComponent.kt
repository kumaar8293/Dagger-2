package com.example.dagger_2.dagger.component

import com.example.dagger_2.MainActivity
import com.example.dagger_2.dagger.annotation.ActivityScope
import com.example.dagger_2.dagger.module.AnalyticsModule
import com.example.dagger_2.dagger.module.CustomerSupportModule
import com.example.dagger_2.dagger.module.NotificationServiceModule
import com.example.dagger_2.dagger.module.UserRepositoryModule
import com.example.dagger_2.repository.NotificationService
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent(
    modules = [NotificationServiceModule::class,
        UserRepositoryModule::class,
        CustomerSupportModule::class]
)
interface B_UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    /**
     * To Achieve Builder pattern we need 3 steps to implement it
     * 1. Use @Subcomponent.Builder annotation
     * 2. build  -----> Component
     * 3. methods --------> Builder
     */
    @Subcomponent.Builder
    interface Builder {
        fun build() : B_UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int): Builder
    }
}