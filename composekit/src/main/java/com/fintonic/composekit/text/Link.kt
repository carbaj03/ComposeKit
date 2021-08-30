package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.*


@Composable
fun LinkPrimary(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkPrimary,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun LinkSecondary(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkSecondary,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun LinkDisabled(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkDisabled,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun LinkGreen(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkGreen,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun LinkWhite(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkWhite,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun LinkWhiteBig(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkWhiteBig,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun LinkBlueBig(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkPrimaryBig,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}