package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.BodyBlack
import com.fintonic.composekit.text.style.BodyBlue
import com.fintonic.composekit.text.style.BodyGray
import com.fintonic.composekit.text.style.BodyWhite


@Composable
fun BodyWhite(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = BodyWhite,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun BodyBlack(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = BodyBlack,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun BodyBlue(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = BodyBlue,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun BodyGray(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = BodyGray,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}