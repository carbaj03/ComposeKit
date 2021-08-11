package com.fintonic.composekit

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.DarkGray
import com.fintonic.composekit.theme.Navy
import com.fintonic.composekit.theme.White
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
        color = DarkGray,
    )
}

@Composable
fun Display(
    text: String
) {
    Text(
        text = text,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = cerebriSansFamily,
        color = Navy,
    )
}

@Composable
fun DisplayWhite(
    text: String
) {
    Text(
        text = text,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = cerebriSansFamily,
        color = White,
    )
}

@Composable
fun DisplayBig(
    text: String
) {
    Text(
        text = text,
        fontSize = 40.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = cerebriSansFamily,
        color = Navy,
    )
}