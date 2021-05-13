package com.example.age_of_empires_wiki_polsl.network

import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.*
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Unit
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

val BASE_URL = "https://age-of-empires-2-api.herokuapp.com/api/v1/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface AgeOfEmpires2Service {
    @GET("technologies")
    suspend fun getTechnologies(): TechnologyList

    @GET("structures")
    suspend fun getStructures(): StructureList

    @GET("civilizations")
    suspend fun getCivilizations(): CivilizationList

    @GET("units")
    suspend fun getUnits(): UnitList
}

object AgeOfEmpires2Api {
    val retrofitService: AgeOfEmpires2Service by lazy {
        retrofit.create(AgeOfEmpires2Service::class.java)
    }
}

