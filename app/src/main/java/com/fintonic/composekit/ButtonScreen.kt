package com.fintonic.composekit

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.button.*
import com.fintonic.composekit.theme.DslColor

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
            modifier = Modifier.height(100.dp),
            onClick = { },
            text = "Click"
        )

        Spacer(modifier = Modifier.height(8.dp))

        ButtonSecondary(
            onClick = { },
            text = "Click"
        )

        Spacer(modifier = Modifier.height(8.dp))

        ButtonGhostBlue(
            onClick = { },
            text = GhostBlue.name
        )

        ButtonArrow(
            onClick = {},
            tint = DslColor.Fucsia
        )

        Row {
            ButtonGhostBlue(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .requiredHeight(90.dp),
                onClick = { },
                text = GhostBlue.name + " sdafdsfasdfsdfdsf sadfdsf"
            )
            ButtonGhostBlue(
                onClick = { },
                text = GhostBlue.name,
                enabled = false
            )
        }
    }
}


