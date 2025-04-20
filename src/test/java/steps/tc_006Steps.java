package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page page;

    @Given("^el usuario ingresa al sistema con credenciales válidas$")
    public void iniciarSesion() {
        driver = new ChromeDriver();
        page = new tc_006Page(driver);
        driver.get("http://example.com/login");
        page.login("usuarioValido", "contraseñaValida");
    }

    @When("^accede a la sección de configuración de cuenta$")
    public void accederSeccionConfiguracion() {
        page.irAConfiguracionDeCuenta();
    }

    @And("^ingresa la contraseña actual y la nueva contraseña$")
    public void ingresarContraseñas() {
        page.ingresarContraseñaActual("contraseñaValida");
        page.ingresarNuevaContraseña("nuevaContraseña");
    }

    @And("^hace clic en el botón 'Guardar cambios'$")
    public void guardarCambios() {
        page.guardarCambios();
    }

    @Then("^se muestra un mensaje de confirmación que la contraseña ha sido cambiada exitosamente$")
    public void verificarMensajeConfirmacion() {
        page.verificarMensajeConfirmacion();
        driver.quit();
    }
}