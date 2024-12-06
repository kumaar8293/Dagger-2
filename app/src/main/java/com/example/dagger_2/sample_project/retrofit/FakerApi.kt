package com.example.dagger_2.sample_project.retrofit

import com.example.dagger_2.sample_project.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}