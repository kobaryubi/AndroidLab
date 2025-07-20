package com.masahikokobayashi.androidlab

import androidx.compose.runtime.Composable
import com.masahikokobayashi.androidlab.data.Datasource

@Composable
fun CoursesApp() {
    TopicGrid(topics = Datasource.topics)
}
