package com.masahikokobayashi.androidlab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masahikokobayashi.androidlab.ui.theme.TipTimeTheme

@Composable
fun TipTimeLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .padding(top = 40.dp, bottom = 16.dp)
                .align(alignment = Alignment.Start)
        )
    }
}

@Preview
@Composable
fun TipTimeLayoutPreview() {
    TipTimeTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            TipTimeLayout(
                modifier = Modifier
                    .padding(horizontal = 40.dp)
            )
        }
    }
}
