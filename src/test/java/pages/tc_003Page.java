import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_003Page {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(linkText = "Forgot Password")
    WebElement forgotPasswordLink;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "sendButton")
    WebElement sendButton;

    @FindBy(id = "confirmationMessage")
    WebElement confirmationMessage;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
    }

    public void verifyRecoveryPage() {
        wait.until(ExpectedConditions.urlContains("recovery"));
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void verifyEmailAccepted() {
        // Logic to verify input acceptance (this might be visual/HTML element based)
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void verifyConfirmationMessage() {
        wait.until(ExpectedConditions.visibilityOf(confirmationMessage));
    }
}