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

        Bubble(
            text = "Bubble",
            backGroundColor = DslColor.YellowLight
        )

        Bubble(
            text = "Bubble",
            backGroundColor = DslColor.YellowLight,
            active = false
        )

        Tag(
            text = "Tag",
            backGroundColor = DslColor.Yellow,
            borderColor = DslColor.Blue,
            textStyle = LinkWhite
        )

        H1Black(text = H1Black.name)
        H1Gray(text = H1Gray.name)
        Box(Modifier.background(Color.Black)) {
            H1White(text = H1White.name)
        }

//        H2Black(text = H2Black.name)
//        H2Gray(text = H2Gray.name)
//        H2Green(text = H2Green.name)
//        H2Red(text = H2Red.name)
//        H2White(text = H2White.name)
//        H2BlackBook(text = H2BlackBook.name)
        subclasses<H2>().forEach {
            Text(it.first, it.second)
        }

        H3Black(text = H3Black.name)
        H3Gray(text = H3Gray.name)
        H3Green(text = H3Green.name)
        H3Pink(text = H3Pink.name)
        H3Red(text = H3Red.name)
        Box(Modifier.background(Color.Black)) {
            H3White(text = H3White.name)
        }

        DisplayPrimary(text = DisplayPrimary.name)
        Box(Modifier.background(Color.Black)) {
            DisplayWhite(text = DisplayWhite.name)
        }
        DisplayBig(text = DisplayBig.name)

        NavBarActive(text = NavBarActive.name)
        NavBarInactive(text = NavBarInactive.name)
        Box(Modifier.background(Color.Black)) {
            NavBarBubble(text = NavBarBubble.name)
        }

        subclasses<Micro1>().forEach {
            Text(it.first, it.second)
        }
    }
}

inline val <reified A> A.name: String
    get() =
        A::class.simpleName.toString()