package com.fintonic.composekit.text

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.TextStyle
import androidx.compose.ui.text.TextStyle as ComposeTextStyle

@Composable
fun Text(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    val merge = style.textStyle().merge(ComposeTextStyle(textAlign = textAlign))
    BasicText(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        style = merge,
    )
}