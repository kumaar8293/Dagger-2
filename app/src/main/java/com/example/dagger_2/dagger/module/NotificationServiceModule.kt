package com.example.dagger_2.dagger.module

import com.example.dagger_2.repository.EmailService
import com.example.dagger_2.repository.NotificationService
import com.example.dagger_2.repository.SMSService
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    /**
     * NotificationService needs to be bind with an implementation class.
     * SMSService constructor is not injected, so we can use @Provides to provide the object
     * SMSService will get binds with NotificationService
     */

    @Provides
    fun provideSmsService(): NotificationService {
        return SMSService()
    }

    /**
     * Here EmailService is already injected by constructor, we can bind it directly to the NotificationService
     * But we need to make the function abstract and if function is abstract, we need
     * to make  NotificationServiceModule class abstract as well.
     *
     * NOTE: A @Module may not contain both non-static and abstract binding methods
     */

    /**
     *   @Provides
     *     fun provideEmailService(emailService: EmailService): NotificationService {
     *         return emailService
     *     }
     *
     * These both functions are equal
     *      @Binds
     *   abstract fun provideEmailService(emailService: EmailService):NotificationService
     *
     *   NOTE: We can't 2 or more  NotificationService , we can either use EmailService or SMSService
     *   Not error: [Dagger/DuplicateBindings] com.example.dagger_2.repository.NotificationService is bound multiple times:
     */
}