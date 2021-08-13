package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import com.fintonic.composekit.text.style.Micro1Black
import com.fintonic.composekit.text.style.Micro1BlackRegular
import com.fintonic.composekit.text.style.Micro1Gray


@Composable
fun Micro1Black(
    text: String,
) {
    Text(text = text, style = Micro1Black)
}

@Composable
fun Micro1BlackRegular(
    text: String,
) {
    Text(text = text, style = Micro1BlackRegular)
}

@Composable
fun Micro1Gray(
    text: String,
) {
    Text(text = text, style = Micro1Gray)
}
