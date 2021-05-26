package com.example.age_of_empires_wiki_polsl.ui.structures

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.age_of_empires_wiki_polsl.TempDatabase.AgeOfEmpiresDB
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Structure
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology

class StructuresViewModel: ViewModel() {
    var currentStructure: Structure? = null
    var getAllStructures: MutableLiveData<List<Structure>> = MutableLiveData(AgeOfEmpiresDB.Structures.value)
}