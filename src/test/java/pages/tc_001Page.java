package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_001Page {

    private WebDriver driver;
    private String loginUrl = "http://example.com/login";

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");

    public tc_001Page() {
        // Configuración del controlador Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void navigateToLoginPage() {
        driver.get(loginUrl);
    }

    public boolean isOnLoginPage() {
        return driver.getTitle().equals("Login Page");
    }

    public void enterUsername(String username) {
        WebElement userField = driver.findElement(usernameField);
        userField.clear();
        userField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passField = driver.findElement(passwordField);
        passField.clear();
        passField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }

    public boolean isRedirectedToHomePage() {
        return driver.getTitle().equals("Home Page");
    }

    public void closeBrowser() {
        driver.quit();
    }
}