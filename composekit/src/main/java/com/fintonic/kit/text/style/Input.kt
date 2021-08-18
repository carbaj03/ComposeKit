package com.fintonic.kit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.kit.theme.DslColor
import com.fintonic.kit.theme.Regular
import com.fintonic.kit.theme.cerebriSansFamily


sealed class Input(
    color: DslColor,
) : TextStyle(Normal, FontWeight.Regular, cerebriSansFamily, color) {
    companion object {
        val Normal: TextUnit = 15.sp
    }
}

object InputError : Input(
    color = DslColor.Red,
)

object InputInfo : Input(
    color = DslColor.Blue,
)