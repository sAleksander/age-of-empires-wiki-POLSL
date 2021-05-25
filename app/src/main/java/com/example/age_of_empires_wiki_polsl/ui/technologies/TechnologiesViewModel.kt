package com.example.age_of_empires_wiki_polsl.ui.technologies

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.TempDatabase.AgeOfEmpiresDB
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.TechnologyCost
import com.example.age_of_empires_wiki_polsl.ui.technologies.list.TechnologyListAdapter

class TechnologyViewModel(application: Application): AndroidViewModel(application) {


    var currentTechnology: Technology? = null

    var getAllTechnology: MutableLiveData<List<Technology>> = MutableLiveData(AgeOfEmpiresDB.Technologies.value)



}