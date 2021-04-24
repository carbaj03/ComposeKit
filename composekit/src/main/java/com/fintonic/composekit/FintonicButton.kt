package com.fintonic.composekit

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.theme.*
import com.fintonic.composekit.theme.White

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
        modifier = Modifier.height(50.dp),
        onClick = onClick,
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Blue,
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
fun PrimaryWhiteButton(
    onClick: () -> Unit,
    text: String,
) {
    Button(
        modifier = Modifier.height(50.dp),
        onClick = onClick,
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = White,
            disabledBackgroundColor = CloudyGray,
        ),
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = text,
            color = Black,
        )
    }
}