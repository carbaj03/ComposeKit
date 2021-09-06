package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.Micro1Black
import com.fintonic.composekit.text.style.Micro1BlackRegular
import com.fintonic.composekit.text.style.Micro1Gray
import com.fintonic.composekit.text.style.Micro1White

@Composable
fun Micro1White(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro1White,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}


@Composable
fun Micro1Black(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
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
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro1BlackRegular,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun Micro1Gray(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = Micro1Gray,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}
