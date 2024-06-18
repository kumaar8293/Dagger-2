package com.example.dagger_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_2.dagger.DaggerB_UserRegistrationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var registrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val registrationComponent = DaggerB_UserRegistrationComponent.builder().build()
        registrationComponent.inject(this)
        registrationService.registerUser("abcd@gmail.com", "Lensa")
        emailService.sendEmail("abc@gmail.com", "abcd@gmail.com","Email sent")
    }
}