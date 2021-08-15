package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.composekit.text.style.Micro2Black
import com.fintonic.composekit.text.style.Micro2BlackRegular
import com.fintonic.composekit.text.style.Micro2Gray
import com.fintonic.composekit.text.style.Micro2White


@Composable
fun Micro2Black(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro2Black
    )
}

@Composable
fun Micro2BlackRegular(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro2BlackRegular
    )
}

@Composable
fun Micro2Gray(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro2Gray
    )
}

@Composable
fun Micro2White(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro2White
    )
}
