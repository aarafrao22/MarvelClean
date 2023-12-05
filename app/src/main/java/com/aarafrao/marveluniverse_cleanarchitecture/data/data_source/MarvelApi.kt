package com.aarafrao.marveluniverse_cleanarchitecture.data.data_source

import com.aarafrao.marveluniverse_cleanarchitecture.data.data_source.dto.CharacterDTO
import com.aarafrao.marveluniverse_cleanarchitecture.util.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApi {

    @GET("/v1/public/characters")
    suspend fun getAllCharacters(
        @Query("apikey") apikey: String = Constants.API_KEY,
        @Query("ts") ts: String = Constants.timeStamp,
        @Query("hash") hash: String = Constants.hash(),
        @Query("offset") offset: String,
    ): CharacterDTO
}