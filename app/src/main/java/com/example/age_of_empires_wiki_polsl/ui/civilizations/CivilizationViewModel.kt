package com.example.age_of_empires_wiki_polsl.ui.civilizations

import androidx.lifecycle.ViewModel
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.age_of_empires_wiki_polsl.TempDatabase.AgeOfEmpiresDB
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Civilization

class CivilizationViewModel(application: Application): AndroidViewModel(application) {
    // Create the current civilization
    var currentCivilization: Civilization? = null

    // Get civilization list
    var getAllCivilizations: MutableLiveData<List<Civilization>> = MutableLiveData(AgeOfEmpiresDB.Civilizations.value)
}