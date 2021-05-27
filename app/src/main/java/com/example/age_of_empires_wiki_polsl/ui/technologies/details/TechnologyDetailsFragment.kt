package com.example.age_of_empires_wiki_polsl.ui.technologies.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.TechnologyCost
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.UnitCost
import com.example.age_of_empires_wiki_polsl.ui.technologies.TechnologyViewModel

class TechnologyDetailsFragment : Fragment() {
    private lateinit var viewModel: TechnologyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_technology_details, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(TechnologyViewModel::class.java)
        val model = viewModel.currentTechnology!!

        view.findViewById<TextView>(R.id.textViewTitle).text = model.name
        view.findViewById<TextView>(R.id.textViewCivilizationName).text = model.name
        view.findViewById<TextView>(R.id.textViewCivilizationExpansion).text = model.expansion
        view.findViewById<TextView>(R.id.textViewCivilizationArmyType).text = technologyCostToString(model.cost)
        view.findViewById<TextView>(R.id.textViewCivilizationTeamBonus).text = model.description

        return view
    }

    private fun technologyCostToString(techCost : TechnologyCost?) : String {
        if(techCost == null) return "-"
        var outputString = ""
        if(techCost.enemyVillager != null) outputString += "Enemy Villager: ${techCost.enemyVillager}\n"
        if(techCost.food != null) outputString += "Food: ${techCost.food}\n"
        if(techCost.gold != null) outputString += "Gold: ${techCost.gold}\n"
        if(techCost.wood != null) outputString += "Wood: ${techCost.wood}\n"
        if(techCost.stone != null) outputString += "Stone: ${techCost.stone}"
        outputString = outputString.trim()
        return if(outputString == "")  "-" else outputString
    }
}