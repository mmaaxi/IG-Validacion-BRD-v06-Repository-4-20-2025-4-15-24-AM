package steps;

import pages.tc_001Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {

    tc_001Page loginPage;
    
    @Before
    public void setUp() {
        // Inicializar el navegador y la página de inicio de sesión
        loginPage = new tc_001Page();
        loginPage.navigateToLoginPage();
    }

    @Given("que el usuario está en la página de inicio de sesión")
    public void userIsOnLoginPage() {
        assertTrue(loginPage.isOnLoginPage());
    }

    @When("el usuario ingresa nombre de usuario válido en el campo de usuario")
    public void userEntersValidUsername() {
        loginPage.enterUsername("validUsername");
    }

    @When("el usuario ingresa contraseña válida en el campo de contraseña")
    public void userEntersValidPassword() {
        loginPage.enterPassword("validPassword");
    }

    @When("el usuario hace clic en el botón 'Iniciar sesión'")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("el sistema redirige al usuario a la página principal")
    public void systemRedirectsToHomePage() {
        assertTrue(loginPage.isRedirectedToHomePage());
    }

    @After
    public void tearDown() {
        // Cerrar el navegador
        loginPage.closeBrowser();
    }
}