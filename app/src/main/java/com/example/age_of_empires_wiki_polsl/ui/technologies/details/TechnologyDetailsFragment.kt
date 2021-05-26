package com.example.age_of_empires_wiki_polsl.ui.technologies.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.age_of_empires_wiki_polsl.R
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
        view.findViewById<TextView>(R.id.textViewCivilizationID).text = model.id.toString()
        view.findViewById<TextView>(R.id.textViewCivilizationName).text = model.name
        view.findViewById<TextView>(R.id.textViewCivilizationExpansion).text = model.expansion
        view.findViewById<TextView>(R.id.textViewCivilizationArmyType).text = "food: " +model.cost.food+ " gold: " +model.cost.gold+ " stone: " +model.cost.stone+ " wood: " +model.cost.wood
        view.findViewById<TextView>(R.id.textViewCivilizationTeamBonus).text = model.description
        view.findViewById<TextView>(R.id.textViewCivilizationCivilizationBonus).text = getBonuses(model.appliesTo!!)

        return view
    }

    private fun getBonuses(bonuses: List<String>): String {
        var result: String = ""

        bonuses.forEach {
            result += "- " + it + "\n"
        }

        return result
    }
}