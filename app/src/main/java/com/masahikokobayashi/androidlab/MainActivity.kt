package com.masahikokobayashi.androidlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.masahikokobayashi.androidlab.ui.theme.AndroidLabTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            AndroidLabTheme {
                JetpackComposeTutorial(
                    title = stringResource(R.string.title_jetpack_compose_tutorial),
                    shortDescription = stringResource(R.string.compose_short_desc),
                    longDescription = stringResource(R.string.compose_long_desc),
                    imagePainter = painterResource(R.drawable.bg_compose_background),
                )
            }
        }
    }
}

@Composable
fun JetpackComposeTutorial(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = shortDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp,  end = 16.dp)
        )
        Text(
            text = longDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) {
        Column(modifier = modifier) {
            Text(
                text = "Hello $name!",
                fontSize = 100.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = from,
                fontSize = 36.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.End)
            )
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box (modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
    }
}

@Preview
@Composable
fun GreetingPreview() {
    Greeting(
        name = "Meghan",
        from = "from Emma",
    )
}

@Preview
@Composable
fun AndroidLabPreview() {
    AndroidLabTheme {
        GreetingImage(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.signature_text),
        )
    }
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
