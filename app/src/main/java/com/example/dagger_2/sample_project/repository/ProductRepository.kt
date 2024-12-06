package com.example.dagger_2.sample_project.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dagger_2.sample_project.models.Products
import com.example.dagger_2.sample_project.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerApi: FakerApi) {

    private val _products = MutableLiveData<Products>()
    val products: LiveData<Products>
        get() = _products

    suspend fun getProducts() {
        val result = fakerApi.getProducts()
        if (result.isSuccessful && result.body().isNullOrEmpty().not()) {
            _products.postValue(result.body())
        }
    }
}