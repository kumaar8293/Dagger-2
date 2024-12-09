package com.example.dagger_2.sample_project.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.dagger_2.sample_project.Dummy
import com.example.dagger_2.sample_project.repository.ProductRepository
import javax.inject.Inject


class SampleViewModel2 @Inject constructor(
    private val productRepository: ProductRepository,
    private val dummy: Dummy,
    private  val ab :ABC
) : ViewModel() {

    init {
        ab.print()
    }
}

class  ABC @Inject constructor(){

    fun print(){
        println("LENSA dfsdfdsfgs")
    }
}