package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.fintonic.composekit.theme.DslColor


sealed class TextStyle(
    val fontSize: TextUnit = TextUnit.Unspecified,
    val fontWeight: FontWeight,
    val fontFamily: FontFamily,
    val color: DslColor
)