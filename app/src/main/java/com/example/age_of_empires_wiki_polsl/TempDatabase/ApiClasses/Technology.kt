package com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class Technology(
    val age: String,
    @Json(name = "applies_to")
    val appliesTo: List<String>?,
    @Json(name = "build_time")
    val buildTime: Int,
    val cost: TechnologyCost,
    val description: String,
    @Json(name = "develops_in")
    val developsIn: String,
    val expansion: String,
    val id: Int,
    val name: String
)