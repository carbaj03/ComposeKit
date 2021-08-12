package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import com.fintonic.composekit.text.style.BodyBlack
import com.fintonic.composekit.text.style.BodyGray
import com.fintonic.composekit.text.style.BodyWhite


@Composable
fun BodyWhite(
    text: String,
) {
    Text(text = text, style = BodyWhite)
}

@Composable
fun BodyBlack(
    text: String,
) {
    Text(text = text, style = BodyBlack)
}

@Composable
fun BodyGray(
    text: String,
) {
    Text(text = text, style = BodyGray)
}