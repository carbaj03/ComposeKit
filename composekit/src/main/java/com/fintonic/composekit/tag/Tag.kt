package com.fintonic.composekit.tag

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.text.Text
import com.fintonic.composekit.text.style.Link
import com.fintonic.composekit.text.style.LinkPrimary
import com.fintonic.composekit.theme.DslColor

@Composable
fun Tag(
    text: String,
    backGroundColor: DslColor,
    borderColor: DslColor,
    textStyle: Link,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .background(
                color = backGroundColor.color,
                shape = RoundedCornerShape(30.dp)
            )
            .border(
                width = 1.dp,
                color = borderColor.color,
                shape = RoundedCornerShape(30.dp)
            )
            .padding(
                start = 10.dp,
                end = 10.dp,
                top = 4.dp,
                bottom = 4.dp,
            )
    ) {
        Text(text = text, style = textStyle)
    }
}

@Preview
@Composable
fun TagExample() {
    Tag(
        text = "example",
        backGroundColor = DslColor.White,
        borderColor = DslColor.Blue,
        textStyle = LinkPrimary
    )
}