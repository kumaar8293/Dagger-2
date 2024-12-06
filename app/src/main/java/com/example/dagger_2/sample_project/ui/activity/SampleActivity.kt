package com.example.dagger_2.sample_project.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dagger_2.MyApplication
import com.example.dagger_2.R
import com.example.dagger_2.databinding.ActivitySampleBinding
import com.example.dagger_2.sample_project.models.Products
import com.example.dagger_2.sample_project.ui.viewmodels.SampleViewModel
import com.example.dagger_2.sample_project.ui.viewmodels.SampleViewModelFactory
import javax.inject.Inject


class SampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySampleBinding
    lateinit var sampleViewModel: SampleViewModel

    @Inject
    lateinit var sampleViewModelFactory: SampleViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewModel()
        viewModelObserver()
    }

    private fun initViewModel() {
        (application as MyApplication).applicationComponent.inject(this)
        sampleViewModel =
            ViewModelProvider(this, sampleViewModelFactory)[SampleViewModel::class.java]
    }

    private fun viewModelObserver() {
        sampleViewModel.productsLiveData.observe(this) { products: Products ->
            binding.tvContent.text = products.joinToString {
                product -> product.title + "\n\n"
            }
        }
    }
}