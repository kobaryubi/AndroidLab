package com.masahikokobayashi.androidlab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.masahikokobayashi.androidlab.R

@Composable
fun GameLayout(modifier: Modifier = Modifier) {
    val mediumPadding = dimensionResource(R.dimen.padding_medium)

    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(mediumPadding)
        ) {
            Text(
                text = "scrambleun",
                style = typography.displayMedium
            )
        }
    }
}
