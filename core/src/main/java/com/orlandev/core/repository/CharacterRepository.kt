package com.orlandev.core.repository

import com.orlandev.core.model.character.Character

interface CharacterRepository {

    //Fetch characters from API
    suspend fun fetchCharacters(pageIndex: Int = 1): Character

}