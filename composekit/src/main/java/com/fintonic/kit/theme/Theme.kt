package com.fintonic.kit.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val BrandPalette = lightColors(
    primary = DslColor.Blue.color,
    secondary = DslColor.Salmon.color,
    surface = DslColor.White.color,
    background = DslColor.White.color,
)

private val DarkColorPalette = darkColors(
    primary = DslColor.White.color,
    secondary = DslColor.Salmon.color,
)

private val LightColorPalette = lightColors(
    primary = DslColor.Blue.color,
    primaryVariant = DslColor.Blue.color,
    secondary = DslColor.Salmon.color,
)

@Composable
fun ComposeKitTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        BrandPalette
    }

    MaterialTheme(
        colors = colors,
        shapes = Shapes,
        content = content
    )
}
