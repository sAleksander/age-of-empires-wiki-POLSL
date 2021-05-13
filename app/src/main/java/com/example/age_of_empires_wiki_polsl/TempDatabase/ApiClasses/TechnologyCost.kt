package com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class TechnologyCost(
    @Json(name = "Enemy Villager")
    val enemyVillager: Int?,
    @Json(name = "Food")
    val food: Int?,
    @Json(name = "Gold")
    val gold: Int?,
    @Json(name = "Stone")
    val stone: Int?,
    @Json(name = "Wood")
    val wood: Int?
)