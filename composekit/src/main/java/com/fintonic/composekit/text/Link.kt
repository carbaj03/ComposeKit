package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.composekit.text.style.*


@Composable
fun LinkPrimary(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkPrimary
    )
}

@Composable
fun LinkSecondary(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkSecondary
    )
}

@Composable
fun LinkDisabled(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkDisabled
    )
}

@Composable
fun LinkGreen(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkGreen
    )
}

@Composable
fun LinkWhite(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkWhite
    )
}

@Composable
fun LinkWhiteBig(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkWhiteBig
    )
}

@Composable
fun LinkBlueBig(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = LinkPrimaryBig
    )
}