package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.fintonic.composekit.text.style.NavBarActive
import com.fintonic.composekit.text.style.NavBarBubble
import com.fintonic.composekit.text.style.NavBarInactive


@Composable
fun NavBarActive(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = NavBarActive,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun NavBarInactive(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = NavBarInactive,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}

@Composable
fun NavBarBubble(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        style = NavBarBubble,
        maxLines = maxLines,
        textAlign = textAlign,
    )
}