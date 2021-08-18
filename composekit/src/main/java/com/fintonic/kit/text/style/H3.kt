package com.fintonic.kit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.kit.theme.Book
import com.fintonic.kit.theme.DslColor
import com.fintonic.kit.theme.cerebriSansFamily


sealed class H3(
    color: DslColor,
    fontWeight: FontWeight = FontWeight.Book,
) : TextStyle(Normal, fontWeight, cerebriSansFamily, color) {
    companion object {
        private val Normal = 18.sp
    }
}

object H3White : H3(color = DslColor.White)

object H3Black : H3(color = DslColor.Black)

object H3Gray : H3(color = DslColor.Gray)

object H3Green : H3(color = DslColor.Green)

object H3Red : H3(color = DslColor.Red)

object H3Pink : H3(color = DslColor.Pink)