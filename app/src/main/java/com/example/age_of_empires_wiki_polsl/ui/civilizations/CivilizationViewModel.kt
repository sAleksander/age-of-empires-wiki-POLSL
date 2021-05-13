package com.example.age_of_empires_wiki_polsl.ui.civilizations

import androidx.lifecycle.ViewModel
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CivilizationViewModel(application: Application): AndroidViewModel(application) {

    // Create the repository
    //private val repo:

    // Create the current civilization
    var currentCivilization: CivilizationModel? = null

    // Get civilization list
    //val getAllCivilizations: LiveData<List<CivilizationModel>>

    //Mock data
    var getAllCivilizations: MutableLiveData<List<CivilizationModel>> = MutableLiveData(listOf(
        CivilizationModel(1,
            "Aztecs",
            "The Conquerors",
            "Infantry and Monk",
            listOf( "https://age-of-empires-2-api.herokuapp.com/api/v1/unit/jaguar_warrior"),
            listOf("https://age-of-empires-2-api.herokuapp.com/api/v1/technology/garland_wars"),
            "Relics generate +33% gold",
            listOf("Buildings (except gates) have +10% HP in Dark Age / +20% HP in Feudal Age  / +30% in Castle Age / +40% in Imperial Age",
                "Spearman skirmisher and camel lines cost 25% less",
                "Fire Ships attack 20% faster",
                "Imperial Age costs -33%",
                "Town Watch is free")),

    ))
}