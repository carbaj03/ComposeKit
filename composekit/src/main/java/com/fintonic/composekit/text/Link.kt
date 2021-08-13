package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import com.fintonic.composekit.text.style.*


@Composable
fun LinkPrimary(
    text: String,
) {
    Text(text = text, style = LinkPrimary)
}

@Composable
fun LinkSecondary(
    text: String,
) {
    Text(text = text, style = LinkSecondary)
}

@Composable
fun LinkDisabled(
    text: String,
) {
    Text(text = text, style = LinkDisabled)
}

@Composable
fun LinkGreen(
    text: String,
) {
    Text(text = text, style = LinkGreen)
}

@Composable
fun LinkWhite(
    text: String,
) {
    Text(text = text, style = LinkWhite)
}

@Composable
fun LinkWhiteBig(
    text: String,
) {
    Text(text = text, style = LinkWhiteBig)
}

@Composable
fun LinkBlueBig(
    text: String,
) {
    Text(text = text, style = LinkBlueBig)
}