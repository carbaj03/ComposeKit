package com.fintonic.composekit.text.style

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fintonic.composekit.theme.DslColor
import com.fintonic.composekit.theme.cerebriSansFamily


inline fun <reified A> subclasses(): List<Pair<String, A>> =
    A::class.sealedSubclasses
        .filter { it.objectInstance != null }
        .map { klass -> klass.simpleName.toString() to klass.objectInstance!! }


sealed class Micro1(
    fontWeight: FontWeight = FontWeight.Light,
    color: DslColor
) : TextStyle(Normal, fontWeight, cerebriSansFamily, color) {
    companion object {
        val Normal = 15.sp
    }
}

object Micro1BlackRegular : Micro1(
    color = DslColor.Black,
    fontWeight = FontWeight.Normal
)

object Micro1Black : Micro1(
    color = DslColor.Black,
)

object Micro1Gray : Micro1(
    color = DslColor.Gray,
)