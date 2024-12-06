package com.example.dagger_2.sample_project.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger_2.sample_project.models.Products
import com.example.dagger_2.sample_project.repository.ProductRepository
import kotlinx.coroutines.launch

/**
 * We can not make constructor injectable because
 * ViewModelFactory will be responsible to create the SampleViewModel object
 */

class SampleViewModel(private val productRepository: ProductRepository) : ViewModel() {

    val productsLiveData: LiveData<Products>
        get() = productRepository.products

    init {
        viewModelScope.launch {
            productRepository.getProducts()
        }
    }
}