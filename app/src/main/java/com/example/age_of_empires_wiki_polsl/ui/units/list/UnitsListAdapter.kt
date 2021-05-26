package com.example.age_of_empires_wiki_polsl.ui.units.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Unit
import kotlinx.android.synthetic.main.civilization_list_one_row.view.*

class  UnitsListAdapter(private var unitList: LiveData<List<Unit>>, val unitCallback: ICallbackUnit):
    RecyclerView.Adapter<UnitsListAdapter.UnitHolder>() {

    inner class UnitHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.civilization_list_one_row, parent, false)

        return UnitHolder(view)
    }

    override fun onBindViewHolder(holder: UnitHolder, position: Int) {
        val textViewName = holder.itemView.findViewById<TextView>(R.id.textViewName)

        textViewName.text = unitList.value?.get(position)?.name

        holder.itemView.card_view.setOnClickListener{
            unitCallback.clickTechnology(unitList.value!![position])
        }
    }

    override fun getItemCount(): Int {
        return unitList.value?.size?:0
    }
}