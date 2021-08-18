package com.fintonic.kit.text.style

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.fintonic.kit.theme.DslColor
import com.fintonic.kit.theme.cerebriSansFamily


sealed class TextStyle(
    val fontSize: TextUnit = TextUnit.Unspecified,
    val fontWeight: FontWeight,
    val fontFamily: FontFamily,
    val color: DslColor
) {
    fun textStyle() =
        androidx.compose.ui.text.TextStyle(
            color = color.color,
            fontWeight = fontWeight,
            fontFamily = cerebriSansFamily,
            fontSize = fontSize,
        )
}