package com.fintonic.composekit.button


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.contentColorFor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
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
    icon: @Composable () -> Unit = {},
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = Primary,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        icon = icon,
    )
}

@Composable
fun ButtonSecondary(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {},
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = Secondary,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        icon = icon,
    )
}

@Composable
fun ButtonWhite(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {},
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = White,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        icon = icon,
    )
}

@Composable
fun ButtonCloudyGray(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {},
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = CloudyGray,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        icon = icon,
    )
}

@Composable
fun ButtonGhostBlue(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {},
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = GhostBlue,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        icon = icon,
    )
}

@Composable
fun ButtonPrimarySmall(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {},
    enabled: Boolean = true,
) {
    Button(
        text = text,
        style = GhostBlueSmall,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        icon = icon,
    )
}

@Composable
internal fun Button(
    onClick: () -> Unit,
    text: String,
    style: ButtonStyle,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {},
    enabled: Boolean = true,
) {
    OutlinedButton(
        modifier = modifier
            .requiredHeight(style.height),
        onClick = onClick,
        enabled = enabled,
        shape = style.shape,
        contentPadding = PaddingValues(horizontal = 20.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = style.backgroundColor.color,
            contentColorFor(backgroundColor = style.backgroundColor.color),
            disabledBackgroundColor = style.disabledBackgroundColor.color,
        ),
        border = BorderStroke(1.dp, style.borderColorEnabled(enabled).color),
    ) {
        icon()

        Text(
            text = text,
            style = style.textColorEnabled(enabled),
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

@Preview
@Composable
fun Example3() {
    ButtonWhite(
        onClick = { /*TODO*/ },
        text = "White",
        enabled = false,
        icon = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null // decorative element
            )
        }
    )
}