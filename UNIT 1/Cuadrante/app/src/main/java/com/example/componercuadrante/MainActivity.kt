package com.example.componercuadrante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.componercuadrante.ui.theme.ComponerCuadranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponerCuadranteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    VistaCuadrante(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun VistaCuadrante(modifier: Modifier = Modifier) {
    val Titulo01 = stringResource(R.string.TT01)
    val Texto01 = stringResource(R.string.TXT01)

    val Titulo02 = stringResource(R.string.TT02)
    val Texto02 = stringResource(R.string.TXT02)

    val Titulo03 = stringResource(R.string.TT03)
    val Texto03 = stringResource(R.string.TXT03)

    val Titulo04 = stringResource(R.string.TT04)
    val Texto04 = stringResource(R.string.TXT04)

    Column(Modifier.fillMaxSize()) {// para que la columna ocupe toda la pantalla disponible
        Row(Modifier.weight(1f)) {// la fila ocupara la mitad del alto de la pantalla
            InformacionCuadrante(
                titulo = Titulo01,
                descr = Texto01,
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)// la tarjeta ocupa la mitad del ancho de la fila
            )
            InformacionCuadrante(
                titulo = Titulo02,
                descr = Texto02,
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            InformacionCuadrante(
                titulo = Titulo03,
                descr = Texto03,
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            InformacionCuadrante(
                titulo = Titulo04,
                descr = Texto04,
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun InformacionCuadrante(
    titulo: String,
    descr: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()// para que ocupe por completo el espacio del cuadrante
            .background(backgroundColor)// para el fondo del color
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = descr,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true,
         showSystemUi = true,
        name = "Mi ventana de Cuadrante")
@Composable
fun CuadrantePreview() {
    ComponerCuadranteTheme {
        VistaCuadrante()
    }
}