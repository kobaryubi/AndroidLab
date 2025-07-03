package com.masahikokobayashi.androidlab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.calculate_tip)
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
