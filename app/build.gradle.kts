plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.dagger_2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dagger_2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding {
        enable = true
    }
}

val daggerVersion = "2.24"
val lifeCycle = "2.6.2"
val retrofit = "2.9.0"
val coroutines = "1.7.3"

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.google.dagger:dagger-android:$daggerVersion")
    //Kotlin Annotation Processing Tool
    kapt ("com.google.dagger:dagger-compiler:$daggerVersion")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifeCycle")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifeCycle")
    // Retrofit core
    implementation("com.squareup.retrofit2:retrofit:$retrofit")
    // Converter for JSON (using Moshi or Gson)
    implementation("com.squareup.retrofit2:converter-gson:$retrofit")
    // Kotlin Coroutines Core Library
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines")

    // Kotlin Coroutines for Android
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines")
}
