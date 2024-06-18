package com.example.dagger_2.dagger.annotation

import javax.inject.Qualifier

@Qualifier //If you want to use your annotation as Qualifier
@MustBeDocumented // It will include in Java doc, when we generators to generate java doc
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)// It will decide the lifetime of the annotation
annotation class SMSAnnotation()
