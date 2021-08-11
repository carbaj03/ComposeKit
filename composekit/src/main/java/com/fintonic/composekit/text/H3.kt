package com.fintonic.composekit.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.*

private val FontSize.Companion.Normal get() = 18.sp

@Composable
private fun H3(
    text: String,
    color: Color,
) {
    Text(
        text = text,
        fontSize = FontSize.Normal,
        fontWeight = FontWeight.Book,
        fontFamily = cerebriSansFamily,
        color = color,
    )
}

@Composable
fun H3Black(
    text: String,
) {
    H3(text = text, color = Black)
}

@Composable
fun H3Gray(
    text: String,
) {
    H3(text = text, color = Gray)
}

@Composable
fun H3Green(
    text: String,
) {
    H3(text = text, color = Green)
}

@Composable
fun H3Red(
    text: String,
) {
    H3(text = text, color = Red)
}

@Composable
fun H3Pink(
    text: String,
) {
    H3(text = text, color = Pink)
}

@Composable
fun H3White(
    text: String,
) {
    H3(text = text, color = White)
}