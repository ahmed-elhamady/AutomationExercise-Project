package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static TestSteps.Hooks.driver;

public class P08_SubscriptionPage {
    SoftAssert softAssert;

    // locators;
    By emailNptLoc = By.id("susbscribe_email");
    By arrowBtnLoc = By.id("subscribe");
    By successSMSLoc = By.xpath("//*[@id=\"success-subscribe\"]/div");
    By cartBtnLoc = By.linkText("Cart");


    // Actions;
    public WebElement emailNpt() {
        return driver.findElement(emailNptLoc);
    }

    public WebElement arrowBtn() {
        return driver.findElement(arrowBtnLoc);
    }

    public WebElement successSMS() {
        return driver.findElement(successSMSLoc);
    }

    public WebElement cartBtn() {
        return driver.findElement(cartBtnLoc);
    }

    // Assertions;
    public void newSoftAssert() {
        softAssert = new SoftAssert();
    }

    public void assertSuccessSMS() {
        String AR = successSMS().getText();
        String ER = "You have been successfully subscribed!";
        softAssert.assertEquals(AR, ER, "Error: Success Message is NOT appeared");
    }

    public void assertAll() {
        softAssert.assertAll();
    }
}
