package com.fintonic.composekit.bubble

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.text.NavBarBubble
import com.fintonic.composekit.theme.DslColor

@Composable
fun Bubble(
    text: String,
    backGroundColor: DslColor,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .background(
                color = backGroundColor.color,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(
                start = 4.dp,
                end = 4.dp,
                top = 2.dp,
                bottom = 2.dp,
            )
    ) {
        NavBarBubble(text = text)
    }
}