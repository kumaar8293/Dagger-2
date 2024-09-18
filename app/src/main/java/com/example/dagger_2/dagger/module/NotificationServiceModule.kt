package com.example.dagger_2.dagger.module

import com.example.dagger_2.dagger.annotation.ActivityScope
import com.example.dagger_2.dagger.annotation.SMSAnnotation
import com.example.dagger_2.repository.EmailService
import com.example.dagger_2.repository.NotificationService
import com.example.dagger_2.repository.SMSService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule {
    @ActivityScope
    @SMSAnnotation
    @Provides
    fun provideSmsService(retryCount :Int): NotificationService {
        return SMSService(retryCount)
    }
    @ActivityScope
    @Named("email")
    @Provides
    fun provideEmailService(emailService: EmailService): NotificationService {
        /**
         * Since we already marked EmailService class as singleton,
         * we don't need to annotate here,
         * But encase if we are not able to access EmailService
         * class directly then we can annotate here as well.
         */
        return emailService
    }
}