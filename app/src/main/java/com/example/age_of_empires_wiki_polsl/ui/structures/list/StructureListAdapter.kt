package com.example.age_of_empires_wiki_polsl.ui.structures.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Structure
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology
import com.example.age_of_empires_wiki_polsl.ui.civilizations.CivilizationModel
import kotlinx.android.synthetic.main.civilization_list_one_row.view.*

class  StructureListAdapter(private var structureList: LiveData<List<Structure>>, val structureCallback: ICallbackStructure):
    RecyclerView.Adapter<StructureListAdapter.StructureHolder>() {

    inner class StructureHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StructureHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.civilization_list_one_row, parent, false)

        return StructureHolder(view)
    }

    override fun onBindViewHolder(holder: StructureHolder, position: Int) {
        val textViewName = holder.itemView.findViewById<TextView>(R.id.textViewName)

        textViewName.text = structureList.value?.get(position)?.name

        holder.itemView.card_view.setOnClickListener{
            structureCallback.clickStructure(structureList.value!![position])
        }
    }

    override fun getItemCount(): Int {
        return structureList.value?.size?:0
    }
}