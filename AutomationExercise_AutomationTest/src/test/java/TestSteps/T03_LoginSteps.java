package TestSteps;

import TestPages.P03_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static TestSteps.Hooks.driver;


public class T03_LoginSteps {

    P03_LoginPage loginPage = new P03_LoginPage();
    String getHomeUrl;
    String getLoginUrl;

    // Test Steps;
    @Given("user launches the browser and navigates to the home page")
    public void the_user_open_the_browser() {
        // Initialization is now handled in setUp()
        loginPage.newSoftAssert();
    }

    @When("the user clicks on Signup_Login button")
    public void the_user_clicks_on_signup_Login_button() {
        loginPage.SignupORLoginBtn().click();
    }

    @Then("'Login to your account' and login button should be displayed")
    public void Login_to_your_account_and_login_button_should_be_visible() {
        loginPage.assertLoginH2();
        loginPage.assertLoginBtn();
    }

    @When("the user enters email address as {string} and password as {string}")
    public void user_enters_valid_data(String email, String password) {
        loginPage.emailNpt().sendKeys(email);
        loginPage.passwordNpt().sendKeys(password);
    }

    @And("clicks 'login' button")
    public void clicks_on_login_button() {
        loginPage.loginBtn().click();
    }

    @Then("'Logged in as username' should be visible")
    public void Logged_in_as_username_should_be_visible() {
        loginPage.assertLoggedInSMS();
        getHomeUrl = driver.getCurrentUrl();
    }

    @And("delete account button and logout button should be visible")
    public void delete_and_logout_Button_should_be_visible() {
        loginPage.assertDeleteBtn();
        loginPage.assertLogoutBtn();
        loginPage.assertAll();
    }

    // Error Email OR Password Message;
    @Then("an error message 'Your email or password is incorrect!' should be displayed")
    public void error_email_or_password_message() {
        loginPage.assertEmailErrorSMS();
        loginPage.assertAll();
    }

    @When("user clicks on 'Delete Account' button")
    public void clicks_on_Delete_Account_button() {
        loginPage.deleteAccountBtn().click();
    }

    // Delete Account Message;
    @Then("'ACCOUNT DELETED!' should be visible")
    public void ACCOUNT_DELETED_should_be_visible() {
        loginPage.assertAccountDeleted();
        loginPage.assertAll();
    }

    @When("the user clicks 'logout' button")
    public void click_on_logout_button() {
        loginPage.logoutBtn().click();
        getLoginUrl = driver.getCurrentUrl();
    }

    @Then("user should be redirected to the login page")
    public void user_redirected_to_the_login_page() {
        System.out.println("Home url => " + getHomeUrl);
        System.out.println("login url => " + getLoginUrl);
        loginPage.assertUrl(getHomeUrl, getLoginUrl);
        loginPage.assertAll();
    }

}
