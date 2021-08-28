package com.fintonic.composekit

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.fintonic.composekit.input.InputText
import com.fintonic.composekit.input.SubText

object InputScreen {
    const val route = "input"
}

@Composable
fun InputScreen() {
    val localFocusManager = LocalFocusManager.current

    var text by remember { mutableStateOf("") }
    var subText: SubText? by remember { mutableStateOf(null) }
    var text1 by remember { mutableStateOf("") }
    var subText1: SubText? by remember { mutableStateOf(null) }

    val onTextChange = { newText: String ->
        text = newText
        subText = when {
            newText.isBlank() -> null
            newText.contains("a") -> SubText.Error("error")
            else -> SubText.Info("you couldn't ")
        }
    }

    val onTextChange1 = { newText: String ->
        text1 = newText
        subText1 = when {
            newText.isBlank() -> null
            newText.contains("b") -> SubText.Error("error")
            else -> SubText.Info("you couldn't ")
        }
    }

    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
    ) {
        Row {
            InputText(
                modifier = Modifier
                    .weight(1f),
                text = text1,
                onTextChange = onTextChange1,
                label = "label",
                subText = subText1,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions(onNext = { localFocusManager.clearFocus() }),
            )

            Spacer(modifier = Modifier.width(20.dp))

            InputText(
                modifier = Modifier
                    .weight(1f),
                text = "",
                onTextChange = {},
                label = "label",
                subText = SubText.Error("error"),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions(onNext = { localFocusManager.clearFocus() }),
            )
        }

        InputText(
            text = text,
            onTextChange = onTextChange,
            label = "label",
            subText = subText,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(onNext = { localFocusManager.clearFocus() }),
        )

        InputText(
            text = "",
            onTextChange = {  },
            placeholder = "Nothing",
            label = "label2",
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(onNext = { localFocusManager.clearFocus() }),
        )
    }
}


