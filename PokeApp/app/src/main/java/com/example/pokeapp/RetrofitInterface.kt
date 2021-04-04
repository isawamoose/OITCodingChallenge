package com.example.pokeapp

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @get:GET("pokemon")
    val pokemon : Call<List<PostModel?>?>?

    companion object {
        const val BASE_URL = "https://pokeapi.co/api/v2/"
    }

}