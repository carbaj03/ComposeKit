package com.fintonic.composekit

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.theme.*

@Composable
fun SecondaryButton(
    onClick: () -> Unit,
    text: String,
) {
    Button(
        modifier = Modifier.height(50.dp),
        onClick = onClick,
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Salmon,
            disabledBackgroundColor = CloudyGray,
        ),
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = text,
            color = White,
        )
    }
}

@Composable
fun PrimaryBlueButton(
    onClick: () -> Unit,
    text: String,
) {
    Button(
        style = PrimaryBlue,
        onClick = onClick,
        text = text,
    )
}

@Composable
fun PrimaryWhiteButton(
    onClick: () -> Unit,
    text: String,
) {
    Button(
        style = PrimaryWhite,
        onClick = onClick,
        text = text,
    )
}

@Composable
fun Button(
    onClick: () -> Unit,
    text: String,
    style: Style,
) {
    Button(
        modifier = Modifier.height(50.dp),
        onClick = onClick,
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = style.backgroundColor,
            disabledBackgroundColor = style.disabledBackgroundColor,
        ),
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = text,
            color = style.textColor,
        )
    }
}

sealed class Style(
    val backgroundColor: Color,
    val disabledBackgroundColor: Color,
    val textColor: Color
)

object PrimaryWhite : Style(
    backgroundColor = White,
    disabledBackgroundColor = CloudyGray,
    textColor = Black
)

object PrimaryBlue : Style(
    backgroundColor = Blue,
    disabledBackgroundColor = CloudyGray,
    textColor = White
)

