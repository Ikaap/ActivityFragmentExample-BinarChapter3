package com.ikapurwanti.activityfragmentexample.presentation.otheractivity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ikapurwanti.activityfragmentexample.R
import com.ikapurwanti.activityfragmentexample.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {

    private val binding : ActivityOtherBinding by lazy {
        ActivityOtherBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getIntentData()
    }

    private fun getIntentData() {
        val name = intent?.getStringExtra(ARGS_NAME).orEmpty() // orEmpty() digunakan jika ada kesalahan maka data akan kosong
        val age = intent?.getIntExtra(ARGS_AGE,0) ?: 0
        Toast.makeText(this, "$name : $age", Toast.LENGTH_SHORT).show()
    }

    companion object{
        // value harus string
        const val ARGS_NAME = "ARGS_NAME"
        const val ARGS_AGE = "ARGS_AGE"

       // fun startActivity(context: Context, name: String)
    }
}