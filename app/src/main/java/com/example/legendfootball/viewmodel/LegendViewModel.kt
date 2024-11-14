package com.example.legendfootball.viewmodel

import androidx.lifecycle.ViewModel
import com.example.legendfootball.R
import com.example.legendfootball.model.LegendModel

class LegendViewModel : ViewModel() {

    val legends = listOf(
        LegendModel(1, "Ronaldinho", R.drawable.ronaldinho, "Legenda Brazil."),
        LegendModel(2, "Maradona", R.drawable.maradona, "Legenda Argentina."),
        LegendModel(3, "Zico", R.drawable.zico, "Legenda Brazil."),
        LegendModel(4, "Cafu", R.drawable.cafu, "Legenda Brazil."),
        LegendModel(5, "Romario", R.drawable.romario, "Legenda Brazil."),
        LegendModel(6, "Kaka", R.drawable.kaka, "Legenda Brazil."),
        LegendModel(7, "Iniesta", R.drawable.iniesta, "Legenda Spanyol."),
        LegendModel(8, "Xavi", R.drawable.xavi, "Legenda Spanyol."),
        LegendModel(9, "Thuram", R.drawable.thuram, "Legenda Prancis."),
        LegendModel(10, "Patrick Vieira", R.drawable.vieira, "Legenda Prancis."),
        LegendModel(11, "Dida", R.drawable.dida, "Legenda Brazil.")
    )

}
