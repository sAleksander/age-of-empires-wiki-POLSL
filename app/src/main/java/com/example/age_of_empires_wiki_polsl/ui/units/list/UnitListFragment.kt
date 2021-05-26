package com.example.age_of_empires_wiki_polsl.ui.units.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.age_of_empires_wiki_polsl.R
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Unit
import com.example.age_of_empires_wiki_polsl.ui.units.UnitsViewModel
import com.example.age_of_empires_wiki_polsl.ui.units.list.ICallbackUnit
import com.example.age_of_empires_wiki_polsl.ui.units.list.UnitsListAdapter
import kotlinx.android.synthetic.main.fragment_technology_list.*

class UnitListFragment : Fragment(), ICallbackUnit {
    private lateinit var myAdapter: UnitsListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: UnitsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_technology_list, container, false)
        myLayoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProvider(requireActivity()).get(UnitsViewModel::class.java)
        myAdapter = UnitsListAdapter(viewModel.getAllUnits,this)
        viewModel.getAllUnits.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = recyclerViewTechnology.apply {
            this.layoutManager = myLayoutManager
            this.adapter = myAdapter
        }
    }

    override fun clickTechnology(model: Unit) {
        viewModel.currentUnit = model
        findNavController().navigate(R.id.action_unitListFragment_to_unitDetailsFragment)
    }

}