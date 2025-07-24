package com.masahikokobayashi.androidlab.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.masahikokobayashi.androidlab.R
import com.masahikokobayashi.androidlab.ui.theme.UnscrambleTheme

@Composable
fun GameScreen(
    modifier: Modifier = Modifier,
    gameViewModel: GameViewModel = viewModel(),
) {
    val gameUiState by gameViewModel.uiState.collectAsState()
    val mediumPadding = dimensionResource(R.dimen.padding_medium)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(mediumPadding),
    ) {
        Text(
            text = stringResource(R.string.app_name),
            style = typography.titleLarge
        )
        GameLayout(
            currentScrambledWord = gameUiState.currentScrambledWord,
            userGuess = gameViewModel.userGuess,
            isGuessError = gameUiState.isGuessedWordWrong,
            wordCount = gameUiState.currentWordCount,
            onUserGuessChanged = { gameViewModel.updateUserGuess(it) },
            onKeyboardDone = { gameViewModel.checkUserGuess() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(mediumPadding)
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(mediumPadding),
            modifier = Modifier.padding(mediumPadding),
        ) {
            Button(
                onClick = { gameViewModel.checkUserGuess() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(R.string.submit),
                    fontSize = 16.sp,
                )
            }
            OutlinedButton(
                onClick = { gameViewModel.skipWord() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(R.string.skip),
                    fontSize = 16.sp,
                )
            }
        }
        GameStatus(score = gameUiState.score, modifier = Modifier.padding(20.dp))
    }
}

@Preview
@Composable
private fun GameScreenPreview() {
    UnscrambleTheme {
        GameScreen()
    }
}