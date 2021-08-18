package com.fintonic.kit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.kit.theme.DslColor
import com.fintonic.kit.theme.cerebriSansFamily


sealed class Display(
    color: DslColor,
    fontSize: TextUnit = Normal,
    fontWeight: FontWeight = FontWeight.SemiBold,
) : TextStyle(fontSize, fontWeight, cerebriSansFamily, color) {
    companion object {
        val Normal: TextUnit = 24.sp
        val Big: TextUnit = 40.sp
    }
}

object DisplayPrimary : Display(
    color = DslColor.Navy,
)

object DisplayWhite : Display(
    color = DslColor.White,
)

object DisplayBig : Display(
    color = DslColor.Navy,
    fontSize = Big
)