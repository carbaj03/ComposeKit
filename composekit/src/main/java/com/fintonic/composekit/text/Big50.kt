package com.fintonic.composekit.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily

@Composable
fun Big50(
    text: String,
) {
    Text(
        text = text,
        fontSize = 50.sp,
        fontWeight = FontWeight.Light,
        fontFamily = cerebriSansFamily,
        color = DslColor.DarkGray.color,
    )
}