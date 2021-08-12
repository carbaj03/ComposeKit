package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import com.fintonic.composekit.text.style.*


@Composable
fun NavBarActive(
    text: String,
) {
    Text(text = text, style = NavBarActive)
}

@Composable
fun NavBarInactive(
    text: String,
) {
    Text(text = text, style = NavBarInactive)
}

@Composable
fun NavBarBubble(
    text: String,
) {
    Text(text = text, style = NavBarBubble)
}