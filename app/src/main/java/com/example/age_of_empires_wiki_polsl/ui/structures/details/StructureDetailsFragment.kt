package com.example.age_of_empires_wiki_polsl.ui.structures.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.StructureCost
import com.example.age_of_empires_wiki_polsl.ui.structures.StructuresViewModel
import com.squareup.moshi.Json

class StructureDetailsFragment : Fragment() {
    private lateinit var viewModel: StructuresViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_structure_details, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(StructuresViewModel::class.java)
        val model = viewModel.currentStructure!!

        view.findViewById<TextView>(R.id.textViewTitle).text = toString(model.name)

        view.findViewById<TextView>(R.id.rightTextViewID).text = toString(model.id)
        view.findViewById<TextView>(R.id.rightTextViewAge).text = toString(model.age)
        view.findViewById<TextView>(R.id.rightTextViewArmor).text = toString(model.armor)
        view.findViewById<TextView>(R.id.rightTextViewAttack).text = toString(model.attack)
        view.findViewById<TextView>(R.id.rightTextViewBuildTime).text = toString(model.buildTime)
        view.findViewById<TextView>(R.id.rightTextViewExpansion).text = toString(model.expansion)
        view.findViewById<TextView>(R.id.rightTextViewHitPoints).text = toString(model.hitPoints)
        view.findViewById<TextView>(R.id.rightTextViewLineOfSight).text = toString(model.lineOfSight)
        view.findViewById<TextView>(R.id.rightTextViewName).text = toString(model.name)
        view.findViewById<TextView>(R.id.rightTextViewRange).text = toString(model.range)
        view.findViewById<TextView>(R.id.rightTextViewReloadTime).text = toString(model.reloadTime)

        view.findViewById<TextView>(R.id.rightTextViewCostWood).text = toString(model.cost.wood)
        view.findViewById<TextView>(R.id.rightTextViewCostStone).text = toString(model.cost.stone)
        view.findViewById<TextView>(R.id.rightTextViewCostGold).text = toString(model.cost.gold)

        return view
    }

    private fun <T> toString(something: T?): String {
        if (something == null) return "0"
        else return something.toString()
    }
}