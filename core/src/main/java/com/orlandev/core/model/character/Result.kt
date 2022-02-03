package com.orlandev.core.model.character

data class Result(
    val id: Int,
    val created: String,
    val gender: String,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)