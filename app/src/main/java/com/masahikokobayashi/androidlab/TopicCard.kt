package com.masahikokobayashi.androidlab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masahikokobayashi.androidlab.data.Datasource
import com.masahikokobayashi.androidlab.model.Topic

@Composable
fun TopicCard(
    topic: Topic,
    modifier: Modifier = Modifier,
) {
    Card(modifier = modifier) {
        Row {
            Image(
                painter = painterResource(topic.imageResourceId),
                contentDescription = stringResource(topic.stringResourceId),
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = stringResource(topic.stringResourceId),
                )
                Row {

                }
            }
        }
    }
}

@Preview
@Composable
private fun TopicCardPreview() {
    val topic = Datasource.topics[0]
    TopicCard(topic)
}
