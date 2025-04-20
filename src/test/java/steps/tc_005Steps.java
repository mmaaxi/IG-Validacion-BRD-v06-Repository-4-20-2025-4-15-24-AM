package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page logoutPage;

    @Given("the user has logged in with valid credentials")
    public void the_user_has_logged_in_with_valid_credentials() {
        logoutPage = new tc_005Page(driver);
        logoutPage.loginWithValidCredentials();
    }

    @When("the user clicks on the 'Logout' option")
    public void the_user_clicks_on_the_logout_option() {
        logoutPage.clickLogout();
    }

    @Then("the user should be logged out and redirected to the homepage")
    public void the_user_should_be_logged_out_and_redirected_to_the_homepage() {
        Assert.assertTrue(logoutPage.isOnHomepage());
    }

    @When("the user tries to access a protected page without logging in")
    public void the_user_tries_to_access_a_protected_page_without_logging_in() {
        logoutPage.accessProtectedPage();
    }

    @Then("the system should redirect the user to the login page")
    public void the_system_should_redirect_the_user_to_the_login_page() {
        Assert.assertTrue(logoutPage.isOnLoginPage());
    }
}