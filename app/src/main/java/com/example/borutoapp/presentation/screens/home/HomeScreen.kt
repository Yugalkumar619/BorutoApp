package com.example.borutoapp.presentation.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.borutoapp.presentation.common.ListContent
import com.example.borutoapp.presentation.components.RatingWidget
import com.example.borutoapp.ui.theme.LARGE_PADDING

@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val allHeroes = homeViewModel.getAllHero.collectAsLazyPagingItems()
    Scaffold(
        topBar = {
            HomeTopBar(onSearchClicked = {})
        },
        content = {
            ListContent(
                heroes = allHeroes,
                navController = navController
            )
        }
    )
}