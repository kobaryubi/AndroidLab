package com.masahikokobayashi.androidlab.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import com.masahikokobayashi.androidlab.model.Dessert

private const val TAG = "DessertClickerApp"

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
        topBar = {
            val layoutDirection = LocalLayoutDirection.current

            DessertClickerAppBar(
                onShareButtonClicked = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = WindowInsets.safeDrawing.asPaddingValues()
                            .calculateStartPadding(layoutDirection),
                        end = WindowInsets.safeDrawing.asPaddingValues()
                            .calculateEndPadding(layoutDirection),
                    )
                    .background(MaterialTheme.colorScheme.primary)
            )
        },
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
