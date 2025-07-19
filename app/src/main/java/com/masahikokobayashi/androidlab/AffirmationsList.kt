package com.masahikokobayashi.androidlab

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.masahikokobayashi.androidlab.model.Affirmation
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp

@Composable
fun AffirmationsList(
    affirmationList: List<Affirmation>
    , modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(affirmationList) { affirmation ->
            AffirmationCard(
                affirmation = affirmation,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
