package com.fintonic.composekit

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

object ButtonScreen {
    const val route = "Button"
}

@Composable
fun ButtonScreen() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
    ) {
        PrimaryBlueButton(
            onClick = { },
            text = "Click"
        )

        Spacer(modifier = Modifier.height(8.dp))

        PrimaryWhiteButton(
            onClick = { },
            text = "Click"
        )

        Spacer(modifier = Modifier.height(8.dp))

        SecondaryButton(
            onClick = { },
            text = "Click"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            style = PrimaryWhite,
            onClick = { },
            text = "PrimaryWhite",
        )
    }
}