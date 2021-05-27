package com.example.age_of_empires_wiki_polsl.ui.civilizations.list

import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Civilization

interface ICallbackCivilization {

    fun clickCivilization(model: Civilization)
}