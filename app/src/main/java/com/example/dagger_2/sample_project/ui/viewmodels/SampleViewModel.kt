package com.example.dagger_2.sample_project.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger_2.sample_project.Dummy
import com.example.dagger_2.sample_project.models.Product
import com.example.dagger_2.sample_project.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * If we have multiple parameters to the constructor then it's hard
 * to maintain to change in viewmodel and factory as well
 *
 * In this case we will Inject our viewmodel to the viewmodel factory directly
 *
 * Step 1. Make our viewmodel Injectable
 * Step 2. Change inside viewmodel factory (make viewmodel inject directly)
 */

class SampleViewModel @Inject constructor(
    private val productRepository: ProductRepository,
    private val dummy: Dummy
) : ViewModel() {

    val productsLiveData: LiveData<List<Product>>
        get() = productRepository.products

    init {
        viewModelScope.launch {
            productRepository.getProducts()
            dummy.doSomething()
        }
    }
}