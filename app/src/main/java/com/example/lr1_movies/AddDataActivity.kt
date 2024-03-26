package com.example.lr1_movies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lr1_movies.API.APImovie
import com.example.lr1_movies.databinding.ActivityAddDataRvBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AddDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddDataRvBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddDataRvBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val tv = binding.tv
        val RFaddMoiveDB = binding.RFaddMoiveDB

        val retrofit = Retrofit.Builder()
            .baseUrl("https://dummyjson.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        RFaddMoiveDB.setOnClickListener{
            val APImovie = retrofit.create(APImovie::class.java)
            CoroutineScope(Dispatchers.IO).launch {
                val contMov = APImovie.getMovieId(3)
                runOnUiThread{
                    tv.text = contMov.title
                }
        }

        }

    }
}
