package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.Book
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily

sealed class Link(
    color: DslColor,
    fontWeight: FontWeight = FontWeight.Book,
    fontSize: TextUnit = Small,
) : TextStyle(fontSize, fontWeight, cerebriSansFamily, color) {
    companion object {
        val Small: TextUnit = 15.sp
        val Big: TextUnit = 17.sp
    }
}

object LinkPrimary : Link(color = DslColor.Blue)

object LinkSecondary : Link(color = DslColor.Fucsia)

object LinkDisabled : Link(color = DslColor.Gray)

object LinkGreen : Link(color = DslColor.Green)

object LinkWhite : Link(color = DslColor.White)

object LinkWhiteBig : Link(
    color = DslColor.White,
    fontSize = Big
)

object LinkPrimaryBig : Link(
    color = DslColor.Blue,
    fontSize = Big
)