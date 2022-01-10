package com.example.MarvelUniverse.presentation.screens.home

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.MarvelUniverse.R
import com.example.MarvelUniverse.ui.theme.topAppBarBlackContentColor
import com.example.MarvelUniverse.ui.theme.topAppBarContentColor

@Composable
fun HomeTopBar(onSearchClicked: () -> Unit) {
    TopAppBar (
        title = {
            Text(
                text = "Explore",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBlackContentColor,
        actions = {
            IconButton(onClick = onSearchClicked) {
                Icon(imageVector = Icons.Default.Search,
                contentDescription = stringResource(R.string.search_icon)
                                )
            }
        }
    )

}

@Composable
@Preview
fun HomeTopBarPreview(){
    HomeTopBar {}
}

