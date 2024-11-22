package TestSteps;

import TestPages.P07_TestCasesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static TestSteps.Hooks.driver;

public class T07_TestCasesSteps {

    P07_TestCasesPage testCasesPage = new P07_TestCasesPage();

    String homeUrl;
    String testCasesUrl;


    @Given("the user go to the Home page")
    public void user_go_to_the_Home_page() {
        // Open the Browser;
        testCasesPage.newSoftAssert();
        homeUrl = driver.getCurrentUrl();
    }

    @When("user click on 'TestCases' button")
    public void click_on_testCases_button() {
        testCasesPage.testCaseBtn().click();
        testCasesUrl = driver.getCurrentUrl();
    }

    @Then("user navigates to the Test Cases page")
    public void navigate_to_the_testCase_page() {
        System.out.println("Home Url => " + homeUrl);
        System.out.println("Test Cases Url => " + testCasesUrl);
        testCasesPage.assertURL(homeUrl, testCasesUrl);
        testCasesPage.assertH2testCase();
        testCasesPage.assertAll();
    }
}
