package com.aarafrao.marveluniverse_cleanarchitecture.data.data_source.dto

data class CharacterDTO(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val `data`: Data,
    val etag: String,
    val status: String
)