package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.*


@Composable
fun H2Black(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H2Black,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H2White(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H2White,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H2Gray(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H2Gray,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H2Green(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H2Green,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H2Red(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H2Red,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun H2BlackBook(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = H2BlackBook,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}