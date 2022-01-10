package com.example.MarvelUniverse.data.repository

import com.example.MarvelUniverse.data.local.BorutoDatabase
import com.example.MarvelUniverse.domain.model.Hero
import com.example.MarvelUniverse.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase): LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}