package com.example.dagger_2.sample_project.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    val category: String,
    val description: String,
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val image: String,
    val price: Double,
    val rating: Rating,
    val title: String
)