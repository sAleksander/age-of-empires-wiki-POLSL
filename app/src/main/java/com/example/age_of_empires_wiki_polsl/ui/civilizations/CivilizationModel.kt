package com.example.age_of_empires_wiki_polsl.ui.civilizations

import com.squareup.moshi.Json

data class CivilizationModel (

    val id: Long,
    val name: String,
    val expansion: String?,

    @Json(name = "army_type")
    val armyType: String?,

    @Json(name = "unique_unit")
    val uniqueUnit: List<String>?,

    @Json(name = "unique_tech")
    val uniqueTech: List<String>?,

    @Json(name = "team_bonus")
    val teamBonus: String?,

    @Json(name = "civilization_bonus")
    val civilizationBonus: List<String>?
)
