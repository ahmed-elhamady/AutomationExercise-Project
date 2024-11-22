package TestSteps;

import TestPages.P01_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class T01_HomeSteps {

    P01_HomePage homePage = new P01_HomePage();

    // Steps;

    @Given("user navigate to the Home page")
    public void Home_page() {
        // Open the Home page;
        homePage.newSoftAssert();
    }

    @Then("Home button should be enabled")
    public void Home_button() {
        homePage.assertHomeBtn();
    }

    @And("image, H1 'Automation Exercise' , H2 'Full-Fledged practice website for Automation Engineers' and paragraph 'All QA engineers can use this website' should be visible")
    public void practice_website_for_Automation_Engineers_text() {
        homePage.assertImage();
        homePage.assertH1Text();
        homePage.assertH2Text();
        homePage.assertParaText();
    }

    @And("TestCases and APIsList buttons should be displayed")
    public void TestCases_and_APIsList_buttons() {
        homePage.assertTestCasesBtn();
        homePage.assertAPIsBtn();
    }

    @And("Features items, Category and Brands should be displayed")
    public void Features_items_Category_and_Brands() {
        homePage.assertItems();
        homePage.assertCategory();
        homePage.assertBrands();
        homePage.assertAll();
    }

    // Scroll Up using Arrow button;
    @When("the user scroll down to the footer")
    public void scroll_down_to_the_footer() {
        homePage.moveToFooter();
    }

    @Then("'Arrow' button should be displayed")
    public void arrow_button_should_be_displayed() {
        homePage.assertArrowBtn();
    }

    @When("user click on 'Arrow' button")
    public void click_on_Arrow_button() {
        homePage.ArrowBtn().click();
    }

    @Then("user should be navigated to the top of the page and H1 'Automation Exercise' , H2 'Full-Fledged practice website for Automation Engineers' should be visible")
    public void user_should_be_navigated_to_the_top_of_the_page() {
        homePage.assertH1Text();
        homePage.assertH2Text();
        homePage.assertAll();
    }

    //Scroll Up Without using Arrow button;
    @When("user scroll up to the top")
    public void user_scroll_up_to_the_top() {
        homePage.moveToTop();
    }


}
