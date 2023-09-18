package com.ikapurwanti.activityfragmentexample.presentation.avengerlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterViewAnimator
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ikapurwanti.activityfragmentexample.data.AvengersDataSourceImpl
import com.ikapurwanti.activityfragmentexample.databinding.FragmentAvengerListBinding
import com.ikapurwanti.activityfragmentexample.model.Person

class AvengerListFragment : Fragment() {

    private lateinit var binding : FragmentAvengerListBinding

    private val adapter: AvengerListAdapter by lazy {
        AvengerListAdapter {
            navigateToFragmentTwo(it)
        }
    }

    //untuk view saja
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAvengerListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // setClickListener()
        setupRecyclerview()

    }

    private fun setupRecyclerview() {
        binding.rvAvengers.adapter = adapter
        binding.rvAvengers.layoutManager = LinearLayoutManager(requireContext())
        adapter.setData(AvengersDataSourceImpl().getAvengersData())
    }

    private fun navigateToFragmentTwo(person: Person? = null) {

        val action = AvengerListFragmentDirections.navigateToDetail(person)
        findNavController().navigate(action)
    }



}