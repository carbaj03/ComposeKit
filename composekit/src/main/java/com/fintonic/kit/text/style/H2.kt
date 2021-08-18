package com.fintonic.kit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.kit.theme.Book
import com.fintonic.kit.theme.DslColor
import com.fintonic.kit.theme.cerebriSansFamily

sealed class H2(
    color: DslColor,
    fontWeight: FontWeight = FontWeight.Light,
) : TextStyle(Normal, fontWeight, cerebriSansFamily, color) {
    companion object {
        val Normal: TextUnit = 22.sp
    }
}

object H2White : H2(color = DslColor.White)

object H2Black : H2(color = DslColor.Black)

object H2Gray : H2(color = DslColor.Gray)

object H2Green : H2(color = DslColor.Green)

object H2Red : H2(color = DslColor.Red)

object H2BlackBook : H2(
    color = DslColor.Black,
    fontWeight = FontWeight.Book
)