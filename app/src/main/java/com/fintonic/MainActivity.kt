package com.fintonic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeKitTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Navigator()
                }
//            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//    ComposeKitTheme {
//
//    }
}