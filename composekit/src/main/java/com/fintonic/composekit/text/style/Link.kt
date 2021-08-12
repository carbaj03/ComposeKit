package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.text.FontSize
import com.fintonic.composekit.theme.Book
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily

private val FontSize.Companion.Small: TextUnit get() = 15.sp
private val FontSize.Companion.Big: TextUnit get() = 17.sp

sealed class Link(
    color: DslColor,
    fontWeight: FontWeight = FontWeight.Book,
    fontSize: TextUnit = FontSize.Small,
) : TextStyle(fontSize, fontWeight, cerebriSansFamily, color)

object LinkBlue : Link(color = DslColor.Blue)

object LinkSecondary : Link(color = DslColor.Fucsia)

object LinkDisabled : Link(color = DslColor.Gray)

object LinkGreen : Link(color = DslColor.Green)

object LinkWhite : Link(color = DslColor.White)

object LinkWhiteBig : Link(
    color = DslColor.White,
    fontSize = FontSize.Big
)

object LinkBlueBig : Link(
    color = DslColor.Blue,
    fontSize = FontSize.Big
)
