package TestSteps;

import TestPages.P02_SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class T02_SignUpSteps {

    P02_SignUpPage signUpPage = new P02_SignUpPage();

    // Test Steps;

    @Given("the user launches the browser and navigates to the home page")
    public void the_user_launches_the_browser_and_navigates_to_the_home_page() {
        // Initialization is now handled in setUp()
        signUpPage.newSoftAssert();
    }

    @When("the user clicks on Signup OR Login button")
    public void the_user_clicks_on_signup_login_button() {
        signUpPage.SignupORLoginBtn().click();
    }

    @Then("'New User Signup!' and Signup button should be visible")
    public void new_user_signup_should_be_visible() {
        signUpPage.assertSignUpH2();
        signUpPage.assertSignUpBtn();
    }

    @When("the user enters name as {string} and email address as {string}")
    public void the_user_enters_name_and_email_address(String name, String email) {
        signUpPage.nameNpt().sendKeys(name);
        signUpPage.emailNpt().sendKeys(email);
    }

    @And("clicks 'Signup' button")
    public void clicks_signup_button() {
        signUpPage.signUpBtn().click();
    }

    @Then("'ENTER ACCOUNT INFORMATION' should be visible")
    public void enter_account_information_should_be_visible() {
        signUpPage.assertEnterAccountInfo();
    }

    @When("the user fills in the details: select Title, Name , Email, Password as {string}, Date of birth")
    public void the_user_fills_in_the_details(String password) {
        signUpPage.MrRadio().click();
        signUpPage.passwordNpt().sendKeys(password);
        signUpPage.selectDayValue("27");
        signUpPage.selectMonthValue("7");
        signUpPage.selectYearValue("2000");

    }

    @And("selects the checkbox 'Sign up for our newsletter!'")
    public void selects_the_checkbox_sign_up_for_our_newsletter() {
        signUpPage.checkListSignEle().click();
    }

    @And("selects the checkbox 'Receive special offers from our partners!'")
    public void selects_the_checkbox_receive_special_offers_from_our_partners() {
        signUpPage.checkListReceiveEle().click();
    }

    @And("fills in the details: First name as {string}, Last name as {string}, Company as {string}, Address as {string}, Address_2 as {string}, select Country, State as {string}, City as {string}, Zipcode as {string}, Mobile Number as {string}")
    public void fills_in_the_details(String fName, String lName, String company, String address, String address2, String state, String city, String zipcode, String mobile) {
        signUpPage.fNameNpt().sendKeys(fName);
        signUpPage.lNameNpt().sendKeys(lName);
        signUpPage.companyNpt().sendKeys(company);
        signUpPage.address1Npt().sendKeys(address);
        signUpPage.address2Npt().sendKeys(address2);
        signUpPage.selectCountryValue("Canada");
        signUpPage.stateNpt().sendKeys(state);
        signUpPage.cityNpt().sendKeys(city);
        signUpPage.zipcodeNpt().sendKeys(zipcode);
        signUpPage.mobile_numberNpt().sendKeys(mobile);
    }

    @And("clicks 'Create Account' button")
    public void clicks_create_account_button() {
        signUpPage.createAccountBtn().click();
    }

    @Then("'ACCOUNT CREATED!' and continue button should be visible")
    public void account_created_should_be_visible() {
        signUpPage.assertAccountCreated();
        signUpPage.assertSuccessMessage();
        signUpPage.assertContinueBtn();
    }

    @When("the user clicks 'Continue' button")
    public void the_user_clicks_continue_button() {
        signUpPage.continueBtn().click();
    }

    @Then("'Logged in as username' , delete account button and logout button should be visible")
    public void logged_in_as_username_should_be_visible() {
        signUpPage.assertLoggedInSMS();
        signUpPage.assertDeleteAccountBtn();
        signUpPage.assertLogoutBtn();
        signUpPage.assertAll();
    }

    // Deleting Account
    @When("the user clicks 'Delete Account' button")
    public void the_user_clicks_delete_account_button() {
        signUpPage.deleteAccountBtn().click();
    }

    @Then("'ACCOUNT DELETED!' and delete message and continue button should be visible")
    public void account_deleted_and_delete_message_should_be_visible() {
        signUpPage.assertAccountDeleted();
        signUpPage.assertDeleteSMS();
        signUpPage.assertContinueBtn();
        signUpPage.assertAll();
    }

    // Email Address already exist;
    @Then("an error message 'Email Address already exist!' should be appeared and signUp button should be displayed")
    public void error_message_and_signUp_button_should_display() {
        signUpPage.assertEmailErrorSMS();
        signUpPage.assertSignUpBtn();
        signUpPage.assertAll();
    }

}
