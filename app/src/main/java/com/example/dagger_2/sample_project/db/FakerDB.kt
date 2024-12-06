package com.example.dagger_2.sample_project.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dagger_2.sample_project.models.Product


@Database(entities = [Product::class], version = 1)
@TypeConverters(Converters::class) // Register the converter
abstract class FakerDB : RoomDatabase() {
    abstract fun getFakerDAO(): FakerDAO
}