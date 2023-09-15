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

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}