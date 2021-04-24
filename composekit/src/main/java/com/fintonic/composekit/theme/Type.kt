package com.fintonic.composekit.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.R

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = cerebriSans,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp,
        letterSpacing = 1.15.sp
    ),
    h2 = TextStyle(
        fontFamily = kulimPark,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        letterSpacing = 1.15.sp,
    ),
    h3 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
    ),
    body1 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    button = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 1.15.sp,
    ),
    caption = TextStyle(
        fontFamily = kulimPark,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 1.15.sp,
    ),
)

val cerebriSans: FontFamily =
    FontFamily(
        fonts = listOf(
            Font(
                resId = R.font.cerebri_sans_bold,
                weight = FontWeight.Light,
                style = FontStyle.Normal
            ),
            Font(
                resId = R.font.kulimpark_regular,
                weight = FontWeight.Normal,
                style = FontStyle.Normal
            )
        )
    )