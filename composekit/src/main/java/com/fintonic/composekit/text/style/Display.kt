package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.text.FontSize
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily


private val FontSize.Companion.Normal: TextUnit get() = 24.sp
private val FontSize.Companion.Big: TextUnit get() = 40.sp

sealed class Display(
    color: DslColor,
    fontSize: TextUnit = FontSize.Normal,
    fontWeight: FontWeight = FontWeight.SemiBold,
) : TextStyle(fontSize, fontWeight, cerebriSansFamily, color)

object DisplayWhite : Display(
    color = DslColor.White,
)

object DisplayBig : Display(
    color = DslColor.Navy,
    fontSize = FontSize.Big
)