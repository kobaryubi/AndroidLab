package com.masahikokobayashi.androidlab

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.masahikokobayashi.androidlab.data.Datasource

@Composable
fun CoursesApp(modifier: Modifier = Modifier) {
    TopicGrid(topics = Datasource.topics, modifier = modifier)
}
