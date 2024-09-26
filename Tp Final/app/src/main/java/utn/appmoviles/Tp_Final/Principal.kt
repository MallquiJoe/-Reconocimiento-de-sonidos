package utn.appmoviles.Tp_Final

import android.content.Context
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventStart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import utn.appmoviles.Tp_Final.model.Routes
import utn.appmoviles.Tp_Final.ui.theme.colorBoton
import utn.appmoviles.Tp_Final.ui.theme.colorTitulo


data class Sonido(val nombre: String, val color: Color)

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MostrarPantallaPrincipal(){
    PantallaPrincipal(null)
}

@Composable
fun PantallaPrincipal(navigationController: NavHostController?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Titulo
        Text(
            text = "Lista de sonidos Detectados",
            fontSize = (28.sp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = colorTitulo

            )
        Spacer(modifier = Modifier.padding(24.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.Start
        ) {
            SonidoItem(Sonido("Sirena Policia", Color.Blue))
            SonidoItem(Sonido("Bocina Auto", Color.Black))
            SonidoItem(Sonido("Bocina Camion", Color.Green))
            SonidoItem(Sonido("Sirena Bomberos", Color.Red))

        }
        Spacer(modifier = Modifier.padding(25.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(38.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {/*accion inicio*/ },
                colors = ButtonDefaults.buttonColors(containerColor = colorBoton),
                modifier = Modifier
                    .width(130.dp)
                    .height(45.dp)

            ) {
                Text(
                    text = "Iniciar",
                    fontSize = (18.sp)
                )
            }
            Button(
                onClick = {/*accion detener*/ },
                colors = ButtonDefaults.buttonColors(containerColor = colorBoton),
                modifier = Modifier
                    .width(130.dp)
                    .height(45.dp)
                    ) {
                Text(
                    text = "Detener",
                    fontSize = (18.sp))
                }

        }

        Button(onClick = { navigationController?.navigate(Routes.PantallaConfiguracion.route)},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent // QUEDA BIEN EN BLANCO PERO BUENO YO CREO QUE DEPENDE DEL FONDO DE PANTALLA
            ),
            modifier = Modifier.padding(top = 16.dp))
            {

            Icon(
                painter = painterResource(id= R.drawable.img),
                    contentDescription = "Configuracion",
                    tint = Color.Black, // Para cambiar el color de icono
                    modifier = Modifier.size(35.dp)

            )
        }
    }
}

@Composable
fun SonidoItem(sonido: Sonido) {
    Column(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text(
            text = "Sonido:${sonido.nombre}",
            fontSize = (18.sp),
            color = sonido.color,
        )
        Text(
            text = "Color: ${convertirColorAString(sonido.color)}",
            fontSize = (16.sp),
            color = Color.Gray
        )
    }
}

fun convertirColorAString(color: Color): String{
    return when (color){
        Color.Blue -> "azul"
        Color.Red -> "Rojo"
        Color.Black -> "Negro" // cambiar esto por naraja
        else -> "Desconocido"
    }
}
