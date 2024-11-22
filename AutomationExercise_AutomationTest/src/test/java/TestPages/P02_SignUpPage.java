package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static TestSteps.Hooks.driver;


public class P02_SignUpPage {

    SoftAssert softAssert;

    // locators;
    By homeLoc = By.linkText("Home");
    By SignupORLoginLoc = By.linkText("Signup / Login");
    By signUpH2Loc = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
    By nameLoc = By.name("name");
    By emailLoc = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    By signUPLoc = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    By emailErrorSMSLoc = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");
    By accountInfoLoc = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b");
    By MrLoc = By.id("id_gender1");
    By MrsLoc = By.id("id_gender2");
    By passwordLoc = By.name("password");
    By daysLoc = By.id("days");
    By monthsLoc = By.id("months");
    By yearsLoc = By.id("years");
    By checkListSignLoc = By.id("newsletter");
    By checkListReceiveLoc = By.id("optin");
    By addressInfoLoc = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/h2/b");
    By fNameLoc = By.id("first_name");
    By lNameLoc = By.id("last_name");
    By companyLoc = By.id("company");
    By address1Loc = By.id("address1");
    By address2Loc = By.id("address2");
    By countryLoc = By.id("country");
    By stateLoc = By.id("state");
    By cityLoc = By.id("city");
    By zipcodeLoc = By.id("zipcode");
    By mobile_numberLoc = By.id("mobile_number");
    By createAccountLoc = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
    By accountCreatedLoc = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    By successSMSLoc = By.xpath("//*[@id=\"form\"]/div/div/div/p[1]");
    By continueLoc = By.linkText("Continue");
    By loggedInSMSLoc = By.partialLinkText("Logged in as");
    By deleteAccountLoc = By.partialLinkText("Delete");
    By accountDeletedLoc = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    By deleteSMSLoc = By.xpath("//*[@id=\"form\"]/div/div/div/p[1]");
    By logoutLoc = By.linkText("Logout");


    // Actions / Hold Elements;
    public WebElement homeBtn() {
        return driver.findElement(homeLoc);
    }

    public WebElement SignupORLoginBtn() {
        return driver.findElement(SignupORLoginLoc);
    }

    public WebElement signUpH2Ele() {
        return driver.findElement(signUpH2Loc);
    }

    public WebElement nameNpt() {
        return driver.findElement(nameLoc);
    }

    public WebElement emailNpt() {
        return driver.findElement(emailLoc);
    }

    public WebElement signUpBtn() {
        return driver.findElement(signUPLoc);
    }

    public WebElement emailErrorSMSEle() {
        return driver.findElement(emailErrorSMSLoc);
    }

    public WebElement accountInfoEle() {
        return driver.findElement(accountInfoLoc);
    }

    public WebElement MrRadio() {
        return driver.findElement(MrLoc);
    }

    public WebElement MrsRadio() {
        return driver.findElement(MrsLoc);
    }

    public WebElement passwordNpt() {
        return driver.findElement(passwordLoc);
    }

    public WebElement daySelect() {
        return driver.findElement(daysLoc);
    }

    public WebElement monthSelect() {
        return driver.findElement(monthsLoc);
    }

    public WebElement yearSelect() {
        return driver.findElement(yearsLoc);
    }

    public WebElement checkListSignEle() {
        return driver.findElement(checkListSignLoc);
    }

    public WebElement checkListReceiveEle() {
        return driver.findElement(checkListReceiveLoc);
    }

    public WebElement addressInfoEle() {
        return driver.findElement(addressInfoLoc);
    }

    public WebElement fNameNpt() {
        return driver.findElement(fNameLoc);
    }

    public WebElement lNameNpt() {
        return driver.findElement(lNameLoc);
    }

    public WebElement companyNpt() {
        return driver.findElement(companyLoc);
    }

    public WebElement address1Npt() {
        return driver.findElement(address1Loc);
    }

    public WebElement address2Npt() {
        return driver.findElement(address2Loc);
    }

    public WebElement countrySelect() {
        return driver.findElement(countryLoc);
    }

    public WebElement stateNpt() {
        return driver.findElement(stateLoc);
    }

    public WebElement cityNpt() {
        return driver.findElement(cityLoc);
    }

