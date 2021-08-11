package com.fintonic.composekit.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.Black
import com.fintonic.composekit.theme.Gray
import com.fintonic.composekit.theme.White
import com.fintonic.composekit.theme.cerebriSansFamily


@Composable
private fun H1(
    text: String,
    color: Color = Color.Black
) {
    Text(
        text = text,
        fontSize = 26.sp,
        fontWeight = FontWeight.Light,
        fontFamily = cerebriSansFamily,
        color = color,
    )
}

@Composable
fun H1Black(
    text: String,
) {
    H1(text = text, color = Black)
}

@Composable
fun H1White(
    text: String,
) {
    H1(text = text, color = White)
}

@Composable
fun H1Gray(
    text: String,
) {
    H1(text = text, color = Gray)
}
