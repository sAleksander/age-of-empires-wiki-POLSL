package com.example.age_of_empires_wiki_polsl.ui.units

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.age_of_empires_wiki_polsl.TempDatabase.AgeOfEmpiresDB
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Provides
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Unit
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.UnitCost

class UnitsViewModel: ViewModel() {
    var currentUnit: Unit? = null
    var getAllUnits: MutableLiveData<List<Unit>> = MutableLiveData(AgeOfEmpiresDB.Units.value)
}