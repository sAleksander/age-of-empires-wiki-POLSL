package com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class UnitCost(
    @Json(name = "Cost")
    val cost: String?,
    @Json(name = "Food")
    val food: Int?,
    @Json(name = "Gold")
    val gold: Int?,
    val info: String?,
    @Json(name = "Provides")
    val provides: Provides?,
    @Json(name = "Wood")
    val wood: Int?
)