package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static TestSteps.Hooks.driver;

public class P07_TestCasesPage {

    SoftAssert softAssert;

    //locators;
    By testCaseBtnLoc = By.linkText("Test Cases");
    By H2testCaseLoc = By.xpath("//*[@id=\"form\"]/div/div[1]/div/h2");

    // Actions;
    public WebElement testCaseBtn() {
        return driver.findElement(testCaseBtnLoc);
    }

    public WebElement H2testCase() {
        return driver.findElement(H2testCaseLoc);
    }


    // Assertions
    public void newSoftAssert() {
        softAssert = new SoftAssert();
    }

    public void assertH2testCase() {
        softAssert.assertTrue(H2testCase().isDisplayed(), "Error: Test Case Search is NOT displayed");
    }

    public void assertURL(String Url1, String Url2) {
        softAssert.assertFalse(Url1.equals(Url2), "Error: Url1 equal to url2");
    }

    public void assertAll() {
        softAssert.assertAll();
    }

}
