package com.example.age_of_empires_wiki_polsl.ui.structures.list

import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Structure
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology


interface ICallbackStructure {

    fun clickStructure(model: Structure)
}