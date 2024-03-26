package com.example.lr1_movies.API

import com.example.lr1_movies.DataItem
import retrofit2.http.GET
import retrofit2.http.Path


interface APImovie {
    @GET("products/{id}")
    suspend fun getMovieId(@Path("id") idn: Int): DataItem
}