package com.example.dagger_2.dagger

import com.example.dagger_2.MainActivity
import dagger.Component

@Component
interface B_UserRegistrationComponent {
    /**
     * Suppose we any class need many dependencies, then it’s  hard to maintain inside a component file.
     */

    fun inject(mainActivity: MainActivity)
}