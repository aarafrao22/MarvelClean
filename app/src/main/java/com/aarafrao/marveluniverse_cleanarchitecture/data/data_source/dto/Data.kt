package com.aarafrao.marveluniverse_cleanarchitecture.data.data_source.dto

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<Result>,
    val total: Int
)