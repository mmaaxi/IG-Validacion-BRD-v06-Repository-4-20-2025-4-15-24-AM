package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();

    @Given("el entorno de prueba está configurado")
    public void el_entorno_de_prueba_esta_configurado() {
        page.configurarEntornoPrueba();
    }

    @When("se simulan {int} usuarios concurrentes")
    public void se_simulan_usuarios_concurrentes(int usuarios) {
        page.simularCargaUsuarios(usuarios);
    }

    @Then("el sistema responde en un tiempo aceptable sin caídas")
    public void el_sistema_responde_en_un_tiempo_aceptable_sin_caidas() {
        Assert.assertTrue(page.verificarTiempoRespuestaAdecuado());
    }

    @Given("el entorno de monitoreo está configurado")
    public void el_entorno_de_monitoreo_esta_configurado() {
        page.configurarEntornoMonitoreo();
    }

    @When("se monitorea la respuesta del sistema bajo carga")
    public void se_monitorea_la_respuesta_del_sistema_bajo_carga() {
        page.monitorearRendimiento();
    }

    @Then("el rendimiento se mantiene dentro de los parámetros establecidos, sin degradación significativa")
    public void el_rendimiento_se_mantiene_dentro_de_los_parametros_establecidos() {
        Assert.assertTrue(page.verificarRendimientoEstable());
    }
}