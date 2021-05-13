package com.example.age_of_empires_wiki_polsl.ui.civilizations.list

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
import com.example.age_of_empires_wiki_polsl.ui.civilizations.CivilizationModel
import com.example.age_of_empires_wiki_polsl.ui.civilizations.CivilizationViewModel
import kotlinx.android.synthetic.main.fragment_civilization_list.*

class CivilizationListFragment : Fragment(), ICallbackCivilization {
    private lateinit var myAdapter: CivilizationListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: CivilizationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_civilization_list, container, false)
        myLayoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProvider(requireActivity()).get(CivilizationViewModel::class.java)

        myAdapter = CivilizationListAdapter(viewModel.getAllCivilizations, this)

        viewModel.getAllCivilizations.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = recyclerViewCivilizations.apply {
            this.layoutManager = myLayoutManager
            this.adapter = myAdapter
        }
    }

    override fun clickCivilization(model: CivilizationModel) {
        viewModel.currentCivilization = model
        findNavController().navigate(R.id.action_civilizationListFragment_to_civilizationDetailsFragment)
    }
}