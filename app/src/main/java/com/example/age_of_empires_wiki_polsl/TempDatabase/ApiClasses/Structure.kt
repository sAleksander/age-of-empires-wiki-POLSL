package com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class Structure(
    val age: String,
    val armor: String,
    val attack: Int?,
    @Json(name = "build_time")
    val buildTime: Int,
    val cost: StructureCost,
    val expansion: String,
    @Json(name = "hit_points")
    val hitPoints: Int,
    val id: Int,
    @Json(name = "line_of_sight")
    val lineOfSight: Int?,
    val name: String,
    val range: Any?,
    @Json(name = "reload_time")
    val reloadTime: Double?,
    val special: List<String>?
)