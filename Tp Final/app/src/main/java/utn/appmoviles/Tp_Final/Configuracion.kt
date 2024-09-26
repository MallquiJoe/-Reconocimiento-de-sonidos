package utn.appmoviles.Tp_Final

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            fontSize = (24.sp),
            color = colorTitulo)
    }
}
