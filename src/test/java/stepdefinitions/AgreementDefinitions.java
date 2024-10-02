package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class AgreementDefinitions {
    @Dado("que el usuario navega a la página de inicio de sesión")
    public void queElUsuarioNavegaALaPaginaDeInicioDeSesion() {
    }

    @Cuando("ingresa las credenciales de acceso correctas")
    public void ingresaLasCredencialesDeAccesoCorrectas() {
    }

    @Entonces("debería ver la página principal")
    public void deberiaVerLaPaginaPrincipal() {
    }

    @Dado("que el usuario selecciona la opción de agregar un nuevo SLA genérico")
    public void queElUsuarioSeleccionaLaOpcionDeAgregarUnNuevoSLAGenerico() {
    }

    @Y("selecciona un tipo de requerimiento del catálogo")
    public void seleccionaUnTipoDeRequerimientoDelCatalogo() {
    }

    @Y("establece la fecha límite en {int} días hábiles")
    public void estableceLaFechaLimiteEnDiasHabiles(int arg0) {
    }

    @Y("selecciona el estado como ACTIVO")
    public void seleccionaElEstadoComoACTIVO() {
    }

    @Cuando("el usuario guarda el nuevo SLA genérico")
    public void elUsuarioGuardaElNuevoSLAGenerico() {
    }

    @Entonces("el sistema debe aplicar este SLA genérico a todos los prestadores")
    public void elSistemaDebeAplicarEsteSLAGenericoATodosLosPrestadores() {
    }

    @Y("el sistema debe resetear todas las otras parametrizaciones de SLA al nuevo SLA genérico")
    public void elSistemaDebeResetearTodasLasOtrasParametrizacionesDeSLAAlNuevoSLAGenerico() {
    }
}
