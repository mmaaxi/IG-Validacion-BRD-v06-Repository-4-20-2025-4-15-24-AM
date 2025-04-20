package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    private WebDriver driver;
    private By loginButton = By.id("loginButton");
    private By logoutButton = By.id("logoutButton");
    private By protectedPageLink = By.id("protectedPageLink");
    private By homepageIndicator = By.id("homepage");
    private By loginPageIndicator = By.id("loginPage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithValidCredentials() {
        // Add steps to perform login
        driver.findElement(loginButton).click();
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }

    public boolean isOnHomepage() {
        return driver.findElement(homepageIndicator).isDisplayed();
    }

    public void accessProtectedPage() {
        driver.findElement(protectedPageLink).click();
    }

    public boolean isOnLoginPage() {
        return driver.findElement(loginPageIndicator).isDisplayed();
    }
}