package com.fintonic.composekit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.bubble.Bubble
import com.fintonic.composekit.tag.Tag
import com.fintonic.composekit.text.*
import com.fintonic.composekit.text.style.*
import com.fintonic.composekit.theme.DslColor

@Composable
fun TextScreen() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {

        Bubble(text = "sadf", backGroundColor = DslColor.Yellow)

        Tag(text = "sadf", backGroundColor = DslColor.Yellow, borderColor = DslColor.Blue, textStyle = LinkWhite)

        H1Black(text = "H1Black")
        H1Gray(text = "H1Gray")
        Box(Modifier.background(Color.Black)) {
            H1White(text = "H1White")
        }

        H2Black(text = "H2Black")
        H2Gray(text = "H2Gray")
        H2Green(text = "H2Green")
        H2Red(text = "H2Red")
        H2White(text = "H2White")
        H2BlackBook(text = "H2BlackBook")

        H3Black(text = "H3Black")
        H3Gray(text = " H3Gray")
        H3Green(text = "H3Green")
        H3Pink(text = "H3Pink")
        H3Red(text = "H3Red")
        Box(Modifier.background(Color.Black)) {
            H3White(text = "H3White")
        }

        DisplayPrimary(text = DisplayPrimary::class.simpleName.toString())
        Box(Modifier.background(Color.Black)) {
            DisplayWhite(text = DisplayWhite::class.simpleName.toString())
        }
        DisplayBig(text = DisplayBig::class.simpleName.toString())

        NavBarActive(text = NavBarActive.toString())
        NavBarInactive(text = NavBarInactive.toString())
        Box(Modifier.background(Color.Black)) {
            NavBarBubble(text = NavBarBubble.toString())
        }

    }
}