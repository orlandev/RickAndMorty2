package com.orlandev.data.source.remote

import com.orlandev.data.source.remote.dto.character.CharacterDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApi {

    companion object {
        const val API_BASE_URL = "https://rickandmortyapi.com/"
    }

    @GET("/api/character")
    suspend fun fetchTrinidadDTO(@Query("page") page: Int = 1): Response<CharacterDto>
}