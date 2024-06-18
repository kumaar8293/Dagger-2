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
class NotificationServiceModule {
    @SMSAnnotation
    @Provides
    fun provideSmsService(retryCount :Int): NotificationService {
        return SMSService(retryCount)
    }

    @Named("email")
    @Provides
    fun provideEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}