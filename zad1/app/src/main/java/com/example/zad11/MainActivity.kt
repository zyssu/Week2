package com.example.zad11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zad11.ui.theme.Zad11Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Zad11Theme {
    Column { Row { Greeting(
        imageid = R.drawable.zdj1

    )
        Greeting(
            imageid = R.drawable.zdj2

        )
        Greeting(
            imageid = R.drawable.zdj3

        ) }
        Row { Greeting(
            imageid = R.drawable.zdj4

        )
            Greeting(
                imageid = R.drawable.zdj5

            )
            Greeting(
                imageid = R.drawable.zdj6

            ) }

        Row { Greeting(
            imageid = R.drawable.zdj7

        )
            Greeting(
                imageid = R.drawable.zdj8

            )
            Greeting(
                imageid = R.drawable.zdj9

            ) } }





            }
        }
    }
}

@Composable
fun Greeting(imageid:Int) {

    Image(
        painter = painterResource(id = imageid),
        contentDescription = null,
        Modifier
            .size(100.dp),
            contentScale = ContentScale.FillBounds



    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Zad11Theme {

    }
}