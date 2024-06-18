package com.example.dagger_2.dagger.component

import com.example.dagger_2.repository.EmailService
import com.example.dagger_2.repository.UserRegistrationService
import dagger.Component

/**
 * STEP-1
 * Create a component interface and annotate with @Component, which will provide the required objects.
 * Dagger will create the internal class which will implement the UserRegistrationComponent interface
 *
 */
@Component
interface A_UserRegistrationComponent {
    /**
     * STEP-2
     * We will use @Inject interface to the UserRegistrationService constructor,
     * which will help to create the object
     *
     * STEP-3
     * Since UserRegistrationService required EmailService and UserRepository,
     * we need to inject those classes constructor as well, so that Dagger can create Object for those classes as well
     *
     * STEP-4
     * We can get the UserRegistrationService object as below
     * DaggerUserRegistrationComponent.builder().build().provideUserRegistrationService()
     */
   // fun provideUserRegistrationService(): UserRegistrationService
   // fun provideEmailService(): EmailService
}