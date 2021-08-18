package com.fintonic.kit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.kit.text.style.H1Black
import com.fintonic.kit.text.style.H1Gray
import com.fintonic.kit.text.style.H1White


@Composable
fun H1Black(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = H1Black
    )
}

@Composable
fun H1White(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = H1White
    )
}

@Composable
fun H1Gray(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = H1Gray
    )
}
