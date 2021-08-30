package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.InputError
import com.fintonic.composekit.text.style.InputInfo


@Composable
fun InputError(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = InputError,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun InputInfo(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = InputInfo,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}
