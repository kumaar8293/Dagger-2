package com.example.dagger_2.dagger.module

import com.example.dagger_2.dagger.annotation.SMSAnnotation
import com.example.dagger_2.repository.EmailService
import com.example.dagger_2.repository.NotificationService
import com.example.dagger_2.repository.SMSService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule(private val retryCount :Int) {
    /**
     * Suppose we want to have both Notification service, then we have to use Qualifier
     * We have 2 option, one is as  @Named("email") and second is create your own @SMSAnnotation
     */
    @SMSAnnotation
    @Provides
    fun provideSmsService(): NotificationService {
        return SMSService(retryCount)
    }

    @Named("email")
    @Provides
    fun provideEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}