package com.fintonic.composekit

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigator() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "components",
    ) {
        composable("components") {
            ComponentsScreen(
                onClick = { navController.navigate(it) }
            )
        }
        composable(ButtonScreen.route) {
            ButtonScreen()
        }
        composable("text") {
            TextScreen()
        }
    }
}