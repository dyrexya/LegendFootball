package com.example.legendfootball.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.legendfootball.model.LegendModel
import com.example.legendfootball.ui.components.TopAppBarComponent

@Composable
fun ListScreen(navController: NavController, legends: List<LegendModel>) {
    Column(modifier = Modifier.padding(16.dp)) {

        // Top AppBar for navigation
        TopAppBarComponent("List", navController = navController)

        // LazyRow for horizontal list of legends
        LazyRow(modifier = Modifier.padding(vertical = 8.dp)) {
            items(legends) { legend ->
                ListItem(
                    headlineContent = { Text(text = legend.name) },
                    leadingContent = {
                        Image(
                            painter = painterResource(id = legend.image),
                            contentDescription = null,
                            modifier = Modifier.padding(8.dp)
                        )
                    },
                    modifier = Modifier
                        .clickable { navController.navigate("Detail/${legend.id}") }
                        .padding(8.dp)
                )
            }
        }

        // LazyColumn for vertical list of legends
        LazyColumn(modifier = Modifier.padding(vertical = 8.dp)) {
            items(legends) { legend ->
                ListItem(
                    headlineContent = { Text(text = legend.name) },
                    leadingContent = {
                        Image(
                            painter = painterResource(id = legend.image),
                            contentDescription = null,
                            modifier = Modifier.padding(8.dp)
                        )
                    },
                    modifier = Modifier
                        .clickable { navController.navigate("Detail/${legend.id}") }
                        .padding(8.dp)
                )
            }
        }
    }
}
