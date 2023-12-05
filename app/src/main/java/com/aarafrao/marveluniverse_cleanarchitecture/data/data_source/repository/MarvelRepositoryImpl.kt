package com.aarafrao.marveluniverse_cleanarchitecture.data.data_source.repository

import com.aarafrao.marveluniverse_cleanarchitecture.data.data_source.MarvelApi
import com.aarafrao.marveluniverse_cleanarchitecture.data.data_source.dto.CharacterDTO
import com.aarafrao.marveluniverse_cleanarchitecture.data.domain.repository.MarvelRepository
import javax.inject.Inject

class MarvelRepositoryImpl @Inject constructor(
    private val api: MarvelApi
) : MarvelRepository {
    override suspend fun getAllCharacter(offset: Int): CharacterDTO {
        return api.getAllCharacters(offset = offset.toString())
    }

}