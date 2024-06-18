package com.example.dagger_2.dagger.annotation

import javax.inject.Scope

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationScope()
/**
 * We can use this as custom scope. We can replace @Singleton with @ApplicationScope
 * because it have the same scope as @Singleton
 */

