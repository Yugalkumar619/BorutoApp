package com.example.MarvelUniverse.domain.repository

import com.example.MarvelUniverse.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}