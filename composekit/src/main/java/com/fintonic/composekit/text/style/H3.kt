package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.text.FontSize
import com.fintonic.composekit.theme.Book
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily


private val FontSize.Companion.Normal get() = 18.sp

sealed class H3(
    color: DslColor,
    fontWeight: FontWeight = FontWeight.Book,
) : TextStyle(FontSize.Normal, fontWeight, cerebriSansFamily, color)

object H3White : H2(color = DslColor.White)

object H3Black : H2(color = DslColor.Black)

object H3Gray : H2(color = DslColor.Gray)

object H3Green : H2(color = DslColor.Green)

object H3Red : H2(color = DslColor.Red)

object H3Pink : H2(color = DslColor.Pink)