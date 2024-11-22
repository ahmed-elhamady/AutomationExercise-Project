package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static TestSteps.Hooks.driver;

public class P03_LoginPage {

    SoftAssert softAssert;

    // locators;
    By homeLoc = By.linkText("Home");
    By SignupORLoginLoc = By.linkText("Signup / Login");
    By loginH2Loc = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");
    By emailLoc = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    By passwordLoc = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    By emailErrorSMSLoc = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");
    By loginLoc = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    By loggedInSMSLoc = By.partialLinkText("Logged in as");
    By deleteAccountLoc = By.partialLinkText("Delete");
    By accountDeletedLoc = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    By logoutLoc = By.linkText("Logout");


    // Action / Hold Elements;
    public WebElement homeBtn() {
        return driver.findElement(homeLoc);
    }

    public WebElement SignupORLoginBtn() {
        return driver.findElement(SignupORLoginLoc);
    }

    public WebElement loginH2Ele() {
        return driver.findElement(loginH2Loc);
    }

    public WebElement emailNpt() {
        return driver.findElement(emailLoc);
    }

    public WebElement passwordNpt() {
        return driver.findElement(passwordLoc);
    }

    public WebElement emailErrorSMSEle() {
        return driver.findElement(emailErrorSMSLoc);
    }

    public WebElement loginBtn() {
        return driver.findElement(loginLoc);
    }

    public WebElement loggedInSMSEle() {
        return driver.findElement(loggedInSMSLoc);
    }

    public WebElement deleteAccountBtn() {
        return driver.findElement(deleteAccountLoc);
    }

    public WebElement accountDeletedMSM() {
        return driver.findElement(accountDeletedLoc);
    }

    public WebElement logoutBtn() {
        return driver.findElement(logoutLoc);
    }

    // Assertions;
    public void newSoftAssert() {
        softAssert = new SoftAssert();
    }

    public void assertHomeBtn() {
        softAssert.assertTrue(homeBtn().isDisplayed(), "Home button is NOT displayed");
    }

    public void assertLoginH2() {
        String AR = loginH2Ele().getText();
        String ER = "Login to your account";
        softAssert.assertEquals(AR, ER, "Login to your account is NOT appeared");
    }

    public void assertLoginBtn() {
        softAssert.assertTrue(loginBtn().isDisplayed(), "Error login button is NOT displayed");
    }

    public void assertDeleteBtn() {
        softAssert.assertTrue(deleteAccountBtn().isDisplayed(), "Error Delete button is NOT displayed");
    }

    public void assertAccountDeleted() {
        String AR = accountDeletedMSM().getText();
        String ER = "ACCOUNT DELETED!";
        softAssert.assertEquals(AR, ER);
    }

    public void assertLogoutBtn() {
        softAssert.assertTrue(logoutBtn().isDisplayed(), "Error logout button is NOT displayed");
    }

    public void assertLoggedInSMS() {
        String AR = loggedInSMSEle().getText();
        softAssert.assertTrue(AR.contains("Logged in as"), "AR have Error in the name of user");
    }

    public void assertEmailErrorSMS() {
        String AR = emailErrorSMSEle().getText();
        String ER = "Your email or password is incorrect!";
        softAssert.assertEquals(AR, ER, "Error email or password is incorrect NOT found");
    }

    public void assertUrl(String URL1, String URL2) {
        softAssert.assertFalse(URL1.equals(URL2), "Error the same URLs");
    }

    public void assertAll() {
        softAssert.assertAll();
    }
}
