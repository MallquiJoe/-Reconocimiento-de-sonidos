package utn.appmoviles.Tp_Final

import androidx.collection.mutableScatterSetOf
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import utn.appmoviles.Tp_Final.model.Routes

import utn.appmoviles.Tp_Final.ui.theme.colorTitulo

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MostrarPantallaEntrenamientoSonido() {
    PantallaEntrenamientoSonido( null)
}

@Composable
fun PantallaEntrenamientoSonido(navHostController: NavHostController?){

    var grabando by remember { mutableStateOf(false) } // para saber si esta grabando intento 1

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text = "Entrenamiento de Sonido",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = colorTitulo
        )

        Spacer(modifier = Modifier.height(32.dp))

        //Boton grabar/ detener
        IconButton(
            onClick = { grabando = !grabando },
            modifier = Modifier
                .size(128.dp)
                .background(
                    color = if (grabando) Color.Red else Color.Green,
                    shape = CircleShape
                )
        ) {
            val icon =
                if (grabando) painterResource(id = R.drawable.stop) else painterResource(id = R.drawable.play)
            Image(
                painter = icon,
                contentDescription = if (grabando) "Detener Grabacion" else "Iniciar Grabacion",
                modifier = Modifier.size(30.dp)
            )
        }
    }
}
