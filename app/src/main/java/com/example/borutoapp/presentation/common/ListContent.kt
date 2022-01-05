package com.example.borutoapp.presentation.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.paging.compose.LazyPagingItems
import com.example.borutoapp.domain.model.Hero

@Composable
fun ListContent(
    heroes: LazyPagingItems<Hero>,
    navController: NavController
){
    
}

@Composable
fun HeroItem(
    hero: Hero,
    navController: NavHostController
){
    Box(modifier = Modifier.height())
}
