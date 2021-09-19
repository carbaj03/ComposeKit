package com.fintonic.composekit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import me.onebone.toolbar.CollapsingToolbarScaffold
import me.onebone.toolbar.ScrollStrategy
import me.onebone.toolbar.rememberCollapsingToolbarScaffoldState

object CustomScreen {
    const val route = "custom"
}

@Composable
fun CustomScreen() {
//    MyBasicColumn(Modifier.padding(8.dp)) {
//        Text("MyBasicColumn")
//        Text("places items")
//        Text("vertically.")
//        Text("We've done it by hand!")
//    }
    CollapsingToolbarScaffold(
        state = rememberCollapsingToolbarScaffoldState(), // provide the state of the scaffold
        toolbar = {
            Text(
                text = "Title",
                modifier = Modifier
                    .road(
                        whenCollapsed = Alignment.CenterStart,
                        whenExpanded = Alignment.BottomEnd
                    )
            )
        },
        scrollStrategy = ScrollStrategy.EnterAlwaysCollapsed,
        modifier = Modifier
    ) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()) // main content should be scrollable for CollapsingToolbarScaffold to consume nested scroll
        ) {
            (1..1000).forEach { _ ->
                Text("MyBasicColumn")
            }

        }
    }
}


@Composable
fun MyBasicColumn(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Layout(
        modifier = modifier,
        content = content
    ) { measurables, constraints ->
        // Don't constrain child views further, measure them with given constraints
        // List of measured children
        val placeables = measurables.map { measurable ->
            // Measure each children
            measurable.measure(constraints)
        }

        // Set the size of the layout as big as it can
        layout(constraints.maxWidth, constraints.maxHeight) {
            // Track the y co-ord we have placed children up to
            var yPosition = 0

            // Place children in the parent layout
            placeables.forEach { placeable ->
                // Position item on the screen
                placeable.placeRelative(x = 0, y = yPosition)

                // Record the y co-ord placed up to
                yPosition += placeable.height
            }
        }
    }
}