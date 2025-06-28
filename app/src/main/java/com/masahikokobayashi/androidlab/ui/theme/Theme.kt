package com.masahikokobayashi.androidlab.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AndroidLabTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content
    )
}

@Composable
fun LemonadeTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content
    )
}
