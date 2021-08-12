package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import com.fintonic.composekit.text.style.DisplayBig
import com.fintonic.composekit.text.style.DisplayPrimary
import com.fintonic.composekit.text.style.DisplayWhite

@Composable
fun DisplayPrimary(
    text: String
) {
    Text(text = text, style = DisplayPrimary)
}

@Composable
fun DisplayWhite(
    text: String
) {
    Text(text = text, style = DisplayWhite)
}

@Composable
fun DisplayBig(
    text: String
) {
    Text(text = text, style = DisplayBig)
}