package com.example.age_of_empires_wiki_polsl.ui.structures.list

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
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Structure
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.StructureList
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology
import com.example.age_of_empires_wiki_polsl.ui.structures.StructuresViewModel
import com.example.age_of_empires_wiki_polsl.ui.technologies.TechnologyViewModel
import com.example.age_of_empires_wiki_polsl.ui.technologies.list.TechnologyListAdapter
import kotlinx.android.synthetic.main.fragment_technology_list.*


class StructureListFragment : Fragment(), ICallbackStructure {
    private lateinit var myAdapter: StructureListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: StructuresViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_technology_list, container, false)
        myLayoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProvider(requireActivity()).get(StructuresViewModel::class.java)

        myAdapter = StructureListAdapter(viewModel.getAllStructures,this)

        viewModel.getAllStructures.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })
        //textViewName.text = viewModel.currentTechnology!!.name
        //txtID.text=viewModel.currentTechnology!!.id.toString()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = recyclerViewTechnology.apply {
            this.layoutManager = myLayoutManager
            this.adapter = myAdapter
        }
    }

    override fun clickStructure(model: Structure) {
        viewModel.currentStructure = model
        findNavController().navigate(R.id.action_structureListFragment_to_structureDetailsFragment)
    }
}