package com.fintonic.kit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.kit.text.style.DisplayBig
import com.fintonic.kit.text.style.DisplayPrimary
import com.fintonic.kit.text.style.DisplayWhite

@Composable
fun DisplayPrimary(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = DisplayPrimary
    )
}

@Composable
fun DisplayWhite(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = DisplayWhite
    )
}

@Composable
fun DisplayBig(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = DisplayBig
    )
}