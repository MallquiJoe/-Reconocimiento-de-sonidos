package utn.appmoviles.Tp_Final.model

sealed class Routes(val route: String) {
    object PantallaLogin:Routes("pantallaLogin")
    object PantallaPrincipal:Routes("pantallaPrincipal")
    object PantallaConfiguracion:Routes("pantallaConfiguracion")
    object PantallaEntrenamientoSonido:Routes("pantallaEntrenamientoSonido")
    object PantallaEnvioWhastsApp:Routes("pantallaEnvioWhatsApp")
}