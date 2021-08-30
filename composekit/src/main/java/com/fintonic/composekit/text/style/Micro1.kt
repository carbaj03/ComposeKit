package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily

sealed class Micro1(
    fontWeight: FontWeight = FontWeight.Light,
    color: DslColor
) : TextStyle(fontWeight, cerebriSansFamily, color, Normal) {
    companion object {
        val Normal = 15.sp
    }
}

object Micro1BlackRegular : Micro1(
    color = DslColor.Black,
    fontWeight = FontWeight.Normal
)

object Micro1Black : Micro1(
    color = DslColor.Black,
)

object Micro1Gray : Micro1(
    color = DslColor.Gray,
)