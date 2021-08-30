package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily
import androidx.compose.ui.text.TextStyle as ComposeTextStyle


sealed class TextStyle(
    val fontWeight: FontWeight,
    val fontFamily: FontFamily,
    val color: DslColor,
    val fontSize: TextUnit = TextUnit.Unspecified,
    val textAlign: TextAlign? = null,
) {
    fun textStyle() =
        ComposeTextStyle(
            color = color.color,
            fontWeight = fontWeight,
            fontFamily = cerebriSansFamily,
            fontSize = fontSize,
            textAlign = textAlign
        )
}