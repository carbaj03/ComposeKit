package com.fintonic.composekit

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FintonicButton(
    onClick: () -> Unit,
    text: String,
) {
    Button(
        modifier = Modifier.height(50.dp),
        onClick = onClick,
        shape = RoundedCornerShape(25.dp),
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = text
        )
    }
}