    public WebElement zipcodeNpt() {
        return driver.findElement(zipcodeLoc);
    }

    public WebElement mobile_numberNpt() {
        return driver.findElement(mobile_numberLoc);
    }

    public WebElement createAccountBtn() {
        return driver.findElement(createAccountLoc);
    }

    public WebElement accountCreatedEle() {
        return driver.findElement(accountCreatedLoc);
    }

    public WebElement successSMSEle() {
        return driver.findElement(successSMSLoc);
    }

    public WebElement deleteSMSEle() {
        return driver.findElement(deleteSMSLoc);
    }

    public WebElement continueBtn() {
        return driver.findElement(continueLoc);
    }

    public WebElement loggedInSMSEle() {
        return driver.findElement(loggedInSMSLoc);
    }

    public WebElement deleteAccountBtn() {
        return driver.findElement(deleteAccountLoc);
    }

    public WebElement logoutBtn() {
        return driver.findElement(logoutLoc);
    }

    public WebElement accountDeletedMSM() {
        return driver.findElement(accountDeletedLoc);
    }

    // Select Actions
    public void selectDayValue(String day) {
        Select selectDay = new Select(daySelect());
        selectDay.selectByValue(day);
    }

    public void selectMonthValue(String month) {
        Select selectMonth = new Select(monthSelect());
        selectMonth.selectByValue(month);
    }

    public void selectYearValue(String year) {
        Select selectYear = new Select(yearSelect());
        selectYear.selectByValue(year);
    }

    public void selectCountryValue(String country) {
        Select selectCountry = new Select(countrySelect());
        selectCountry.selectByValue(country);
    }

    // Assertions;
    public void newSoftAssert() {
        softAssert = new SoftAssert();
    }

    public void assertHomeBtn() {
        softAssert.assertTrue(homeBtn().isDisplayed(), "Error Home button is NOT displayed");
    }

    public void assertSignUpH2() {
        String AR = signUpH2Ele().getText();
        String ER = "New User Signup!";
        softAssert.assertEquals(AR, ER, "user signUp NOT found");
    }

    public void assertSignUpBtn() {
        softAssert.assertTrue(signUpBtn().isDisplayed(), "Error SignUp Button is Not Display");
    }

    public void assertEnterAccountInfo() {
        String AR = accountInfoEle().getText();
        String ER = "ENTER ACCOUNT INFORMATION";
        softAssert.assertEquals(AR, ER, "Error enter information NOT found");
    }

    public void assertAccountCreated() {
        String AR = accountCreatedEle().getText();
        String ER = "ACCOUNT CREATED!";
        softAssert.assertEquals(AR, ER, "Error deviation between AR and ER");
    }

    public void assertSuccessMessage() {
        String AR = successSMSEle().getText();
        softAssert.assertTrue(AR.contains("Congratulations!"), "AR does NOT contain the specific txt");
    }

    // Delete Assertions;
    public void assertDeleteSMS() {
        String AR = deleteSMSEle().getText();
        String ER = "Your account has been permanently deleted!";
        softAssert.assertEquals(AR, ER, "Error permanently deleted!");
    }

    public void assertContinueBtn() {
        softAssert.assertTrue(continueBtn().isDisplayed(), "Error the Button is NOT displayed");
    }

    public void assertLoggedInSMS() {
        String AR = loggedInSMSEle().getText();
        softAssert.assertTrue(AR.contains("Logged in as"), "AR have Error in the name of user");
    }

    public void assertDeleteAccountBtn() {
        softAssert.assertTrue(deleteAccountBtn().isDisplayed(), "Error the Delete Account Button is NOT displayed");
    }

    public void assertLogoutBtn() {
        softAssert.assertTrue(logoutBtn().isDisplayed(), "Error the logout Button is NOT displayed");
    }

    public void assertAccountDeleted() {
        String AR = accountDeletedMSM().getText();
        String ER = "ACCOUNT DELETED!";
        softAssert.assertEquals(AR, ER);
    }

    public void assertEmailErrorSMS() {
        String AR = emailErrorSMSEle().getText();
        String ER = "Email Address already exist!";
        softAssert.assertEquals(AR, ER);
    }

    public void assertAll() {
        softAssert.assertAll();
    }

}
