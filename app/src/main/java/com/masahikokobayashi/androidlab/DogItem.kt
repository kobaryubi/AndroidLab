package com.masahikokobayashi.androidlab

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.masahikokobayashi.androidlab.model.Dog

@Composable
fun DogIItem(
    dog: Dog,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
    ) {
        Row {}
    }
}
