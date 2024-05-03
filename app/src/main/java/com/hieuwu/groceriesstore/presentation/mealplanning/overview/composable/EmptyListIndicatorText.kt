package com.hieuwu.groceriesstore.presentation.mealplanning.overview.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun EmptyListIndicatorText(modifier: Modifier = Modifier) {
    Text(
        text = "No hay libros, agrega uno!",
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        textAlign = TextAlign.Center
    )
}