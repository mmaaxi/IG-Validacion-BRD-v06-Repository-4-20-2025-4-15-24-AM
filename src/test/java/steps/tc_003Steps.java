import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page page;

    public tc_003Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_003Page.class);
    }

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        driver.get("https://www.example.com/login");
    }

    @When("the user clicks on the 'Forgot Password' link")
    public void userClicksForgotPassword() {
        page.clickForgotPasswordLink();
    }

    @Then("the system redirects to the password recovery page")
    public void redirectToPasswordRecovery() {
        page.verifyRecoveryPage();
    }

    @When("the user enters a registered email")
    public void userEntersRegisteredEmail() {
        page.enterEmail("registeredemail@example.com");
    }

    @Then("the system accepts the email and allows user to proceed")
    public void systemAcceptsEmail() {
        page.verifyEmailAccepted();
    }

    @When("the user clicks on the 'Send' button")
    public void userClicksSendButton() {
        page.clickSendButton();
    }

    @Then("a confirmation message indicating the recovery email has been sent is displayed")
    public void confirmRecoveryEmailSent() {
        page.verifyConfirmationMessage();
    }

    @And("the user checks the inbox of the entered email")
    public void userChecksInbox() {
        // Logic for checking email inbox (this might involve integration with an email service)
    }

    @Then("the password recovery email is received")
    public void recoveryEmailIsReceived() {
        // Verification logic for email reception
    }
}