package com.ikapurwanti.activityfragmentexample.presentation.fragmentone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ikapurwanti.activityfragmentexample.databinding.FragmentOneBinding
import com.ikapurwanti.activityfragmentexample.model.Person

class FragmentOne : Fragment() {

    private lateinit var binding : FragmentOneBinding

    //untuk view saja
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListener()
    }

    private fun setClickListener() {
        binding.btnNavigate.setOnClickListener {
            navigateToFragmentTwo()
        }
        binding.btnSendDataNavigate.setOnClickListener{
            navigateToFragmentTwo(getPerson())
        }
    }

    private fun getPerson(): Person? {
        return Person(
            name = "Tony Stark",
            job = "The Mechanic",
            profileDesc = "Genius, Billionaire, Playboy, Philantropist",
            profilePictUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjlCpHnAfX7kQmhAbilOn9XllyZ60niAAcsQ&usqp=CAU"
        )
    }

    private fun navigateToFragmentTwo(person: Person? = null) {
        // bundle
       /* findNavController().navigate(R.id.action_fragmentOne2_to_fragmentTwo2, Bundle().apply {
            putParcelable("person", person)
        }) */

        // safeargs
        val action = FragmentOneDirections.actionFragmentOne2ToFragmentTwo2(person)
        findNavController().navigate(action)
    }


}