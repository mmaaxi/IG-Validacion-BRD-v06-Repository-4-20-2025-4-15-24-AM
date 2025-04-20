package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginBtn");
    private By errorMessage = By.id("errorMsg");
    private By lockedMessage = By.id("lockedMsg");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void enterInvalidCredentials() {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys("invalidUser");
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys("invalidPass");
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isMultipleAttemptsDetected() {
        // This should be implemented with an actual check mechanism
        return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean isAccountTemporarilyLocked() {
        // Simulated response from the system for the purpose of this example
        return true; // This should be replaced with an actual condition check.
    }

    public void attemptLoginAfterLock() {
        driver.findElement(loginButton).click();
    }

    public boolean isAccountLockedMessageDisplayed() {
        return driver.findElement(lockedMessage).isDisplayed();
    }
}