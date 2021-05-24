package com.example.age_of_empires_wiki_polsl.ui.technologies.list

import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology


interface ICallbackTechnology {

    fun clickTechnology(model: Technology)
}