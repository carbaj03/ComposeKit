package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily


sealed class Big(
    color: DslColor,
    fontSize: TextUnit = Normal,
    fontWeight: FontWeight = FontWeight.Light,
) : TextStyle(fontSize, fontWeight, cerebriSansFamily, color) {
    companion object {
        val Normal = 33.sp
        val Extra = 50.sp
    }
}

object Big33 : Big(
    color = DslColor.DarkGray,
)

object Big50 : Big(
    color = DslColor.DarkGray,
    fontSize = Extra
)