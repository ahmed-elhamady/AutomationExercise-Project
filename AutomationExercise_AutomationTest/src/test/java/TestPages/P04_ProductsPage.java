package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static TestSteps.Hooks.driver;

public class P04_ProductsPage {

    SoftAssert softAssert;

    // locators;
    By productsLco = By.partialLinkText(" Products");
    By searchNptLoc = By.id("search_product");
    By searchBtnLoc = By.xpath("//*[@id=\"submit_search\"]");
    By allProductsLoc = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2");
    By searchedProductLoc = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2");
    By topsProductLoc = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    By productsRelatedLoc = By.cssSelector(".features_items");
    By CategoryLoc = By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/h2");
    By CategoryItemsLoc = By.xpath("//*[@id=\"accordian\"]");
    By BrandsLoc = By.cssSelector(".brands_products");
    By womenLoc = By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a");
    By dressLoc = By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a");

    // Hold Elements / Actions;
    public WebElement productsBtn() {
        return driver.findElement(productsLco);
    }

    public WebElement searchNpt() {
        return driver.findElement(searchNptLoc);
    }

    public WebElement searchBtn() {
        return driver.findElement(searchBtnLoc);
    }

    public WebElement allProductsEle() {
        return driver.findElement(allProductsLoc);
    }

    public WebElement searchedProductEle() {
        return driver.findElement(searchedProductLoc);
    }

    public WebElement topsProductEle() {
        return driver.findElement(topsProductLoc);
    }

    public WebElement productsRelatedEle() {
        return driver.findElement(productsRelatedLoc);
    }

    public WebElement CategoryEle() {
        return driver.findElement(CategoryLoc);
    }

    public WebElement CategoryItemsEle() {
        return driver.findElement(CategoryItemsLoc);
    }

    public WebElement BrandsEle() {
        return driver.findElement(BrandsLoc);
    }

    public WebElement womenLink() {
        return driver.findElement(womenLoc);
    }

    public WebElement dressLink() {
        return driver.findElement(dressLoc);
    }

    // Assertions;
    public void newSoftAssert() {
        softAssert = new SoftAssert();
    }

    public void assertSearchNpt() {
        softAssert.assertTrue(searchNpt().isDisplayed(), "Error: Search input is NOT displayed");
    }

    public void assertSearchBtn() {
        softAssert.assertTrue(searchBtn().isDisplayed(), "Error: Search button is NOT displayed");
    }

    public void assertAllProducts() {
        String AR = allProductsEle().getText();
        String ER = "ALL PRODUCTS";
        softAssert.assertEquals(AR, ER, "Error: All Products text");
    }

    public void assertSearchedProduct() {
        String AR = searchedProductEle().getText();
        String ER = "SEARCHED PRODUCTS";
        softAssert.assertEquals(AR, ER, "Error: searched Products text");
    }

    public void assertTopsProduct() {
        String AR = topsProductEle().getText();
        String ER = "WOMEN -  DRESS PRODUCTS";
        softAssert.assertEquals(AR, ER, "Error: women - tops Products text");
    }

    public void assertProductsRelated() {
        softAssert.assertTrue(productsRelatedEle().isDisplayed());
    }

    public void assertCategory() {
        String AR = CategoryEle().getText();
        String ER = "CATEGORY";
        softAssert.assertEquals(AR, ER, "Error: Category have an error");
    }

    public void assertCategoryItems() {
        softAssert.assertTrue(CategoryItemsEle().isDisplayed(), "Error: Category items is NOT displayed");
    }

    public void assertBrands() {
        softAssert.assertTrue(BrandsEle().isDisplayed(), "Error: Brands is NOT displayed");
    }

    public void assertAll() {
        softAssert.assertAll();
    }

}
