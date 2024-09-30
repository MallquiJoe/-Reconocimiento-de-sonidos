package utn.appmoviles.Tp_Final

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
import androidx.compose.material3.Button
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
import androidx.navigation.NavHostController
import utn.appmoviles.Tp_Final.model.Routes
import utn.appmoviles.Tp_Final.ui.theme.colorTitulo

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MostrarPantallaConfiguracion(){
    PantallaConfiguracion(null)
}

@Composable
fun PantallaConfiguracion(navigationController: NavHostController?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text( text = "Configuracion de Sonido",
            fontSize = (29.sp),
            color = colorTitulo)

        Spacer(modifier = Modifier.height(16.dp))

        //seccion de sonidos
        Text(text = "Sonidos Personalizados",
            fontSize = (16.sp) )
        LazyColumn {
            items(listOf("Timbre Casa", "Telefono")) { sound ->
                Row (
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text( text = sound, fontSize = 16.sp)

                Row {
                    IconButton(onClick = {/* Editar */}) {
                        Image( painter = painterResource(id = R.drawable.editar),
                            contentDescription = "Editar",
                            modifier = Modifier.size(29.dp),
                            contentScale = ContentScale.Fit)
                    }

                    Spacer( modifier = Modifier.width(8.dp))

                   IconButton(onClick = {/* Eliminar*/}) {
                       Image(
                           painter = painterResource(id = R.drawable.eliminar),
                           contentDescription = "Eliminar")
                   }
                }
                }
                }
            }
        Spacer(modifier = Modifier.height(16.dp))

        IconButton(
            onClick ={navigationController?.navigate(Routes.PantallaEntrenamientoSonido.route)},
            modifier = Modifier.align(Alignment.CenterHorizontally))
         {
            Image(
                painter = painterResource(id = R.drawable.agregar),
                contentDescription = "agregar Sonido",
                modifier = Modifier.size(48.dp)
            )
         }
        }
    }

