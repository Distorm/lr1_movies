package com.example.lr1_movies

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lr1_movies.API.APImovie
import com.example.lr1_movies.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


class MainActivity : AppCompatActivity() {
    //add viewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val MainButtonAdd = binding.btAddContent
        MainButtonAdd.setOnClickListener {
            val AddMoiveAct = Intent(this, AddDataActivity::class.java)
            startActivity(AddMoiveAct)
          //  Toast.makeText(applicationContext,"1111111",Toast.LENGTH_LONG).show()
        }
    }

}