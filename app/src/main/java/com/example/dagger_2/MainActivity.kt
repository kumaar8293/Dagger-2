package com.example.dagger_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_2.databinding.ActivityMainBinding
import com.example.dagger_2.repository.UserRegistrationService
import com.example.dagger_2.sample_project.ui.activity.SampleActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var registrationService: UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val registrationComponent =
            (application as MyApplication).appComponent.getUserRegistrationComponentBuilder()
                .retryCount(12).build()
        registrationComponent.inject(this)
        registrationService.registerUser("abcd@gmail.com", "Lensa")
        binding.tv.setOnClickListener {
            startActivity(Intent(this, SampleActivity::class.java))
        }
    }
}