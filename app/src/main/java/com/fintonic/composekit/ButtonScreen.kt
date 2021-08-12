package com.fintonic.composekit

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.button.PrimaryBlueButton
import com.fintonic.composekit.button.PrimaryWhiteButton
import com.fintonic.composekit.button.SecondaryButton

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
            text = "Click",
        )

        Row {
            Box(modifier = Modifier.weight(1f)) {
                PrimaryBlueButton(
                    onClick = { },
                    text = "Click",
                    fillMaxWith = true
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                PrimaryBlueButton(
                    onClick = { },
                    text = "Click",
                    fillMaxWith = true
                )
            }
        }

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
    }
}


