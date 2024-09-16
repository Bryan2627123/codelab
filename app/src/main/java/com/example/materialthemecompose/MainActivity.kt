package com.example.materialthemecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.materialthemecompose.ui.theme.MaterialThemeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialThemeComposeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column {
        Text(text = "Sistema de Alarma para Sobrecarga de Enchufe")
        Button(onClick = {}) {
            Text("Activar Sistema")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialThemeComposeTheme {
        MainScreen()
    }
}

