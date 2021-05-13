package com.example.age_of_empires_wiki_polsl.TempDatabase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Civilization
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Structure
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Unit
import com.example.age_of_empires_wiki_polsl.network.AgeOfEmpires2Api
import kotlinx.coroutines.launch

object AgeOfEmpiresDB : ViewModel() {
    private val _civilizations = MutableLiveData<List<Civilization>>()
    val Civilizations: LiveData<List<Civilization>> = _civilizations
    private val _structures = MutableLiveData<List<Structure>>()
    val Structures: LiveData<List<Structure>> = _structures
    private val _technologies = MutableLiveData<List<Technology>>()
    val Technologies: LiveData<List<Technology>> = _technologies
    private val _units = MutableLiveData<List<Unit>>()
    val Units: LiveData<List<Unit>> = _units

    fun init() {
        viewModelScope.launch {
            try {
                val civilizationResponse = AgeOfEmpires2Api.retrofitService.getCivilizations()
                _civilizations.value = civilizationResponse.civilizations
                val structureResponse = AgeOfEmpires2Api.retrofitService.getStructures()
                _structures.value = structureResponse.structures
                val technologyResponse = AgeOfEmpires2Api.retrofitService.getTechnologies()
                _technologies.value = technologyResponse.technologies
                val unitResponse = AgeOfEmpires2Api.retrofitService.getUnits()
                _units.value = unitResponse.units
            } catch (t: Throwable) {
                Log.d("SINGLETON",t.toString())
                System.exit(-1)
            }
        }
    }
}