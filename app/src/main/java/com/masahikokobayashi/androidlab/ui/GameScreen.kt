package com.masahikokobayashi.androidlab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.masahikokobayashi.androidlab.R
import com.masahikokobayashi.androidlab.ui.theme.UnscrambleTheme

@Composable
fun GameScreen(
    modifier: Modifier = Modifier,
    gameViewModel: GameViewModel = viewModel(),
) {
    val gameUiState by gameViewModel.uiState.collectAsState()

    Column(modifier = modifier) {
        Text(
            text = stringResource(R.string.app_name),
            style = typography.titleLarge
        )
        GameLayout()
    }
}

@Preview
@Composable
private fun GameScreenPreview() {
    UnscrambleTheme {
        GameScreen()
    }
}