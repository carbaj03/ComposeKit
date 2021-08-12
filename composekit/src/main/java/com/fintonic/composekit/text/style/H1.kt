package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily

sealed class H1(
    fontWeight: FontWeight = FontWeight.Light,
    color: DslColor
) : TextStyle(26.sp, fontWeight, cerebriSansFamily, color)

object H1White : H1(
    color = DslColor.White,
)

object H1Black : H1(
    color = DslColor.Black,
)

object H1Gray : H1(
    color = DslColor.Gray,
)