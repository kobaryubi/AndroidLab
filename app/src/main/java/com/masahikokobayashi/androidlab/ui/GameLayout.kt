package com.masahikokobayashi.androidlab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.masahikokobayashi.androidlab.R
import com.masahikokobayashi.androidlab.ui.theme.UnscrambleTheme

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
            Text(
                text = stringResource(R.string.instructions),
                textAlign = TextAlign.Center,
                style = typography.titleMedium,
            )
        }
    }
}

@Preview
@Composable
private fun GameLayoutPreview() {
    UnscrambleTheme {
        GameLayout()
    }
}
