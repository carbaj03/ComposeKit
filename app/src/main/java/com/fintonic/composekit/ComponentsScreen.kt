package com.fintonic.composekit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ComponentsScreen(
    onClick: (String) -> Unit
) {
    LazyColumn {
        item {
            Text(
                modifier = Modifier.clickable { onClick("button") },
                text = "Buttons"
            )
            Text(
                modifier = Modifier.clickable { onClick("text") },
                text = "Text"
            )
        }
    }
}