package com.fintonic.composekit

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigator() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ComponentsScreen.route,
    ) {
        composable(ComponentsScreen.route) {
            ComponentsScreen(
                onClick = { navController.navigate(it) }
            )
        }
        composable(ButtonScreen.route) {
            ButtonScreen()
        }
        composable(TextScreen.route) {
            TextScreen()
        }
        composable(InputScreen.route) {
            InputScreen()
        }
        composable(CustomScreen.route) {
            CustomScreen()
        }
    }
}