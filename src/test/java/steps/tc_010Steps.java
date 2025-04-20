import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import pages.tc_010Page;

import java.util.Arrays;
import java.util.List;

public class tc_010Steps {
    private WebDriver driver;
    private tc_010Page page;

    @Given("que accedo al sistema desde los navegadores {string}")
    public void que_accedo_al_sistema_desde_los_navegadores(String browsers) {
        List<String> browserList = Arrays.asList(browsers.split(", "));
        for (String browser : browserList) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
            }
            driver.get("https://example.com");
            page = new tc_010Page(driver);
            page.validateUIAndFunctionality();
            driver.quit();
        }
    }

    @Then("el sistema debe mostrar un comportamiento consistente en interfaz y funcionalidad")
    public void el_sistema_debe_mostrar_un_comportamiento_consistente_en_interfaz_y_funcionalidad() {
        // Implementación dentro del Page Object
    }

    @Given("que configuro resoluciones de pantalla {string} en cada navegador")
    public void que_configuro_resoluciones_de_pantalla_en_cada_navegador(String resolutions) {
        List<String> resolutionList = Arrays.asList(resolutions.split(", "));
        List<WebDriver> drivers = Arrays.asList(new ChromeDriver(), new FirefoxDriver(), new EdgeDriver(), new SafariDriver());

        for (WebDriver browserDriver : drivers) {
            driver = browserDriver;
            driver.get("https://example.com");
            page = new tc_010Page(driver);

            for (String resolution : resolutionList) {
                String[] dimensions = resolution.split("x");
                int width = Integer.parseInt(dimensions[0]);
                int height = Integer.parseInt(dimensions[1]);
                driver.manage().window().setSize(new org.openqa.selenium.Dimension(width, height));
                page.validateResponsiveDesign();
            }
            driver.quit();
        }
    }

    @Then("el sistema debe adaptarse correctamente a diferentes resoluciones sin errores de diseño")
    public void el_sistema_debe_adaptarse_correctamente_a_diferentes_resoluciones_sin_errores_de_diseño() {
        // Implementación dentro del Page Object
    }
}