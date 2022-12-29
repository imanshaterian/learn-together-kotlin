package com.example.learn_together_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_together_kotlin.ui.theme.LearntogetherkotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearntogetherkotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainPage()
                }
            }
        }
    }
}

@Composable
fun MainPage(){
    Column(){
        MainPagePic()
        MainPageText()
    }
}

@Composable
fun MainPagePic(){
    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth())
}

@Composable
fun MainPageText() {
    Column(){
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI." +
                    " Compose simplifies and accelerates UI " +
                    "development on Android with less code," +
                    " powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. " +
                    "You call Compose functions to say " +
                    "what elements you want and the Compose compiler does the rest. " +
                    "Compose is built around Composable functions. " +
                    "These functions let you " +
                    "define your app\'s UI programmatically because they " +
                    "let you describe how it should look and provide data dependencies, " +
                    "rather than focus on the process of the UI\'s construction, " +
                    "such as initializing an element and then attaching it to a parent. " +
                    "To create a Composable function, " +
                    "you add the @Composable annotation to the function name.,",
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearntogetherkotlinTheme {
        MainPage()
    }
}