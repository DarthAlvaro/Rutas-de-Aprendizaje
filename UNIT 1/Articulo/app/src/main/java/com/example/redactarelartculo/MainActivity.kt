package com.example.redactarelartculo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.redactarelartculo.ui.theme.RedactarElArtículoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RedactarElArtículoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Redactar(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun Redactar(modifier: Modifier = Modifier) {
    val imagen = painterResource(R.drawable.bg_compose_background)// definimos la ruta de la imagen
    val titulo = stringResource(R.string.Texto_Titulo)
    val texto1 = stringResource(R.string.Texto01)
    val texto2 = stringResource(R.string.Texto02)

    Column(modifier = modifier) {
        // Colocamos la imagen
        Image(
            painter = imagen,
            contentDescription = null,
        )
        // Colocamos el Titulo
        Text(
            text = titulo,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        // Colocamos el Texto 01
        Text(
            text = texto1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        )
        // Colocamos el Texto 02
        Text(
            text = texto2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true,
        showSystemUi = true,
        name = "Mi ventana de Articulo")
@Composable
fun ArticuloPreview() {
    RedactarElArtículoTheme {
        Redactar()
    }
}