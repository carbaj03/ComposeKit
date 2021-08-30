package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.Big33
import com.fintonic.composekit.text.style.Big50


@Composable
fun Big33(
    text: String,
    textAlign: TextAlign? = null,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Big33,
    )
}

@Composable
fun Big50(
    text: String,
    textAlign: TextAlign? = null,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = Big50,
    )
}