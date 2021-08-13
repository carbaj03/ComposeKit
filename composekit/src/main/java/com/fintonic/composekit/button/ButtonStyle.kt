package com.fintonic.composekit.button

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.text.style.LinkBlue
import com.fintonic.composekit.text.style.LinkDisabled
import com.fintonic.composekit.text.style.LinkWhite
import com.fintonic.composekit.text.style.TextStyle
import com.fintonic.composekit.theme.DslColor

sealed class ButtonStyle(
    val backgroundColor: DslColor,
    val shape: Shape,
    val borderColor: DslColor,
    val textStyle: TextStyle,
    val disabledBackgroundColor: DslColor = DslColor.CloudyGray,
    val height: Dp = Normal,
    private val disabledBorderColor: DslColor = DslColor.CloudyGray,
    private val disabledTextStyle: TextStyle = LinkDisabled,
) {
    companion object {
        val shapeDefault = RoundedCornerShape(25.dp)
        val shapeIcon = CircleShape

        val Normal: Dp = 50.dp
        val Small: Dp = 30.dp
    }

    fun textColorEnabled(enabled: Boolean): TextStyle =
        if (enabled) textStyle else disabledTextStyle

    fun borderColorEnabled(enabled: Boolean): DslColor =
        if (enabled) borderColor else disabledBorderColor
}

object Primary : ButtonStyle(
    backgroundColor = DslColor.Blue,
    shape = shapeDefault,
    textStyle = LinkWhite,
    borderColor = DslColor.Blue,
)

object Secondary : ButtonStyle(
    backgroundColor = DslColor.Salmon,
    shape = shapeDefault,
    textStyle = LinkWhite,
    borderColor = DslColor.Salmon,
)

object White : ButtonStyle(
    backgroundColor = DslColor.White,
    shape = shapeDefault,
    textStyle = LinkBlue,
    borderColor = DslColor.White,
)

object GhostBlue : ButtonStyle(
    backgroundColor = DslColor.Transparent,
    shape = shapeDefault,
    textStyle = LinkBlue,
    borderColor = DslColor.Blue,
    disabledBackgroundColor = DslColor.White,
    disabledBorderColor = DslColor.LightGray
)


object GhostBlueSmall : ButtonStyle(
    backgroundColor = DslColor.Transparent,
    shape = shapeDefault,
    textStyle = LinkBlue,
    borderColor = DslColor.Blue,
    disabledBackgroundColor = DslColor.White,
    disabledBorderColor = DslColor.LightGray,
    height = Small,
)

object Icon : ButtonStyle(
    backgroundColor = DslColor.Blue,
    shape = shapeIcon,
    textStyle = LinkBlue,
    borderColor = DslColor.Blue,
)
