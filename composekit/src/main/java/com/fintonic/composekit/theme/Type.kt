package com.fintonic.composekit.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val cerebriSansFamily: FontFamily =
    FontFamily(
        Font(R.font.cerebri_sans_bold, FontWeight.Bold),
        Font(R.font.cerebri_sans_bold_italic, FontWeight.Bold, FontStyle.Italic),
        Font(R.font.cerebri_sans_book, FontWeight.Book),
        Font(R.font.cerebri_sans_book_italic, FontWeight.Book, FontStyle.Italic),
        Font(R.font.cerebri_sans_extra_bold, FontWeight.ExtraBold),
        Font(R.font.cerebri_sans_extra_bold_italic, FontWeight.ExtraBold, FontStyle.Italic),
        Font(R.font.cerebri_sans_heavy, FontWeight.Heavy),
        Font(R.font.cerebri_sans_heavy_italic, FontWeight.Heavy, FontStyle.Italic),
        Font(R.font.cerebri_sans_light, FontWeight.Light),
        Font(R.font.cerebri_sans_light_italic, FontWeight.Light, FontStyle.Italic),
        Font(R.font.cerebri_sans_medium, FontWeight.Medium),
        Font(R.font.cerebri_sans_medium_italic, FontWeight.Medium, FontStyle.Italic),
        Font(R.font.cerebri_sans_semi_bold, FontWeight.SemiBold),
        Font(R.font.cerebri_sans_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
        Font(R.font.cerebri_sans_regular, FontWeight.Regular),
        Font(R.font.cerebri_sans_italic, FontWeight.Regular, FontStyle.Italic),
    )


val FontWeight.Companion.Book get() = FontWeight(450)
val FontWeight.Companion.Heavy get() = W900
val FontWeight.Companion.Regular get() = W400