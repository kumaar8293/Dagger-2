package com.example.dagger_2.dagger.module

import com.example.dagger_2.repository.AnalyticsService
import com.example.dagger_2.repository.MixPanel
import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {
    @Provides
    fun provideMixPanelAnalyticsService(): AnalyticsService {
        return MixPanel()
    }
}