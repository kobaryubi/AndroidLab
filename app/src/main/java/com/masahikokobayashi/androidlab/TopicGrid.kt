package com.masahikokobayashi.androidlab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masahikokobayashi.androidlab.data.Datasource
import com.masahikokobayashi.androidlab.model.Topic

@Composable
fun TopicGrid(
    topics: List<Topic>,
    modifier: Modifier = Modifier,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier,
    ) {
        items(topics) { topic ->
            TopicCard(topic)
        }
    }
}

@Preview
@Composable
private fun TopicGridPreview() {
    TopicGrid(
        topics = Datasource.topics,
    )
}
