package com.fintonic.composekit.input

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
import com.fintonic.composekit.text.H3Gray
import com.fintonic.composekit.text.InputError
import com.fintonic.composekit.text.InputInfo
import com.fintonic.composekit.text.Micro1BlackRegular
import com.fintonic.composekit.text.style.H3Black
import com.fintonic.composekit.text.style.Input
import com.fintonic.composekit.text.style.InputError
import com.fintonic.composekit.text.style.InputInfo
import com.fintonic.composekit.theme.DslColor


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
                if (!focused && text.isBlank())
                    H3Gray(text = placeholder ?: label)

                BasicTextField(
                    modifier = modifier
                        .fillMaxWidth()
                        .focusRequester(focusRequester),
                    value = text,
                    onValueChange = { onTextChange(it) },
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

            if (text.isNotBlank() || !readOnly && !enabled)
                Icon(
                    modifier = Modifier.clickable {
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
