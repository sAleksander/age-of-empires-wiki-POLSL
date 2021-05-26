package com.example.age_of_empires_wiki_polsl.ui.units.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.ui.units.UnitsViewModel

import android.widget.TextView
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.UnitCost


class UnitDetailsFragment : Fragment() {
    private lateinit var unitViewModel : UnitsViewModel;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        unitViewModel = ViewModelProvider(requireActivity()).get(UnitsViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_unit_details, container, false)
        val unit = unitViewModel.currentUnit!!
        view.findViewById<TextView>(R.id.titleName).text = unit.name
        view.findViewById<TextView>(R.id.valueName).text = unit.name
        view.findViewById<TextView>(R.id.valueDescription).text = unit.description
        view.findViewById<TextView>(R.id.valueAge).text = unit.age
        view.findViewById<TextView>(R.id.valueAttack).text = emptyValueForNull(unit.attack)
        view.findViewById<TextView>(R.id.valueAttackBonus).text = listToString(unit.attackBonus)
        view.findViewById<TextView>(R.id.valueArmor).text = unit.armor
        view.findViewById<TextView>(R.id.valueArmorBonus).text = listToString(unit.armorBonus)
        view.findViewById<TextView>(R.id.valueAccuracy).text = emptyValueForNull(unit.accuracy)
        view.findViewById<TextView>(R.id.valueRange).text = emptyValueForNull(unit.range)
        view.findViewById<TextView>(R.id.valueCost).text = unitCostToString(unit.cost)
        view.findViewById<TextView>(R.id.valueBuildTime).text = emptyValueForNull(unit.buildTime)
        view.findViewById<TextView>(R.id.valueReloadTime).text = emptyValueForNull(unit.reloadTime)
        return view
    }

    private fun <T> listToString(list : List<T>?) : String {
        if(list == null) return "-"
        var outputString = ""
        for (item in list)
            outputString += "$item\n"
        outputString = outputString.trim()
        return if(outputString == "")  "-" else outputString
    }

    private fun unitCostToString(unitCost : UnitCost?) : String {
        if(unitCost == null) return "-"
        var outputString = ""
        if(unitCost.cost != null) outputString += "Cost: ${unitCost.cost}\n"
        if(unitCost.food != null) outputString += "Food: ${unitCost.food}\n"
        if(unitCost.gold != null) outputString += "Gold: ${unitCost.gold}\n"
        if(unitCost.info != null) outputString += "Info: ${unitCost.info}\n"
        if(unitCost.provides != null) outputString += "Provides: ${unitCost.provides}\n"
        if(unitCost.wood != null) outputString += "Wood: ${unitCost.wood}"
        outputString = outputString.trim()
        return if(outputString == "")  "-" else outputString
    }

    private val emptyValueForNull : (Any?) -> String = { value : Any? -> if(value == null) "-" else "$value" }
}