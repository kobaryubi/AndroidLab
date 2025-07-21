package com.masahikokobayashi.androidlab

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.masahikokobayashi.androidlab.ui.theme.woof.WoofTheme

@Composable
fun WoofApp(modifier: Modifier = Modifier) {
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
