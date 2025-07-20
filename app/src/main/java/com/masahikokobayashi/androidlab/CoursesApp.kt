package com.masahikokobayashi.androidlab

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.masahikokobayashi.androidlab.data.Datasource

@Composable
fun CoursesApp(modifier: Modifier = Modifier) {
    TopicGrid(
        topics = Datasource.topics, modifier = modifier.padding(
            start = dimensionResource(R.dimen.padding_small),
            top = dimensionResource(R.dimen.padding_small),
            end = dimensionResource(R.dimen.padding_small),
        )
    )
}
