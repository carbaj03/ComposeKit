package com.fintonic.composekit.button


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.text.Text


@Composable
fun ButtonPrimary(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = Primary,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
    )
}

@Composable
fun ButtonSecondary(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = Secondary,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
    )
}

@Composable
fun ButtonWhite(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = White,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
    )
}

@Composable
fun ButtonGhostBlue(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = GhostBlue,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
    )
}

@Composable
internal fun Button(
    onClick: () -> Unit,
    text: String,
    style: ButtonStyle,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    OutlinedButton(
        modifier = modifier
            .requiredHeight(50.dp),
        onClick = onClick,
        enabled = enabled,
        shape = style.shape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = style.backgroundColor.color,
            contentColorFor(backgroundColor = style.backgroundColor.color),
            disabledBackgroundColor = style.disabledBackgroundColor.color,
        ),
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = text,
            style = style.colorEnabled(enabled),
            maxLines = 1,

        )
    }
}

@Preview
@Composable
fun Example() {
    ButtonWhite(onClick = { /*TODO*/ }, text = "White")
}


@Preview
@Composable
fun Example2() {
    ButtonWhite(onClick = { /*TODO*/ }, text = "White", enabled = false)
}