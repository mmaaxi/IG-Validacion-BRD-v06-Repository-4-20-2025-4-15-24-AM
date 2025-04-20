package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;

public class tc_007Steps {
  
    WebDriver driver;
    tc_007Page menuPage;

    @Given("El usuario está en la página principal")
    public void elUsuarioEstaEnLaPaginaPrincipal() {
        menuPage = new tc_007Page(driver);
        driver.get("URL_DE_LA_PAGINA_INICIAL");
    }

    @When("El usuario hace clic en cada opción del menú principal")
    public void elUsuarioHaceClicEnCadaOpcionDelMenuPrincipal() {
        for (String menuOption : menuPage.getMenuOptions()) {
            menuPage.clickMenuOption(menuOption);
        }
    }

    @Then("El usuario es redirigido a la sección correspondiente")
    public void elUsuarioEsRedirigidoALaSeccionCorrespondiente() {
        for (String expectedUrl : menuPage.expectedUrls()) {
            Assert.assertTrue(menuPage.verifyCurrentUrl(expectedUrl));
        }
    }

    @And("La página muestra todo el contenido relevante")
    public void laPaginaMuestraTodoElContenidoRelevante() {
        Assert.assertTrue(menuPage.verifyPageContentLoaded());
    }
}