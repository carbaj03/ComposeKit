package com.fintonic.composekit

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.theme.Black

@Composable
fun H1Black(
    text: String,
) {
    Text(
        text = text,
//        fontSize = 26.dp,
//        fontFamily = R.font.cerebri_sans_light,
        color = Black,
//        letterSpacing = TextUnit.Unspecified,
    )
}

@Composable
fun H2Black(
    text: String,
) {
    Text(
        text = text,
//        fontSize = 22.dp,
//        fontFamily = R.font.cerebri_sans_light,
        color = Black,
    )
}