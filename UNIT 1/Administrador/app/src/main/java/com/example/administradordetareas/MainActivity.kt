package com.example.administradordetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administradordetareas.ui.theme.AdministradorDeTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdministradorDeTareasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TareaCompletada(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun TareaCompletada(modifier: Modifier = Modifier) {
    val imagen = painterResource(R.drawable.ic_task_completed)
    val texto1 = stringResource(R.string.Texto01)
    val texto2 = stringResource(R.string.Texto02)

    Column (
        verticalArrangement = Arrangement.Center,//superior e inferior
        horizontalAlignment = Alignment.CenterHorizontally,//  a los costados
        modifier = modifier
            .fillMaxSize()
    ) {
        // Colocamos la imagen
        Image(
            painter = imagen,
            contentDescription = null,
        )
        // Colocamos el Texto 01
        Text(
            text = texto1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        // Colocamos el Texto 02
        Text(
            text = texto2,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true,
        showSystemUi = true,
        name = "Pantalla de tarea completada")
@Composable
fun TareaCompletadaPreview() {
    AdministradorDeTareasTheme {
        TareaCompletada()
    }
}