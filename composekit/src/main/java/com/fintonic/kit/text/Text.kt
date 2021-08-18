package com.fintonic.kit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.fintonic.kit.text.style.TextStyle

@Composable
fun Text(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Left,
) {
    androidx.compose.material.Text(
        modifier = modifier,
        text = text,
        fontSize = style.fontSize,
        fontWeight = style.fontWeight,
        fontFamily = style.fontFamily,
        color = style.color.color,
        maxLines = maxLines,
        overflow = TextOverflow.Ellipsis,
        textAlign = textAlign,
    )
}