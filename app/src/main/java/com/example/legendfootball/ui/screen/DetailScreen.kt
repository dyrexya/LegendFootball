package com.example.legendfootball.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.legendfootball.model.LegendModel
import com.example.legendfootball.ui.components.TopAppBarComponent

@Composable
fun DetailScreen(navController: NavController, legendId: Int, legends: List<LegendModel>) {
    val legend = legends.firstOrNull { it.id == legendId } ?: return
    Column {
        TopAppBarComponent("Detail", showBackButton = true, navController = navController)
        Image(painter = painterResource(id = legend.image), contentDescription = null)
        Text(text = legend.name, style = MaterialTheme.typography.headlineLarge)
        Text(text = legend.description, style = MaterialTheme.typography.bodyLarge)
    }
}
