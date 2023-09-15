package com.ikapurwanti.activityfragmentexample.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ikapurwanti.activityfragmentexample.R
import com.ikapurwanti.activityfragmentexample.databinding.ActivityMain2Binding
import com.ikapurwanti.activityfragmentexample.databinding.ActivityMainBinding
import com.ikapurwanti.activityfragmentexample.presentation.fragmentone.FragmentOne
import com.ikapurwanti.activityfragmentexample.presentation.fragmentthree.FragmentThree
import com.ikapurwanti.activityfragmentexample.presentation.fragmenttwo.FragmentTwo

class MainActivity2 : AppCompatActivity() {

//    private val fragmentOne : FragmentOne by lazy { FragmentOne() }
//    private val fragmentTwo : FragmentTwo by lazy { FragmentTwo() }
//    private val fragmentThree : FragmentThree by lazy { FragmentThree() }

    private val binding : ActivityMain2Binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//
//        setClickButtonNavigate()
//        replaceFragment(fragmentOne)
    }

//    private fun setClickButtonNavigate(){
//        binding.btnFragment1.setOnClickListener{
//            replaceFragment(fragmentOne)
//        }
//
//        binding.btnFragment2.setOnClickListener{
//            replaceFragment(fragmentTwo)
//        }
//
//        binding.btnFragment3.setOnClickListener{
//            replaceFragment(fragmentThree)
//        }
//    }
//
//    private fun replaceFragment(fragment : Fragment) {
//        supportFragmentManager.beginTransaction()
//            .replace(binding.flContainer.id, fragment)
//            .commit()
//    }
}