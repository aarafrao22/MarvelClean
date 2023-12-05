package com.aarafrao.marveluniverse_cleanarchitecture.data.domain.repository

import com.aarafrao.marveluniverse_cleanarchitecture.data.data_source.dto.CharacterDTO

interface MarvelRepository {

    suspend fun getAllCharacter(offset: Int): CharacterDTO
}