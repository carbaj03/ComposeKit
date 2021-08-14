package com.fintonic.composekit

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.input.InputText
import com.fintonic.composekit.input.SubText

object InputScreen {
    const val route = "input"
}

@Composable
fun InputScreen() {

    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
    ) {
        Row {

            InputText(
                modifier = Modifier
                    .weight(1f),
                text = "",
                label = "label",
                subText = SubText.Error("error"),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
            )

            Spacer(modifier = Modifier.width(20.dp))

            InputText(
                modifier = Modifier
                    .weight(1f),
                text = "",
                label = "label",
                subText = SubText.Error("error"),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
            )
        }

        InputText(
            text = "asf",
            label = "label",
            subText = SubText.Error("error"),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )
    }
}


