package com.fintonic.composekit.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fintonic.composekit.text.style.NavBarActive
import com.fintonic.composekit.text.style.NavBarBubble
import com.fintonic.composekit.text.style.NavBarInactive


@Composable
fun NavBarActive(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = NavBarActive
    )
}

@Composable
fun NavBarInactive(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = NavBarInactive
    )
}

@Composable
fun NavBarBubble(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = NavBarBubble
    )
}