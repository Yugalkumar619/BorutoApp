package com.example.MarvelUniverse.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.MarvelUniverse.data.local.dao.HeroDao
import com.example.MarvelUniverse.data.local.dao.HeroRemoteKeysDao
import com.example.MarvelUniverse.domain.model.Hero
import com.example.MarvelUniverse.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase(){

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao
}