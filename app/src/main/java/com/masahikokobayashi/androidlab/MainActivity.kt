package com.masahikokobayashi.androidlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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

            LemonApp()
        }
    }
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableIntStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = result.toString()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..6).random() }) {
            Text(stringResource(R.string.roll))
        }
    }
}

@Composable
fun TaskCompleted(
    modifier: Modifier = Modifier
) {
    val painter = painterResource(R.drawable.ic_task_completed)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = painter,
            contentDescription = null,
        )
        Text(
            text = stringResource(R.string.all_task_completed),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 24.dp,
                bottom = 8.dp,
            )
        )
        Text(
            text = stringResource(R.string.nice_work),
            fontSize = 16.sp,
        )
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

@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        onValueChange = {},
        modifier = modifier,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LemonApp() {
    var step by remember { mutableIntStateOf(1) }
    val image = painterResource(R.drawable.lemon_tree)

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text("Lemonade")
            })
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            when (step) {
                1 -> {
                    Button(onClick = { step = 2 }) {
                        Image(
                            painter = image,
                            contentDescription = stringResource(R.string.lemon_tree_content_description)
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(stringResource(R.string.lemon_select))
                }
                2 -> {
                    Button(onClick = { step = 3}) {
                        Image(
                            painter = painterResource(R.drawable.lemon_squeeze),
                            contentDescription = stringResource(R.string.lemon_content_description)
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(stringResource(R.string.lemon_squeeze))
                }
                3 -> {
                    Button(onClick = { step = 4 }) {
                        Image(
                            painter = painterResource(R.drawable.lemon_drink),
                            contentDescription = stringResource(R.string.lemonade_content_description)
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(stringResource(R.string.lemon_drink))
                }
                4 -> {
                    Button(onClick = { step = 1 }) {
                        Image(
                            painter = painterResource(R.drawable.lemon_restart),
                            contentDescription = stringResource(R.string.empty_glass_content_description)
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(stringResource(R.string.lemon_empty_glass))
                }
            }
        }
    }
}

@Preview
@Composable
fun LemonAppPreview() {
    AndroidLabTheme {
        LemonApp()
    }
}

@Preview
@Composable
fun JetpackComposeTutorialPreview() {
    AndroidLabTheme {
        JetpackComposeTutorial(
            title = stringResource(R.string.title_jetpack_compose_tutorial),
            shortDescription = stringResource(R.string.compose_short_desc),
            longDescription = stringResource(R.string.compose_long_desc),
            imagePainter = painterResource(R.drawable.bg_compose_background),
        )
    }
}

@Preview
@Composable
fun TaskCompletedPreview() {
    AndroidLabTheme {
        TaskCompleted()
    }
}

@Preview
@Composable
fun SearchBarPreview() {
    AndroidLabTheme {
        SearchBar()
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

@Preview
@Composable
fun DiceRollerAppPreview() {
    AndroidLabTheme {
        DiceWithButtonAndImage(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize()
        )
    }
}
