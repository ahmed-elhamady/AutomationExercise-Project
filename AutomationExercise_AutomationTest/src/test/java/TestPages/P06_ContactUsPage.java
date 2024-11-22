package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static TestSteps.Hooks.driver;

public class P06_ContactUsPage {

    SoftAssert softAssert;

    // locators;
    By contactUsLoc = By.linkText("Contact us");
    By contactUsH2Loc = By.xpath("//*[@id=\"contact-page\"]/div[1]/div/div/h2");
    By contactUsTouchLoc = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
    By nameLoc = By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
    By emailLoc = By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
    By subjectLoc = By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
    By yourMessageLoc = By.id("message");
    By chooseFileLoc = By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input");
    By submitLoc = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
    By successSMSLoc = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
    By homeLoc = By.linkText("Home");


    // Hold Elements / Actions;
    public WebElement contactUsBtn() {
        return driver.findElement(contactUsLoc);
    }

    public WebElement contactUsH2Ele() {
        return driver.findElement(contactUsH2Loc);
    }

    public WebElement contactUsTouchEle() {
        return driver.findElement(contactUsTouchLoc);
    }

    public WebElement nameNpt() {
        return driver.findElement(nameLoc);
    }

    public WebElement emailNpt() {
        return driver.findElement(emailLoc);
    }

    public WebElement subjectNpt() {
        return driver.findElement(subjectLoc);
    }

    public WebElement yourMessageNpt() {
        return driver.findElement(yourMessageLoc);
    }

    public WebElement chooseFileBtn() {
        return driver.findElement(chooseFileLoc);
    }

    public WebElement submitNpt() {
        return driver.findElement(submitLoc);
    }

    public WebElement successSMSEle() {
        return driver.findElement(successSMSLoc);
    }

    public WebElement homeBtn() {
        return driver.findElement(homeLoc);
    }

    // Alert Actions;
    public void clickOK() {
        driver.switchTo().alert().accept();
    }

    public void clickCancel() {
        driver.switchTo().alert().dismiss();
    }

    // Assertions;
    public void newSoftAssert() {
        softAssert = new SoftAssert();
    }

    public void assertContactUsH2() {
        String AR = contactUsH2Ele().getText();
        String ER = "CONTACT US";
        softAssert.assertEquals(AR, ER, "Contact Us is NOT appeared");
    }

    public void assertContactUsTouch() {
        String AR = contactUsTouchEle().getText();
        String ER = "GET IN TOUCH";
        softAssert.assertEquals(AR, ER, "GET IN TOUCH is NOT appeared");
    }

    public void assertSuccessSMS() {
        String AR = successSMSEle().getText();
        softAssert.assertTrue(AR.contains("submitted successfully."), "AR does NOT contains 'submitted successfully'.");
    }

    public void assertHomeBtn() {
        softAssert.assertTrue(homeBtn().isDisplayed(), "Home button is NOT displayed");
    }

    // Assert URL;
    public void assertURLPages(String url1, String url2) {
        softAssert.assertFalse(url1.equals(url2), "Error url1 equal to url2");
    }

    public void assertAll() {
        softAssert.assertAll();
    }
}

