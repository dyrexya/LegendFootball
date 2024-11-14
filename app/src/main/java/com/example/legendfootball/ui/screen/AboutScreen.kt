package com.example.legendfootball.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.legendfootball.R
import com.example.legendfootball.ui.components.TopAppBarComponent

@Composable
fun AboutScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBarComponent("About", showBackButton = true, navController = navController)
        }
    ) { padding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dzaky),
                contentDescription = "Profile",
                modifier = Modifier.padding(16.dp)
            )
            Text("Nama: Muhammad Dzaky Naufal")
            Text("Email: mdzakyn52@gmail.com")
            Text("Asal Perguruan Tinggi: Politeknik Negeri Batam")
            Text("Jurusan: Teknik Informatika")
        }
    }
}
