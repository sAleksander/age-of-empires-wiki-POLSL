package com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class Civilization(
    @Json(name = "army_type")
    val armyType: String,
    @Json(name = "civilization_bonus")
    val civilizationBonus: List<String>,
    val expansion: String,
    val id: Int,
    val name: String,
    @Json(name = "team_bonus")
    val teamBonus: String,
    @Json(name = "unique_tech")
    val uniqueTech: List<String>,
    @Json(name = "unique_unit")
    val uniqueUnit: List<String>
)