package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.H1Black
import com.fintonic.composekit.text.style.H1Gray
import com.fintonic.composekit.text.style.H1White


@Composable
fun H1Black(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H1Black,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H1White(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H1White,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H1Gray(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H1Gray,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}
