package com.example.age_of_empires_wiki_polsl.ui.civilizations.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.ui.civilizations.CivilizationModel
import kotlinx.android.synthetic.main.civilization_list_one_row.view.*

class CivilizationListAdapter(private var civilizationList: LiveData<List<CivilizationModel>>, val civilizationCallback: ICallbackCivilization):
    RecyclerView.Adapter<CivilizationListAdapter.CivilizationHolder>() {

        inner class CivilizationHolder(view: View): RecyclerView.ViewHolder(view)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CivilizationHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.civilization_list_one_row, parent, false)

            return CivilizationHolder(view)
        }

        override fun onBindViewHolder(holder: CivilizationHolder, position: Int) {
            val textViewName = holder.itemView.findViewById<TextView>(R.id.textViewName)

            textViewName.text = civilizationList.value?.get(position)?.name

            holder.itemView.card_view.setOnClickListener{
                civilizationCallback.clickCivilization(civilizationList.value!![position])
            }
        }

    override fun getItemCount(): Int {
        return civilizationList.value?.size?:0
    }
    }