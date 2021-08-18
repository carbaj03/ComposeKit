package com.fintonic

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fintonic.kit.datepicker.DatePickerDialog

object ComponentsScreen {
    const val route = "components"
}

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
                    .clickable { onClick(ButtonScreen.route) },
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = "Buttons"
                    )
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(50.dp)
                    .clickable { onClick(TextScreen.route) }
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = "Text"
                    )
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(50.dp)
                    .clickable { onClick(InputScreen.route) }
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = "Input"
                    )
                }
            }

            var dialog by remember {
                mutableStateOf(false)
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(50.dp)
                    .clickable { dialog = true }
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = "Input"
                    )
                }
            }

            DatePickerDialog(dialog, { dialog = it })
        }
    }
}