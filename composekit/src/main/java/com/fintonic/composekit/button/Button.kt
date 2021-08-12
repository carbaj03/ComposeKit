package com.fintonic.composekit.button


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.text.Text


@Composable
fun ButtonPrimary(
    onClick: () -> Unit,
    text: String,
    fillMaxWith: Boolean = false,
) {
    Button(
        text = text,
        style = Primary,
        onClick = onClick,
        fillMaxWith = fillMaxWith
    )
}

@Composable
fun ButtonSecondary(
    onClick: () -> Unit,
    text: String,
    fillMaxWith: Boolean = false,
) {
    Button(
        text = text,
        style = Secondary,
        onClick = onClick,
        fillMaxWith = fillMaxWith
    )
}

@Composable
fun ButtonWhite(
    onClick: () -> Unit,
    text: String,
    fillMaxWith: Boolean = false,
) {
    Button(
        text = text,
        style = White,
        onClick = onClick,
        fillMaxWith = fillMaxWith
    )
}

@Composable
internal fun Button(
    onClick: () -> Unit,
    text: String,
    style: ButtonStyle,
    fillMaxWith: Boolean = false,
) {
    var modifier = Modifier.height(50.dp)
    modifier = if (fillMaxWith) modifier.fillMaxWidth() else modifier
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = style.shape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = style.backgroundColor.color,
            disabledBackgroundColor = style.disabledBackgroundColor.color,
        ),
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = text,
            style = style.textStyle,
        )
    }
}