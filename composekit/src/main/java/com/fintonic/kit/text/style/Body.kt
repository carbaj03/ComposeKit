package com.fintonic.kit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.kit.theme.DslColor
import com.fintonic.kit.theme.cerebriSansFamily


sealed class Body(
    color: DslColor,
    fontWeight: FontWeight = FontWeight.Light,
) : TextStyle(Normal, fontWeight, cerebriSansFamily, color) {
    companion object {
        val Normal: TextUnit = 18.sp
    }
}

object BodyWhite : Body(
    color = DslColor.White,
)

object BodyBlack : Body(
    color = DslColor.Black,
)

object BodyGray : Body(
    color = DslColor.Gray,
)