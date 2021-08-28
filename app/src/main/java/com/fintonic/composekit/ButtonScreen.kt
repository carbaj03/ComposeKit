package com.fintonic.composekit

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.button.*

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

        Row {

            ButtonPrimary(
                onClick = { },
                text = Primary.name,
            )
            ButtonPrimary(
                onClick = { },
                text = Primary.name,
                enabled = false
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            ButtonWhite(
                onClick = { },
                text = "Click"
            )
            ButtonWhite(
                onClick = { },
                text = "Click",
                enabled = false
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            ButtonSecondary(
                onClick = { },
                text = "Click"
            )
            ButtonSecondary(
                onClick = { },
                text = "Click",
                enabled = false
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            ButtonGhostBlue(
                onClick = { },
                text = GhostBlue.name
            )
            ButtonGhostBlue(
                onClick = { },
                text = GhostBlue.name,
                enabled = false
            )
            ButtonPrimarySmall(
                onClick = { },
                text = GhostBlueSmall.name,
            )
        }

        Row {
            ButtonArrow(onClick = {})
            ButtonArrow(
                onClick = {},
                enabled = false,
            )
        }

        Row {
            ButtonGhostBlue(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
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


