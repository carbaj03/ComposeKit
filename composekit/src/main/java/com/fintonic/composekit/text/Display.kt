package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.DisplayBig
import com.fintonic.composekit.text.style.DisplayPrimary
import com.fintonic.composekit.text.style.DisplayWhite

@Composable
fun DisplayPrimary(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = DisplayPrimary,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun DisplayWhite(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = DisplayWhite,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun DisplayBig(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = DisplayBig,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}