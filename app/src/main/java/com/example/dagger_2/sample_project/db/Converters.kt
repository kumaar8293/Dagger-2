package com.example.dagger_2.sample_project.db

import androidx.room.TypeConverter
import com.example.dagger_2.sample_project.models.Rating
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {
    // Converts Rating object to a JSON string
    @TypeConverter
    fun fromRating(rating: Rating): String {
        return Gson().toJson(rating)
    }

    // Converts a JSON string back to a Rating object
    @TypeConverter
    fun toRating(ratingString: String): Rating {
        val type = object : TypeToken<Rating>() {}.type
        return Gson().fromJson(ratingString, type)
    }
}