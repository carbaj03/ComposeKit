package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.composekit.text.style.TextStyle

@Composable
fun Text(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
) {
    androidx.compose.material.Text(
        modifier = modifier,
        text = text,
        fontSize = style.fontSize,
        fontWeight = style.fontWeight,
        fontFamily = style.fontFamily,
        color = style.color.color,
    )
}