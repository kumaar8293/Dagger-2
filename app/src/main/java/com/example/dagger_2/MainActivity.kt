package com.example.dagger_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_2.dagger.DaggerA_UserRegistrationComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userRegistrationService =
            DaggerA_UserRegistrationComponent.builder().build().provideUserRegistrationService()
        userRegistrationService.registerUser("abcd@gmail.com", "Lensa")
    }
}