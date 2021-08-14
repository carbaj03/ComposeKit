package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily


private val FontSize.Companion.Normal: TextUnit get() = 18.sp

sealed class Body(
    color: DslColor,
    fontWeight: FontWeight = FontWeight.Light,
) : TextStyle(FontSize.Normal, fontWeight, cerebriSansFamily, color)

object BodyWhite : Body(
    color = DslColor.White,
)

object BodyBlack : Body(
    color = DslColor.Black,
)

object BodyGray : Body(
    color = DslColor.Gray,
)