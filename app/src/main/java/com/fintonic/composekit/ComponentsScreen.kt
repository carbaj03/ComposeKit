package com.fintonic.composekit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ComponentsScreen(
    onClick: (String) -> Unit
) {
    LazyColumn {
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(50.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        modifier = Modifier.clickable { onClick("button") },
                        text = "Buttons"
                    )
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(50.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        modifier = Modifier.clickable { onClick("text") },
                        text = "Text"
                    )
                }
            }
        }
    }
}