package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily


sealed class Micro2(
    fontWeight: FontWeight = FontWeight.SemiBold,
    color: DslColor
) : TextStyle(fontWeight, cerebriSansFamily, color, Normal) {
    companion object {
        val Normal = 13.sp
    }
}

object Micro2Black : Micro2(
    color = DslColor.Black,
)

object Micro2Gray : Micro2(
    color = DslColor.Gray,
)

object Micro2White : Micro2(
    color = DslColor.Gray,
)

object Micro2Navy : Micro2(
    color = DslColor.Navy,
)

object Micro2BlackRegular : Micro2(
    color = DslColor.Gray,
    fontWeight = FontWeight.Normal,
)