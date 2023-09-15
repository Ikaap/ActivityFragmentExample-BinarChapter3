package com.ikapurwanti.activityfragmentexample.presentation.fragmentthree

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ikapurwanti.activityfragmentexample.R
import com.ikapurwanti.activityfragmentexample.databinding.FragmentThreeBinding
import com.ikapurwanti.activityfragmentexample.presentation.otheractivity.OtherActivity

class FragmentThree : Fragment() {

    private lateinit var binding : FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThreeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setClickListener()
    }

    private fun setClickListener() {
        binding.btnNavigateOther.setOnClickListener {
//            val intent = Intent(this.requireContext(), OtherActivity::class.java)
//            startActivity(intent)
            //            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
//            intent.putExtra(OtherActivity.ARGS_NAME,"Ika P")
//            intent.putExtra(OtherActivity.ARGS_AGE,20)

           // startActivity(Intent(this.requireContext(), OtherActivity::class.java))


        }
    }

}