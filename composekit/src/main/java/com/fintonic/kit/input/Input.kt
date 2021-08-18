package com.fintonic.kit.input

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.fintonic.kit.text.H3Gray
import com.fintonic.kit.text.InputError
import com.fintonic.kit.text.InputInfo
import com.fintonic.kit.text.Micro1BlackRegular
import com.fintonic.kit.text.style.H3Black
import com.fintonic.kit.text.style.Input
import com.fintonic.kit.text.style.InputError
import com.fintonic.kit.text.style.InputInfo
import com.fintonic.kit.theme.DslColor


@Composable
fun InputText(
    text: String,
    onTextChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    subText: SubText? = null,
    placeholder: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    enabled: Boolean = true,
    readOnly: Boolean = false,
) {
    var value by remember {
        mutableStateOf(text)
    }

    var focused by remember {
        mutableStateOf(false)
    }

    val focusRequester = FocusRequester()

    Column(
        modifier = modifier
            .defaultMinSize(minWidth = TextFieldDefaults.MinWidth)
            .onFocusChanged { focused = it.isFocused }
//            .clickable(
//                interactionSource = MutableInteractionSource(),
//                indication = null,
//                onClick = { if (!focused) focused = true }
//            )
    ) {
        Micro1BlackRegular(text = label)

        Row {

            Box(
                modifier = modifier
                    .weight(1f)
            ) {
                if (!focused && value.isBlank())
                    H3Gray(text = placeholder ?: label)

                BasicTextField(
                    modifier = modifier
                        .fillMaxWidth()
                        .focusRequester(focusRequester),
                    value = value,
                    onValueChange = { value = it; onTextChange(it) },
                    textStyle = H3Black.textStyle(),
                    keyboardActions = keyboardActions,
                    keyboardOptions = keyboardOptions,
                    maxLines = maxLines,
                    singleLine = maxLines == 1,
                    enabled = enabled,
                    readOnly = readOnly,
                    cursorBrush = SolidColor(DslColor.Blue.color),
//            decorationBox =,
//            interactionSource =,
//            onTextLayout =,
//            visualTransformation =,
                )
            }

            if (value.isNotBlank())
                Icon(
                    modifier = Modifier.clickable {
                        value = ""
                        onTextChange("")
                        focusRequester.requestFocus()
                    },
                    imageVector = Icons.Default.Clear,
                    contentDescription = null // decorative element
                )
        }

        Spacer(modifier = Modifier.height(4.dp))

        Divider(
            Modifier
                .height(Dp(0.5f))
                .background(DslColor.Blue.color)
        )

        subText?.let {
            when (it) {
                is SubText.Error -> InputError(text = it.text)
                is SubText.Info -> InputInfo(text = it.text)
            }
        }
    }
}


sealed class SubText(
    text: String,
    style: Input
) {
    data class Error(
        val text: String,
    ) : SubText(text, InputError)

    data class Info(
        val text: String
    ) : SubText(text, InputInfo)
}
