package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.composekit.text.style.BodyBlack
import com.fintonic.composekit.text.style.BodyGray
import com.fintonic.composekit.text.style.BodyWhite


@Composable
fun BodyWhite(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = BodyWhite
    )
}

@Composable
fun BodyBlack(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = BodyBlack
    )
}

@Composable
fun BodyGray(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = BodyGray
    )
}