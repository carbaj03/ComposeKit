package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.Big33
import com.fintonic.composekit.text.style.Big50


@Composable
fun Big33(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Big33,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun Big50(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Big50,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}