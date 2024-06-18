package com.example.dagger_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_2.dagger.component.DaggerB_UserRegistrationComponent
import com.example.dagger_2.repository.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var registrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val registrationComponent = DaggerB_UserRegistrationComponent.builder().build()
        registrationComponent.inject(this)
        registrationService.registerUser("abcd@gmail.com", "Lensa")
    }
}