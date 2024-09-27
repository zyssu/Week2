package com.example.zad2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.zad2.ui.theme.Zad2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Zad2Theme {
                Productlist()
            }
        }
    }
}

@Composable
fun Productlist(){
    val products = listOf(
        "jablko",
        "banan",
        "mleko",
        "pomarancze",
        "salata",
        "ciastka",
        "czekolada",
        "jogurt",
        "ser",
        "szynka",
    )
    LazyColumn(Modifier.systemBarsPadding()) { items(products){product ->
        Text(text = product)
    } }
}