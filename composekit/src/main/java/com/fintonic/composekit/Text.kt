package com.fintonic.composekit

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.Black
import com.fintonic.composekit.theme.Book
import com.fintonic.composekit.theme.cerebriSansFamily

@Composable
fun H1Black(
    text: String,
) {
    Text(
        text = text,
        fontSize = 26.sp,
        fontWeight = FontWeight.Light,
        fontFamily = cerebriSansFamily,
        color = Black,
    )
}

@Composable
fun H2Black(
    text: String,
) {
    Text(
        text = text,
        fontSize = 22.sp,
        fontWeight = FontWeight.Light,
        fontFamily = cerebriSansFamily,
        color = Black,
    )
}

@Composable
fun H3Black(
    text: String,
) {
    Text(
        text = text,
        fontSize = 18.sp,
        fontWeight = FontWeight.Book,
        fontFamily = cerebriSansFamily,
        color = Black,
    )
}