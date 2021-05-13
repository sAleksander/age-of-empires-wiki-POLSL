package com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class Unit(
    val accuracy: String?,
    val age: String,
    val armor: String,
    @Json(name = "armor_bonus")
    val armorBonus: List<String>?,
    val attack: Int?,
    @Json(name = "attack_bonus")
    val attackBonus: List<String>?,
    @Json(name = "attack_delay")
    val attackDelay: Double?,
    @Json(name = "blast_radius")
    val blastRadius: Double?,
    @Json(name = "build_time")
    val buildTime: Int?,
    val cost: UnitCost,
    @Json(name = "created_in")
    val createdIn: String,
    val description: String,
    val expansion: String,
    @Json(name = "hit_points")
    val hitPoints: Int,
    val id: Int,
    @Json(name = "line_of_sight")
    val lineOfSight: Int,
    @Json(name = "movement_rate")
    val movementRate: Double?,
    val name: String,
    val range: Any?,
    @Json(name = "reload_time")
    val reloadTime: Double?,
    @Json(name = "search_radius")
    val searchRadius: Int?
)