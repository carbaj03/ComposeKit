package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.composekit.text.style.Micro1Black
import com.fintonic.composekit.text.style.Micro1BlackRegular
import com.fintonic.composekit.text.style.Micro1Gray


@Composable
fun Micro1Black(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro1Black
    )
}

@Composable
fun Micro1BlackRegular(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro1BlackRegular
    )
}

@Composable
fun Micro1Gray(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro1Gray
    )
}
