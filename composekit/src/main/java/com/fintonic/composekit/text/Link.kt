package com.fintonic.composekit.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.*

private val FontSize.Companion.Small: TextUnit get() = 15.sp
private val FontSize.Companion.Big: TextUnit get() = 17.sp

@Composable
fun Link(
    text: String,
    color: Color,
    fontSize: TextUnit = FontSize.Small,
    fontWeight: FontWeight = FontWeight.Book
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = cerebriSansFamily,
        color = color,
    )
}


@Composable
fun LinkBlue(
    text: String,
) {
    Link(text = text, color = Blue)
}

@Composable
fun LinkSecondary(
    text: String,
) {
    Link(text = text, color = Fucsia)
}

@Composable
fun LinkDisabled(
    text: String,
) {
    Link(text = text, color = Gray)
}

@Composable
fun LinkGreen(
    text: String,
) {
    Link(text = text, color = Green)
}

@Composable
fun LinkWhite(
    text: String,
) {
    Link(text = text, color = White)
}

@Composable
fun LinkWhiteBig(
    text: String,
) {
    Link(text = text, color = White, fontSize = FontSize.Big)
}

@Composable
fun LinkBlueBig(
    text: String,
) {
    Link(text = text, color = Blue, fontSize = FontSize.Big)
}