package com.fintonic.composekit.theme

import androidx.compose.ui.graphics.Color

@JvmInline
value class DslColor(val color: Color) {
    companion object {
        val Fucsia: DslColor = DslColor(Color(0xFFFF619E))
        val Blue: DslColor = DslColor(Color(0xFF1F7CFF))
        val Gum: DslColor = DslColor(Color(0xFFFE6680))
        val Salmon: DslColor = DslColor(Color(0xFFFE666F))
        val Navy: DslColor = DslColor(Color(0xFF133273))
        val Yellow: DslColor = DslColor(Color(0xFFFFC442))
        val Aquamarine: DslColor = DslColor(Color(0xFFBFF3F5))
        val Pink: DslColor = DslColor(Color(0xFFFFD5D7))
        val BabyBlue: DslColor = DslColor(Color(0xFFBED5FF))
        val White: DslColor = DslColor(Color(0xFFFFFFFF))
        val Black: DslColor = DslColor(Color(0xFF000000))
        val Transparent: DslColor = DslColor(Color(0x00000000))

        val CloudyGray: DslColor = DslColor(Color(0xFFF3F6F9))
        val LightGray: DslColor = DslColor(Color(0xFFCFDAE6))
        val Gray: DslColor = DslColor(Color(0xFF929FAD))
        val DarkGray: DslColor = DslColor(Color(0xFF4B5D72))
        val Green: DslColor = DslColor(Color(0xFF0CC057))
        val Red: DslColor = DslColor(Color(0xFFFF0000))

        val Unspecified: DslColor = DslColor(Color.Unspecified)
    }
}