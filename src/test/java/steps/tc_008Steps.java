package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_008Page;

import static org.junit.Assert.assertEquals;

public class tc_008Steps {

    WebDriver driver;
    tc_008Page page;

    @Given("el usuario está en la página de entrada")
    public void el_usuario_está_en_la_página_de_entrada() {
        driver = new ChromeDriver();
        driver.get("URL_DE_LA_PAGINA");
        page = new tc_008Page(driver);
    }

    @When("el usuario ingresa datos alfanuméricos en el campo numérico")
    public void el_usuario_ingresa_datos_alfanuméricos_en_el_campo_numérico() {
        page.ingresarTextoEnCampoNumerico("abc123");
    }

    @Then("el sistema muestra un mensaje de error de validación")
    public void el_sistema_muestra_un_mensaje_de_error_de_validación() {
        String mensaje = page.obtenerMensajeDeError();
        assertEquals("Por favor, ingrese sólo números.", mensaje);
    }

    @When("el usuario ingresa caracteres especiales en un campo restringido")
    public void el_usuario_ingresa_caracteres_especiales_en_un_campo_restringido() {
        page.ingresarTextoEnCampoRestringido("!@#$%");
    }

    @Then("el sistema previene la entrada y muestra un aviso")
    public void el_sistema_previene_la_entrada_y_muestra_un_aviso() {
        boolean entradaPrevenida = page.entradaPrevenida();
        assertEquals(true, entradaPrevenida);
    }
}