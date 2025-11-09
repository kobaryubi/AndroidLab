package com.masahikokobayashi.androidlab

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object First

@Serializable
object Second

@Serializable
object Third

@Composable
fun AndroidLabApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = First) {
        composable<First> {
            FirstScreen {
                navController.navigate(Second)
            }
        }
        composable<Second> {
            SecondScreen(
                navigateToFirstScreen = {},
                navigateToThirdScreen = {},
            )
        }
        composable<Third> {
            ThirdScreen {
                navController.navigate(First)
            }
        }
    }
}
