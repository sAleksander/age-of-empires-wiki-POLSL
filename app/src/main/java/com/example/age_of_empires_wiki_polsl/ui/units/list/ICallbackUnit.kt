package com.example.age_of_empires_wiki_polsl.ui.units.list

import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Unit


interface ICallbackUnit {

    fun clickTechnology(model: Unit)
}