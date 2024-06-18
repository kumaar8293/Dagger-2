package com.example.dagger_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_2.dagger.component.DaggerB_UserRegistrationComponent
import com.example.dagger_2.repository.EmailService
import com.example.dagger_2.repository.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var registrationService: UserRegistrationService

    /**
     * emailService and emailService1 both have different hashcode
     * To keep it constant we can use Singleton annotation
     * to the class and the components who provides that class
     *
     * Singleton annotation defines a Scope for that object
     */
    @Inject
    lateinit var emailService: EmailService
    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val registrationComponent = DaggerB_UserRegistrationComponent.factory().create(12)
        registrationComponent.inject(this)
        registrationService.registerUser("abcd@gmail.com", "Lensa")
    }
}