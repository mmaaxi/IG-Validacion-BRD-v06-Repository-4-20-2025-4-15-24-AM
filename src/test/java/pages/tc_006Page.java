package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    By txtUsuario = By.id("usuario");
    By txtContraseña = By.id("contraseña");
    By btnIniciarSesion = By.id("btnIniciarSesion");
    By linkConfiguracionCuenta = By.id("linkConfiguracionCuenta");
    By txtContraseñaActual = By.id("contraseñaActual");
    By txtNuevaContraseña = By.id("nuevaContraseña");
    By btnGuardarCambios = By.id("btnGuardarCambios");
    By lblMensajeConfirmacion = By.id("mensajeConfirmacion");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String usuario, String contraseña) {
        driver.findElement(txtUsuario).sendKeys(usuario);
        driver.findElement(txtContraseña).sendKeys(contraseña);
        driver.findElement(btnIniciarSesion).click();
    }

    public void irAConfiguracionDeCuenta() {
        driver.findElement(linkConfiguracionCuenta).click();
    }

    public void ingresarContraseñaActual(String contraseñaActual) {
        driver.findElement(txtContraseñaActual).sendKeys(contraseñaActual);
    }

    public void ingresarNuevaContraseña(String nuevaContraseña) {
        driver.findElement(txtNuevaContraseña).sendKeys(nuevaContraseña);
    }

    public void guardarCambios() {
        driver.findElement(btnGuardarCambios).click();
    }

    public void verificarMensajeConfirmacion() {
        String mensaje = driver.findElement(lblMensajeConfirmacion).getText();
        if(!mensaje.equals("Contraseña cambiada exitosamente")) {
            throw new AssertionError("Mensaje de confirmación incorrecto");
        }
    }
}