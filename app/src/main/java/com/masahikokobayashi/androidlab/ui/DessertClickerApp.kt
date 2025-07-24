package com.masahikokobayashi.androidlab.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.masahikokobayashi.androidlab.model.Dessert

@Composable
fun DessertClickerApp(
    desserts: List<Dessert>,
    modifier: Modifier = Modifier
) {
    var revenue by remember { mutableIntStateOf(0) }
    var dessertsSold by remember { mutableIntStateOf(0) }
    var currentDessertIndex by remember { mutableIntStateOf(0) }
    val currentDessertImageId = desserts[currentDessertIndex].imageId
    val currentDessertPrice = desserts[currentDessertIndex].price

    Scaffold(
        topBar = {},
        modifier = modifier,
    ) { contentPadding ->
        DessertClickerScreen(
            revenue = revenue,
            dessertsSold = dessertsSold,
            dessertImageId = currentDessertImageId,
            onDessertClicked = {
                revenue += currentDessertPrice
                dessertsSold++

                val dessertToShow = determineDessertToShow(desserts, dessertsSold)
                currentDessertIndex = desserts.indexOf(dessertToShow)
            },
            modifier = Modifier.padding(contentPadding)
        )
    }
}

private fun determineDessertToShow(
    desserts: List<Dessert>,
    dessertsSold: Int
): Dessert {
    var dessertToShow = desserts.first()
    for (dessert in desserts) {
        if (dessertsSold >= dessert.startProductionAmount) {
            dessertToShow = dessert
        } else {
            break
        }
    }

    return dessertToShow
}
