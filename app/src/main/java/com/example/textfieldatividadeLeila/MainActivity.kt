package com.example.textfieldatividadeLeila

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.textfieldatividade.ui.theme.TextFieldAtividadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldAtividadeTheme()
        }
    }
}

@Composable
fun TextFieldAtividadeTheme(){

    var valorDoMeuTextField by remember {
        mutableStateOf("Hello World")
    }
    TextField(value =valorDoMeuTextField , onValueChange ={valorDoMeuTextField = it})
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextFieldAtividadeTheme {
        //Greeting("Android")
    }
}