package com.example.age_of_empires_wiki_polsl.ui.civilizations

import androidx.lifecycle.ViewModel
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CivilizationsViewModel(application: Application): AndroidViewModel(application) {

    // Create the repository
    //private val repo:

    // Create the current civilization
    var currentCivilization: CivilizationModel? = null

    // Get civilization list
    //val getAllCivilizations: LiveData<List<CivilizationModel>>
    var getAllCivilizations: MutableLiveData<List<CivilizationModel>> = MutableLiveData(listOf(
        CivilizationModel(0, "First Civilization", null, null, null, null, null, null),
        CivilizationModel(1, "Secondoo Civilization", null, null, null, null, null, null),
        CivilizationModel(2, "Treeeesss Civilization", null, null, null, null, null, null),
        CivilizationModel(3, "Quatro Civilization", null, null, null, null, null, null)
    ))
}