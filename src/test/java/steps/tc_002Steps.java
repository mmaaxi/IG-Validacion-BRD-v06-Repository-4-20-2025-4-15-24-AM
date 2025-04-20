package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page loginPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver = new ChromeDriver();
        driver.get("http://example.com/login");
        loginPage = new tc_002Page(driver);
    }
    
    @When("ingresa un nombre de usuario incorrecto")
    public void ingresa_un_nombre_de_usuario_incorrecto() {
        loginPage.enterUsername("usuarioIncorrecto");
    }

    @And("ingresa una contraseña incorrecta")
    public void ingresa_una_contraseña_incorrecta() {
        loginPage.enterPassword("contraseñaIncorrecta");
    }
    
    @And("hace clic en el botón 'Iniciar sesión'")
    public void hace_clic_en_el_boton_iniciar_sesion() {
        loginPage.clickLoginButton();
    }

    @Then("se muestra un mensaje de error indicando 'Credenciales incorrectas'")
    public void se_muestra_un_mensaje_de_error_indicando_credenciales_incorrectas() {
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals("Credenciales incorrectas", errorMessage);
    }
}