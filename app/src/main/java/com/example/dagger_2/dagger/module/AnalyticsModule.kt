package com.example.dagger_2.dagger.module

import com.example.dagger_2.dagger.annotation.FirebaseAnalyticsAnnotation
import com.example.dagger_2.dagger.annotation.MixPanelNameAnnotation
import com.example.dagger_2.repository.AnalyticsService
import com.example.dagger_2.repository.FirebaseAnalytics
import com.example.dagger_2.repository.MixPanel
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
 class AnalyticsModule {
//    @MixPanelNameAnnotation
    @Provides
    fun provideMixPanelAnalyticsService(): AnalyticsService {
        return MixPanel()
    }
//    @Binds
//    @FirebaseAnalyticsAnnotation
//    abstract fun provideFirebaseAnalyticsService(firebaseAnalytics: FirebaseAnalytics): AnalyticsService

}