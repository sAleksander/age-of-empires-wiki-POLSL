package com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class Provides(
    @Json(name = "Food")
    val food: Int,
    @Json(name = "Resource Decay")
    val resourceDecay: Double
)