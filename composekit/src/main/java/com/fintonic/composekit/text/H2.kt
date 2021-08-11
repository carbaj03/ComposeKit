package com.fintonic.composekit.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.*

private val FontSize.Companion.Normal get() = 22.sp

@Composable
private fun H2(
    text: String,
    color: Color,
    weight: FontWeight = FontWeight.Light
) {
    Text(
        text = text,
        fontSize = FontSize.Normal,
        fontWeight = weight,
        fontFamily = cerebriSansFamily,
        color = color,
    )
}

@Composable
fun H2Black(
    text: String,
) {
    H2(text = text, color = Black)
}

@Composable
fun H2White(
    text: String,
) {
    H2(text = text, color = White)
}

@Composable
fun H2Gray(
    text: String,
) {
    H2(text = text, color = Gray)
}

@Composable
fun H2Green(
    text: String,
) {
    H2(text = text, color = Green)
}

@Composable
fun H2Red(
    text: String,
) {
    H2(text = text, color = Red)
}

@Composable
fun H2BlackBook(
    text: String,
) {
    H2(text = text, color = Black, weight = FontWeight.Book)
}