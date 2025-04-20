package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {

    WebDriver driver;

    By campoNumerico = By.id("id_campo_numerico");
    By campoRestringido = By.id("id_campo_restringido");
    By mensajeError = By.id("id_mensaje_error");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarTextoEnCampoNumerico(String texto) {
        driver.findElement(campoNumerico).sendKeys(texto);
    }

    public String obtenerMensajeDeError() {
        return driver.findElement(mensajeError).getText();
    }

    public void ingresarTextoEnCampoRestringido(String texto) {
        driver.findElement(campoRestringido).sendKeys(texto);
    }

    public boolean entradaPrevenida() {
        // Logic to determine if the special character input was prevented
        return driver.findElement(campoRestringido).getAttribute("value").isEmpty();
    }
}