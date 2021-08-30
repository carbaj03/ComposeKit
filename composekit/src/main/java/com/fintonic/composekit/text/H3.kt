package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.*


@Composable
fun H3Black(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H3Black,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H3Gray(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H3Gray,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H3Green(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H3Green,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H3Red(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H3Red,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H3Pink(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H3Pink,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H3White(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H3White,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}