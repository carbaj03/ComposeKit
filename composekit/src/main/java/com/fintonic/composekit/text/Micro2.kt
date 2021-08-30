package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.Micro2Black
import com.fintonic.composekit.text.style.Micro2BlackRegular
import com.fintonic.composekit.text.style.Micro2Gray
import com.fintonic.composekit.text.style.Micro2White


@Composable
fun Micro2Black(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro2Black,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun Micro2BlackRegular(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro2BlackRegular,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun Micro2Gray(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro2Gray,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun Micro2White(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro2White,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}
