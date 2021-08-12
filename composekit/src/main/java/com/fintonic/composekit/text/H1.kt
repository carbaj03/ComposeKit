package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import com.fintonic.composekit.text.style.H1Black
import com.fintonic.composekit.text.style.H1Gray
import com.fintonic.composekit.text.style.H1White


@Composable
fun H1Black(
    text: String,
) {
    Text(text = text, style = H1Black)
}

@Composable
fun H1White(
    text: String,
) {
    Text(text = text, style = H1White)
}

@Composable
fun H1Gray(
    text: String,
) {
    Text(text = text, style = H1Gray)
}
