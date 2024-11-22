package TestSteps;

import TestPages.P06_ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static TestSteps.Hooks.driver;


public class T06_ContactUsSteps {

    P06_ContactUsPage contactUsPage = new P06_ContactUsPage();

    // Variables
    String getContactUsUrl;
    String getHomeUrl;

    // Test Steps;

    @Given("the user open the browser and navigates to the home page")
    public void open_the_browser_and_create_new_soft_assert() {
        // Initialization is now handled in setUp();
        contactUsPage.newSoftAssert();
    }

    @When("user clicks on 'contactUs' button")
    public void user_clicks_on_contactUs_button() {
        contactUsPage.contactUsBtn().click();
    }

    @Then("'GET IN TOUCH' and 'Contact Us' should be appeared")
    public void GET_IN_TOUCH_should_be_appeared() {
        contactUsPage.assertContactUsH2();
        contactUsPage.assertContactUsTouch();
    }

    @When("the user enters name as {string}, email as {string}, subject as {string} and message as {string}")
    public void the_user_enters_name_and_email_and_subject_and_message(String name, String email, String subject, String message) {
        contactUsPage.nameNpt().sendKeys(name);
        contactUsPage.emailNpt().sendKeys(email);
        contactUsPage.subjectNpt().sendKeys(subject);
        contactUsPage.yourMessageNpt().sendKeys(message);
    }

    @And("the user uploads a file")
    public void user_upload_file() {
        // choose file is optional;
    }

    @And("the user clicks the 'Submit' button")
    public void user_click_on_submit_button() {
        contactUsPage.submitNpt().click();
    }

    @And("the user clicks the OK button")
    public void user_click_on_ok_button() {
        contactUsPage.clickOK();
        getContactUsUrl = driver.getCurrentUrl();
    }

    @Then("success message 'Success! Your details have been submitted successfully.' and home button should be appeared")
    public void success_message_and_home_button_should_be_appeared() {
        contactUsPage.assertSuccessSMS();
        contactUsPage.assertHomeBtn();
    }

    @When("the user clicks on 'Home' button")
    public void user_click_on_home_button() {
        contactUsPage.homeBtn().click();
        getHomeUrl = driver.getCurrentUrl();
    }

    @Then("user should be landed to home page successfully")
    public void user_should_be_landed_to_home_page_successfully() {
        System.out.println("contact Us url => " + getContactUsUrl);
        System.out.println("Home url => " + getHomeUrl);
        contactUsPage.assertURLPages(getContactUsUrl, getHomeUrl);
        contactUsPage.assertAll();
    }
}
