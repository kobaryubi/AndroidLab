package com.masahikokobayashi.androidlab

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.masahikokobayashi.androidlab.data.Datasource
import com.masahikokobayashi.androidlab.model.Dog
import com.masahikokobayashi.androidlab.ui.theme.woof.WoofTheme

@Composable
fun DogItem(
    dog: Dog,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            DogIcon(
                dogIcon = dog.imageResourceId,
            )
            DogInformation(
                dogName = dog.name,
                dogAge = dog.age,
            )
        }
    }
}

@Preview
@Composable
private fun DogItemPreview() {
    val dog = Datasource.dogs[0]

    WoofTheme {
        DogItem(
            dog = dog,
        )
    }
}