package com.fintonic.composekit.button

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.text.style.LinkBlue
import com.fintonic.composekit.text.style.LinkDisabled
import com.fintonic.composekit.text.style.LinkWhite
import com.fintonic.composekit.text.style.TextStyle
import com.fintonic.composekit.theme.DslColor

sealed class ButtonStyle(
    val backgroundColor: DslColor,
    val disabledBackgroundColor: DslColor,
    val shape: Shape,
    val textStyle: TextStyle,
    val disabledTextStyle: TextStyle = LinkDisabled,
) {
    companion object {
        val shapeDefault = RoundedCornerShape(25.dp)
        val shapeIcon = CircleShape
    }

    fun colorEnabled(enabled: Boolean): TextStyle =
        if (enabled) textStyle else disabledTextStyle
}

object Primary : ButtonStyle(
    backgroundColor = DslColor.Blue,
    disabledBackgroundColor = DslColor.CloudyGray,
    shape = shapeDefault,
    textStyle = LinkWhite,
)

object Secondary : ButtonStyle(
    backgroundColor = DslColor.Salmon,
    disabledBackgroundColor = DslColor.CloudyGray,
    shape = shapeDefault,
    textStyle = LinkWhite,
)

object White : ButtonStyle(
    backgroundColor = DslColor.White,
    disabledBackgroundColor = DslColor.CloudyGray,
    shape = shapeDefault,
    textStyle = LinkBlue,
)

object GhostBlue : ButtonStyle(
    backgroundColor = DslColor.Transparent,
    disabledBackgroundColor = DslColor.LightGray,
    shape = shapeDefault,
    textStyle = LinkBlue,
)

object Icon : ButtonStyle(
    backgroundColor = DslColor.Blue,
    disabledBackgroundColor = DslColor.CloudyGray,
    shape = shapeIcon,
    textStyle = LinkBlue,
)