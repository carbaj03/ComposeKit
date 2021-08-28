package com.fintonic.composekit.text

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.composekit.text.style.TextStyle

@Composable
fun Text(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
) {
    BasicText(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        style = style.textStyle()
    )
//        modifier = modifier,
//        text = text,
//        fontSize = style.fontSize,
//        fontWeight = style.fontWeight,
//        fontFamily = style.fontFamily,
//        color = style.color.color,
//        maxLines = maxLines,
//        overflow = TextOverflow.Ellipsis,
//        textAlign = textAlign,

}