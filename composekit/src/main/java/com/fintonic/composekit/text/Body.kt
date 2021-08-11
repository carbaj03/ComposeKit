package com.fintonic.composekit.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.Black
import com.fintonic.composekit.theme.Gray
import com.fintonic.composekit.theme.White
import com.fintonic.composekit.theme.cerebriSansFamily

private val FontSize.Companion.Normal: TextUnit get() = 18.sp


@Composable
private fun Body(
    text: String,
    color: androidx.compose.ui.graphics.Color
) {
    Text(
        text = text,
        fontSize = FontSize.Normal,
        fontWeight = FontWeight.Light,
        fontFamily = cerebriSansFamily,
        color = color,
    )
}

@Composable
fun BodyWhite(
    text: String,
) {
    Body(text = text, color = White)
}

@Composable
fun BodyBlack(
    text: String,
) {
    Body(text = text, color = Black)
}

@Composable
fun BodyGray(
    text: String,
) {
    Body(text = text, color = Gray)
}