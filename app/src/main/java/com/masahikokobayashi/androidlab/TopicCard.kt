package com.masahikokobayashi.androidlab

import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.masahikokobayashi.androidlab.data.Datasource
import com.masahikokobayashi.androidlab.model.Topic

@Composable
fun TopicCard(
    topic: Topic,
    modifier: Modifier = Modifier,
) {
    Card(modifier = modifier) {
    }
}

@Preview
@Composable
private fun TopicCardPreview() {
    val topic = Datasource.topics[0]
    TopicCard(topic)
}
