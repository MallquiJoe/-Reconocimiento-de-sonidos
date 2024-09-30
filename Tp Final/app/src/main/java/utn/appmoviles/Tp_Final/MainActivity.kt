package utn.appmoviles.Tp_Final

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import utn.appmoviles.Tp_Final.ui.theme.MyApplicationTheme
import utn.appmoviles.Tp_Final.model.Routes
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.savedstate.SavedStateRegistryController
import org.w3c.dom.Text

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navigationController = rememberNavController()

            NavHost (
                       navController = navigationController,
                       startDestination = Routes.PantallaLogin.route
                    )
                {
                   composable(Routes.PantallaLogin.route){ PantallaLogin(navigationController)}
                   composable(Routes.PantallaPrincipal.route) {PantallaPrincipal(navigationController)}
                   composable(Routes.PantallaConfiguracion.route){PantallaConfiguracion(navigationController)}
                   composable(Routes.PantallaEntrenamientoSonido.route){PantallaEntrenamientoSonido(navigationController)}
                   //composable(Routes.PantallaEnvioWhastsApp.route){PantallaEnvioWhastsApp(navigationController)}

                }

            }
        }
    }
@Preview (showBackground = true, showSystemUi = true)
@Composable
fun MostrarPantallaLogin(){
    PantallaLogin(null)
}

@Composable
fun PantallaLogin(navigationController: NavHostController?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        //Titulo Login
        Text(
            text = "Login",
            fontSize = 24.sp
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { navigationController?.navigate(Routes.PantallaPrincipal.route) },
                modifier = Modifier
                    .width(130.dp)
                    .height(45.dp)
            ) {
                Text(
                    text = "Iniciar",
                    fontSize = 18.sp
                )
            }

        }
    }
}
