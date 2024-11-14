package com.example.legendfootball.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.legendfootball.model.LegendModel
import com.example.legendfootball.ui.components.TopAppBarComponent

@Composable
fun GridScreen(navController: NavController, legends: List<LegendModel>) {
    Column {
        TopAppBarComponent("Grid", navController = navController)
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(legends) { legend ->
                Card(
                    modifier = Modifier
                        .padding(4.dp)
                        .clickable {
                            navController.navigate("Detail/${legend.id}")
                        }
                ) {
                    Column {
                        Image(painterResource(id = legend.image), contentDescription = null)
                        Text(text = legend.name)
                    }
                }
            }
        }
    }
}
