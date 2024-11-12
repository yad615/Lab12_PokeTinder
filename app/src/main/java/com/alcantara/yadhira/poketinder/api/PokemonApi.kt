package com.alcantara.yadhira.poketinder.api
import com.alcantara.yadhira.poketinder.PokemonListResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET("/api/v2/pokemon")
    suspend fun getPokemons(): Response<PokemonListResponse>
}
