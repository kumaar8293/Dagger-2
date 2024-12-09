package com.example.dagger_2.sample_project.di

import androidx.lifecycle.ViewModel
import com.example.dagger_2.sample_project.ui.viewmodels.SampleViewModel
import com.example.dagger_2.sample_project.ui.viewmodels.SampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class ViewmodelModule {

    @Binds
    @ClassKey(SampleViewModel::class)
    @IntoMap
    abstract fun sampleViewModelModule(sampleViewModel: SampleViewModel): ViewModel

    @Binds
    @ClassKey(SampleViewModel2::class)
    @IntoMap
    abstract fun sampleViewModelModule2(sampleViewModel2: SampleViewModel2): ViewModel
}