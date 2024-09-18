package com.example.dagger_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_2.repository.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var registrationService: UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val registrationComponent =
            (application as MyApplication).appComponent.getUserRegistrationComponentFactory().create(12)
        registrationComponent.inject(this)
        registrationService.registerUser("abcd@gmail.com", "Lensa")
    }
}