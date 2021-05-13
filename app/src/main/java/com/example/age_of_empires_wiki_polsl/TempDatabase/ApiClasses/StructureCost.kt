package com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class StructureCost(
    @Json(name = "Gold")
    val gold: Int?,
    @Json(name = "Stone")
    val stone: Int?,
    @Json(name = "Wood")
    val wood: Int?
)