package com.example.legendfootball.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.legendfootball.ui.components.BottomNavigationBar
import com.example.legendfootball.ui.screen.AboutScreen
import com.example.legendfootball.ui.screen.DetailScreen
import com.example.legendfootball.ui.screen.GridScreen
import com.example.legendfootball.ui.screen.ListScreen
import com.example.legendfootball.viewmodel.LegendViewModel

@Composable
fun NavigationComponent(viewModel: LegendViewModel) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = "List",
            modifier = Modifier.padding(padding)
        ) {
            composable("List") {
                ListScreen(navController, viewModel.legends)
            }
            composable("Grid") {
                GridScreen(navController, viewModel.legends)
            }
            composable("About") {
                AboutScreen(navController)
            }
            composable(
                route = "Detail/{legendId}",
                arguments = listOf(navArgument("legendId") { type = NavType.IntType })
            ) { backStackEntry ->
                val legendId = backStackEntry.arguments?.getInt("legendId") ?: 0
                DetailScreen(navController, legendId, viewModel.legends)
            }
        }
    }
}
