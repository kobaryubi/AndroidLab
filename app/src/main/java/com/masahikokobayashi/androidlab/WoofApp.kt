package com.masahikokobayashi.androidlab

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.masahikokobayashi.androidlab.data.Datasource
import com.masahikokobayashi.androidlab.ui.theme.woof.WoofTheme
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.res.dimensionResource

@Composable
fun WoofApp(modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier) { innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(Datasource.dogs) { dog ->
                DogItem(
                    dog = dog, modifier = Modifier.padding(
                        dimensionResource(R.dimen.padding_small)
                    )
                )
            }
        }
    }
}

@Preview
@Composable
private fun WoofAppPreview() {
    WoofTheme {
        WoofApp()
    }
}

@Preview
@Composable
private fun WoofAppDarkThemePreview() {
    WoofTheme(darkTheme = true) {
        WoofApp()
    }
}
