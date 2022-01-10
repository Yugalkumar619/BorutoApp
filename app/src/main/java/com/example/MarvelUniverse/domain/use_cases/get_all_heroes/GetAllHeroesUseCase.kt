package com.example.MarvelUniverse.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.example.MarvelUniverse.data.repository.Repository
import com.example.MarvelUniverse.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke() : Flow<PagingData<Hero>>{
        return repository.getAllHeroes()
    }
}