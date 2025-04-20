import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {

    private WebDriver driver;
    private tc_004Page loginPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        loginPage = PageFactory.initElements(driver, tc_004Page.class);
        loginPage.navigateToLoginPage();
    }

    @When("el usuario ingresa credenciales incorrectas tres veces")
    public void elUsuarioIngresaCredencialesIncorrectasTresVeces() {
        for (int attempt = 0; attempt < 3; attempt++) {
            loginPage.enterInvalidCredentials();
            loginPage.clickLoginButton();
        }
    }

    @Then("el sistema detecta múltiples intentos fallidos")
    public void elSistemaDetectaMultiplesIntentosFallidos() {
        Assert.assertTrue(loginPage.isMultipleAttemptsDetected());
    }

    @Then("el sistema bloquea la cuenta temporalmente tras el tercer intento")
    public void elSistemaBloqueaLaCuentaTemporalmente() {
        Assert.assertTrue(loginPage.isAccountTemporarilyLocked());
    }
    
    @When("el usuario intenta iniciar sesión nuevamente tras el bloqueo")
    public void elUsuarioIntentaIniciarSesionNuevamenteTrasElBloqueo() {
        loginPage.attemptLoginAfterLock();
    }

    @Then("el sistema muestra un mensaje de 'Cuenta bloqueada temporalmente'")
    public void elSistemaMuestraMensajeCuentaBloqueadaTemporalmente() {
        Assert.assertTrue(loginPage.isAccountLockedMessageDisplayed());
    }
}