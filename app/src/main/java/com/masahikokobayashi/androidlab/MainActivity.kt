package com.masahikokobayashi.androidlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Greeting(
                name = "Android",
                from = "from Jetpack Compose",
            )
        }
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) {
        Row {
            Text(
                text = "Hello $name!",
                fontSize = 100.sp,
                lineHeight = 116.sp,
                modifier = modifier.padding(24.dp)
            )
            Text(
                text = from,
                fontSize = 36.sp
            )
        }
    }
}

@Preview
@Composable
fun GreetingPreview() {
    Greeting(
        name = "Meghan",
        from = "from Jetpack Compose",
    )
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Column {}
        Column {
            Row {}
            Row {}
            Row {}
        }
    }
}

@Preview
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}
