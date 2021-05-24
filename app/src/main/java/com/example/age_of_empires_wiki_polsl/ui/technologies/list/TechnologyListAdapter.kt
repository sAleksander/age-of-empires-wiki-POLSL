package com.example.age_of_empires_wiki_polsl.ui.technologies.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology
import com.example.age_of_empires_wiki_polsl.ui.civilizations.CivilizationModel
import kotlinx.android.synthetic.main.civilization_list_one_row.view.*

class  TechnologyListAdapter(private var technologyList: LiveData<List<Technology>>, val technologyCallback: ICallbackTechnology):
    RecyclerView.Adapter<TechnologyListAdapter.TechnologyHolder>() {

    inner class TechnologyHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechnologyHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.civilization_list_one_row, parent, false)

        return TechnologyHolder(view)
    }

    override fun onBindViewHolder(holder: TechnologyHolder, position: Int) {
        val textViewName = holder.itemView.findViewById<TextView>(R.id.textViewName)

        textViewName.text = technologyList.value?.get(position)?.name

        holder.itemView.card_view.setOnClickListener{
            technologyCallback.clickTechnology(technologyList.value!![position])
        }
    }

    override fun getItemCount(): Int {
        return technologyList.value?.size?:0
    }
}