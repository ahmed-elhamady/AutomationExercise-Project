package TestPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static TestSteps.Hooks.driver;

public class P01_HomePage {

    SoftAssert softAssert;
    Actions actions;

    // locators;
    By HomeBtnLoc = By.linkText("Home");
    By ImageLoc = By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[2]/img");
    By H1TextLoc = By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h1");
    By H2TextLoc = By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h2");
    By ParaTextLoc = By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/p");
    By TestCasesBtnLoc = By.partialLinkText("Test Cases");
    By APIsBtnLoc = By.linkText("APIs list for practice");
    By ItemsLoc = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/h2");
    By CategoryLoc = By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/h2");
    By BrandsLoc = By.cssSelector(".brands_products");
    By FooterLoc = By.id("footer");
    By ArrowBtnLoc = By.id("scrollUp");
    By TopLoc = By.id("header");

    // Actions;
    public WebElement HomeBtn() {
        return driver.findElement(HomeBtnLoc);
    }

    public WebElement ImageEle() {
        return driver.findElement(ImageLoc);
    }

    public WebElement H1Text() {
        return driver.findElement(H1TextLoc);
    }

    public WebElement H2Text() {
        return driver.findElement(H2TextLoc);
    }

    public WebElement ParaText() {
        return driver.findElement(ParaTextLoc);
    }

    public WebElement TestCasesBtn() {
        return driver.findElement(TestCasesBtnLoc);
    }

    public WebElement APIsBtn() {
        return driver.findElement(APIsBtnLoc);
    }

    public WebElement ItemsEle() {
        return driver.findElement(ItemsLoc);
    }

    public WebElement CategoryEle() {
        return driver.findElement(CategoryLoc);
    }

    public WebElement BrandsEle() {
        return driver.findElement(BrandsLoc);
    }

    public WebElement FooterEle() {
        return driver.findElement(FooterLoc);
    }

    public WebElement ArrowBtn() {
        return driver.findElement(ArrowBtnLoc);
    }

    public WebElement TopEle() {
        return driver.findElement(TopLoc);
    }

    // Move to Elements;
    public void moveToFooter() {
        actions = new Actions(driver);
        actions.moveToElement(FooterEle()).perform();
    }

    public void moveToTop() {
        actions = new Actions(driver);
        actions.moveToElement(TopEle()).perform();
    }


    // Assertions;
    public void newSoftAssert() {
        softAssert = new SoftAssert();
    }

    public void assertHomeBtn() {
        softAssert.assertTrue(HomeBtn().isEnabled(), "Error: Home button is NOT enabled");
    }

    public void assertImage() {
        softAssert.assertTrue(ImageEle().isDisplayed(), "Error: Image is NOT displayed");
    }

    public void assertH1Text() {
        String AR = H1Text().getText();
        String ER = "Automation";
        softAssert.assertTrue(AR.contains(ER), "Error: H1 is NOT contain 'Automation'");
    }

    public void assertH2Text() {
        String AR = H2Text().getText();
        String ER = "Full-Fledged practice website for Automation Engineers";
        softAssert.assertEquals(AR, ER);
    }

    public void assertParaText() {
        String AR = ParaText().getText();
        String ER = "All QA engineers can use this website for automation practice and API testing either they are at beginner or advance level.";
        softAssert.assertTrue(AR.contains(ER));
    }

    public void assertTestCasesBtn() {
        softAssert.assertTrue(TestCasesBtn().isDisplayed(), "Error: TestCases button is NOT displayed");
    }

    public void assertAPIsBtn() {
        softAssert.assertTrue(APIsBtn().isDisplayed(), "Error: APIs button is NOT displayed");
    }

    public void assertItems() {
        String AR = ItemsEle().getText();
        String ER = "FEATURES ITEMS";
        softAssert.assertEquals(AR, ER, "Error: Features Items have an error");
    }

    public void assertCategory() {
        String AR = CategoryEle().getText();
        String ER = "CATEGORY";
        softAssert.assertEquals(AR, ER, "Error: Category have an error");
    }

    public void assertBrands() {
        softAssert.assertTrue(BrandsEle().isDisplayed(), "Error: Brands is NOT displayed");
    }

    public void assertArrowBtn() {
        softAssert.assertTrue(ArrowBtn().isDisplayed(), "Error: Arrow button is NOT displayed");
    }

    public void assertAll() {
        softAssert.assertAll("Assertions have an Error");
    }
}
