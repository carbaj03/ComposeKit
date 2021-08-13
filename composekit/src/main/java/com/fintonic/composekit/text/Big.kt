package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import com.fintonic.composekit.text.style.Big33
import com.fintonic.composekit.text.style.Big50


@Composable
fun Big33(
    text: String,
) {
    Text(text = text, style = Big33)
}

@Composable
fun Big50(
    text: String,
) {
    Text(text = text, style = Big50)
}