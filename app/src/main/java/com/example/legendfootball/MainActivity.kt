package com.example.legendfootball

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.legendfootball.navigation.NavigationComponent
import com.example.legendfootball.viewmodel.LegendViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent(viewModel: LegendViewModel = viewModel()) {
    MaterialTheme {
        NavigationComponent(viewModel)
    }
}

@Preview(showBackground = true)
@Composable
fun MainContentPreview() {
    val mockViewModel = LegendViewModel() // buat ViewModel kosong atau dengan data contoh
    MainContent(viewModel = mockViewModel)
}
