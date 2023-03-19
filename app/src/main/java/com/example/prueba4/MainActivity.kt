package com.example.prueba4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prueba4.ui.theme.Prueba4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prueba4Theme {
               Scaffold(
                   topBar = {
                       TopAppBar() {
                           Text("Contador")
                       }
                   }
               ) {
                   Surface(modifier = Modifier.padding(it)){
                       Contador()
                   }
               }
            }
        }
    }
}

@Composable
fun Contador(){
    var numero by remember{ mutableStateOf(0) }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Este es un ejemplo de Estado")
        Row() {
            Button(onClick = { numero++ }) {
                Text("Contador")
            }
            OutlinedButton(onClick = { numero=0 }) {
                Text("Resetear")
            }
        }

        Text("Diste $numero clicks")
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorPreview(){
    Prueba4Theme{
        Contador()
    }
}
