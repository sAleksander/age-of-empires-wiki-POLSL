package com.example.age_of_empires_wiki_polsl.ui.technologies

import androidx.lifecycle.ViewModel
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.TechnologyCost

class TechnologyViewModel(application: Application): AndroidViewModel(application) {

    // Create the repository
    //private val repo:

    // Create the current civilization
    var currentTechnology: Technology? = null

    // Get civilization list
    //val getAllCivilizations: LiveData<List<CivilizationModel>>

    //Mock data
    var getAllTechnology: MutableLiveData<List<Technology>> = MutableLiveData(listOf(
        Technology("bronze",listOf("Buildings (except gates) have +10% HP in Dark Age / +20% HP in Feudal Age  / +30% in Castle Age / +40% in Imperial Age",
            "Spearman skirmisher and camel lines cost 25% less",
            "Fire Ships attack 20% faster",
            "Imperial Age costs -33%",
            "Town Watch is free"),30, TechnologyCost(3,3,3,3,3),"kotlin to g***o","kurczak","kurczak",3,"kurczak"),))
}