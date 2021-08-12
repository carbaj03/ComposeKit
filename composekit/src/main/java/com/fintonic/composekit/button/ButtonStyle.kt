package com.fintonic.composekit.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.text.style.LinkBlue
import com.fintonic.composekit.text.style.LinkWhite
import com.fintonic.composekit.text.style.TextStyle
import com.fintonic.composekit.theme.DslColor

sealed class ButtonStyle(
    val backgroundColor: DslColor,
    val disabledBackgroundColor: DslColor,
    val shape: Shape,
    val textStyle: TextStyle
) {
    companion object {
        val shapeDefault = RoundedCornerShape(25.dp)
    }
}

object Primary : ButtonStyle(
    backgroundColor = DslColor.Blue,
    disabledBackgroundColor = DslColor.CloudyGray,
    shape = shapeDefault,
    textStyle = LinkWhite
)

object Secondary : ButtonStyle(
    backgroundColor = DslColor.Salmon,
    disabledBackgroundColor = DslColor.CloudyGray,
    shape = shapeDefault,
    textStyle = LinkWhite
)

object White : ButtonStyle(
    backgroundColor = DslColor.White,
    disabledBackgroundColor = DslColor.CloudyGray,
    shape = shapeDefault,
    textStyle = LinkBlue
)