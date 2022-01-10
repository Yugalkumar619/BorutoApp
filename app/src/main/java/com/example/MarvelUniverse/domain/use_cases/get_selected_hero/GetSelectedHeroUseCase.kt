package com.example.MarvelUniverse.domain.use_cases.get_selected_hero

import com.example.MarvelUniverse.data.repository.Repository
import com.example.MarvelUniverse.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}