package com.masahikokobayashi.androidlab

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
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
import com.masahikokobayashi.androidlab.ui.GameScreen
import com.masahikokobayashi.androidlab.ui.theme.AndroidLabTheme
import com.masahikokobayashi.androidlab.ui.theme.LemonadeTheme
import com.masahikokobayashi.androidlab.ui.theme.UnscrambleTheme

private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate Called")

        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            // UnscrambleTheme {
            //     Surface(
            //         modifier = Modifier.fillMaxSize()
            //             .statusBarsPadding()
            //             .verticalScroll(rememberScrollState())
            //             .safeDrawingPadding()
            //     ) {
            //         GameScreen()
            //     }
            // }
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
            text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp)
        )
        Text(
            text = shortDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
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
    Box(modifier) {
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
    var squeezeCount by remember { mutableIntStateOf(0) }

    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = "Lemonade", fontWeight = FontWeight.Bold
                )
            }, colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            )
        )
    }) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (step) {
                1 -> {
                    LemonTextAndImage(
                        textLabelResourceId = R.string.lemon_select,
                        drawableResourceId = R.drawable.lemon_tree,
                        contentDescriptionResourceId = R.string.lemon_tree_content_description,
                        onImageClick = {
                            step = 2
                            squeezeCount = (2..4).random()
                        })
                }

                2 -> {
                    LemonTextAndImage(
                        textLabelResourceId = R.string.lemon_squeeze,
                        drawableResourceId = R.drawable.lemon_squeeze,
                        contentDescriptionResourceId = R.string.lemon_content_description,
                        onImageClick = {
                            squeezeCount--

                            if (squeezeCount == 0) {
                                step = 3
                            }
                        })
                }

                3 -> {
                    LemonTextAndImage(
                        textLabelResourceId = R.string.lemon_drink,
                        drawableResourceId = R.drawable.lemon_drink,
                        contentDescriptionResourceId = R.string.lemonade_content_description,
                        onImageClick = { step = 4 })
                }

                4 -> {
                    LemonTextAndImage(
                        textLabelResourceId = R.string.lemon_empty_glass,
                        drawableResourceId = R.drawable.lemon_restart,
                        contentDescriptionResourceId = R.string.empty_glass_content_description,
                        onImageClick = { step = 1 },
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun LemonAppPreview() {
    LemonadeTheme {
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
