package com.fintonic.composekit.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.R
import com.fintonic.composekit.theme.DslColor

@Composable
fun ButtonArrow(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    tint: DslColor = DslColor.Unspecified
) {
    ButtonIcon(
        onClick = onClick,
        icon = R.drawable.ic_amazon_background_transparent,
        style = Icon,
        modifier = modifier,
        enabled = enabled,
        tint = tint
    )
}


@Composable
internal fun ButtonIcon(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    style: ButtonStyle,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    tint: DslColor = DslColor.Unspecified
) {
    OutlinedButton(
        modifier = modifier
            .requiredSize(50.dp),
        onClick = onClick,
        enabled = enabled,
        shape = style.shape,
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = style.backgroundColor.color,
            contentColorFor(backgroundColor = style.backgroundColor.color),
            disabledBackgroundColor = style.disabledBackgroundColor.color,
        ),
    ) {
        Icon(
            painter = painterResource(id = icon),
            tint = tint.color,
            contentDescription = null // decorative element
        )
    }
}

@Preview
@Composable
fun ExampleIcon() {
    Column() {

        ButtonArrow(onClick = {})

    }
}