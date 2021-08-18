package com.fintonic.kit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.kit.theme.Book
import com.fintonic.kit.theme.DslColor
import com.fintonic.kit.theme.cerebriSansFamily

sealed class NavBar(
    color: DslColor,
    fontWeight: FontWeight = FontWeight.Book,
    fontSize: TextUnit = Normal,
) : TextStyle(fontSize, fontWeight, cerebriSansFamily, color) {
    companion object {
        val Normal: TextUnit = 11.sp
        val Bubble: TextUnit = 10.sp
    }
}

object NavBarActive : NavBar(color = DslColor.Fucsia)

object NavBarInactive : NavBar(color = DslColor.Gray)

object NavBarBubble : NavBar(
    color = DslColor.White,
    fontSize = Bubble
)