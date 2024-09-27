package com.example.zad4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.zad4.ui.theme.Zad4Theme
import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Zad4Theme {
                DeltaCalculator()
            }
        }
    }
}

@Composable
fun DeltaCalculator() {
    Scaffold { padding ->
        val aValue = remember { mutableStateOf("2") }
        val bValue = remember { mutableStateOf("7") }
        val cValue = remember { mutableStateOf("3") }

        val a = aValue.value.toDoubleOrNull() ?: 0.0
        val b = bValue.value.toDoubleOrNull() ?: 0.0
        val c = cValue.value.toDoubleOrNull() ?: 0.0

        val delta = b.pow(2) - 4 * a * c
        val x1 = if (delta >= 0) (-b - sqrt(delta)) / (2 * a) else null
        val x2 = if (delta >= 0) (-b + sqrt(delta)) / (2 * a) else null

        val format = DecimalFormat("#")

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(padding),

        ) {
            Text(
                text = "Delta Calculator",
                fontSize = 50.sp,

            )
            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = aValue.value,
                onValueChange = { newValue -> aValue.value = newValue },
                label = { Text("Value a") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            TextField(
                value = bValue.value,
                onValueChange = { newValue -> bValue.value = newValue },
                label = { Text("Value b") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            TextField(
                value = cValue.value,
                onValueChange = { newValue -> cValue.value = newValue },
                label = { Text("Value c") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(text = "Delta: ${format.format(delta)}")

                if (delta >= 0) {
                    Text(text = "x1: ${format.format(x1)}")
                    Text(text = "x2: ${format.format(x2)}")
                }

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Zad4Theme {
        DeltaCalculator()
    }
}