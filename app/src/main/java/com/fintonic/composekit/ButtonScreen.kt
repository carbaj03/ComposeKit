package com.fintonic.composekit

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.button.ButtonPrimary
import com.fintonic.composekit.button.ButtonSecondary
import com.fintonic.composekit.button.ButtonWhite

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
        ButtonPrimary(
            onClick = { },
            text = "Click",
        )

        Spacer(modifier = Modifier.height(8.dp))

        ButtonWhite(
            onClick = { },
            text = "Click"
        )

        Spacer(modifier = Modifier.height(8.dp))

        ButtonSecondary(
            onClick = { },
            text = "Click"
        )

        Spacer(modifier = Modifier.height(8.dp))
    }
}


