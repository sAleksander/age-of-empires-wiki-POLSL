package com.example.age_of_empires_wiki_polsl.ui.civilizations.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.ui.civilizations.CivilizationViewModel

class CivilizationDetailsFragment : Fragment() {
   private lateinit var viewModel: CivilizationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_civilization_details, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(CivilizationViewModel::class.java)
        val model = viewModel.currentCivilization!!

        view.findViewById<TextView>(R.id.textViewTitle).text = model.name
        view.findViewById<TextView>(R.id.textViewCivilizationName).text = model.name
        view.findViewById<TextView>(R.id.textViewCivilizationExpansion).text = model.expansion
        view.findViewById<TextView>(R.id.textViewCivilizationArmyType).text = model.armyType
        view.findViewById<TextView>(R.id.textViewCivilizationTeamBonus).text = model.teamBonus
        view.findViewById<TextView>(R.id.textViewCivilizationCivilizationBonus).text = listToString(model.civilizationBonus)

        return view
    }

    private fun <T> listToString(list: List<T>?): String {
        if (list == null) {
            return "-"
        }

        var result: String = ""

        list.forEach {
            result += "$it\n"
        }
        result = result.trim()
        return if(result == "") "-" else result
    }
}