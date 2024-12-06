package com.example.dagger_2.sample_project.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dagger_2.sample_project.repository.ProductRepository
import javax.inject.Inject

class SampleViewModelFactory @Inject constructor(private val productRepository: ProductRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SampleViewModel(productRepository) as T
    }
}