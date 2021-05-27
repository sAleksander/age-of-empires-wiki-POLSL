package com.example.age_of_empires_wiki_polsl.ui.technologies.list

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
import com.example.age_of_empires_wiki_polsl.TempDatabase.ApiClasses.Technology
import com.example.age_of_empires_wiki_polsl.ui.civilizations.CivilizationViewModel
import com.example.age_of_empires_wiki_polsl.ui.technologies.TechnologyViewModel
import kotlinx.android.synthetic.main.fragment_civilization_list.*
import kotlinx.android.synthetic.main.fragment_technology_details.*
import kotlinx.android.synthetic.main.fragment_technology_list.*
import kotlinx.android.synthetic.main.technology_list_one_row.*

public class TechnologyListFragment : Fragment(), ICallbackTechnology {
    private lateinit var myAdapter: TechnologyListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: TechnologyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_technology_list, container, false)
        myLayoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProvider(requireActivity()).get(TechnologyViewModel::class.java)

        myAdapter = TechnologyListAdapter(viewModel.getAllTechnology,this)

        viewModel.getAllTechnology.observe(viewLifecycleOwner, Observer {
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

    override fun clickTechnology(model: Technology) {
        viewModel.currentTechnology = model
        findNavController().navigate(R.id.action_technologyListFragment_to_technologyDetailsFragment)
    }

}