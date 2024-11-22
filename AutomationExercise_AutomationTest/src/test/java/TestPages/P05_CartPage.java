package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static TestSteps.Hooks.driver;

public class P05_CartPage {

    SoftAssert softAssert;
    Actions action;

    // locators;
    By SignupORLoginLoc = By.linkText("Signup / Login");
    By emailLoc = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    By passwordLoc = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    By loginLoc = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    By productsLco = By.partialLinkText(" Products");
    By allProductsImgLoc = By.className("col-sm-4");
    By addToCartLoc = By.linkText("Add to cart");
    By addToCartProductLoc = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    By successSMSLoc = By.xpath("//*[@id=\"cartModal\"]/div/div/div[1]/h4");
    By viewCartLoc = By.linkText("View Cart");
    By continueSoppingLoc = By.cssSelector("#cartModal > div > div > div.modal-footer > button");
    By homeLoc = By.linkText("Home");
    By CheckoutLoc = By.partialLinkText("Checkout");
    By itemLoc = By.className("image");
    By descriptionLoc = By.className("description");
    By priceLoc = By.className("price");
    By quantityLoc = By.className("quantity");
    By totalLoc = By.className("total");
    By bodyLoc = By.xpath("//*[@id=\"cart_info_table\"]/tbody/tr");
    By removeLoc = By.className("cart_quantity_delete");
    By viewProductLoc = By.linkText("View Product");
    By quantityNptLoc = By.id("quantity");
    By quantityValueLoc = By.xpath("//*[@id=\"product-2\"]/td[4]/button");
    By availabilityLoc = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b");
    By conditionLoc = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b");
    By brandLoc = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b");


    // list;
    public List<WebElement> allProductsImgEle() {
        return driver.findElements(allProductsImgLoc);
    }

    public List<WebElement> itemsInCart() {
        return driver.findElements(bodyLoc);
    }

    public List<WebElement> cartBtnList() {
        return driver.findElements(addToCartLoc);
    }

    public List<WebElement> removeBtnList() {
        return driver.findElements(removeLoc);
    }

    public List<WebElement> viewProductBtnList() {
        return driver.findElements(viewProductLoc);
    }

    // Login Elements;
    public WebElement SignupORLoginBtn() {
        return driver.findElement(SignupORLoginLoc);
    }

    public WebElement emailNpt() {
        return driver.findElement(emailLoc);
    }

    public WebElement passwordNpt() {
        return driver.findElement(passwordLoc);
    }

    public WebElement loginBtn() {
        return driver.findElement(loginLoc);
    }

    public void loginFun(String email, String password) {
        SignupORLoginBtn().click();
        emailNpt().sendKeys(email);
        passwordNpt().sendKeys(password);
        loginBtn().click();
    }

    // Hold Elements / Actions;
    public WebElement productsBtn() {
        return driver.findElement(productsLco);
    }

    public WebElement successSMSEle() {
        return driver.findElement(successSMSLoc);
    }

    public WebElement viewCartBtn() {
        return driver.findElement(viewCartLoc);
    }

    public WebElement continueSoppingBtn() {
        return driver.findElement(continueSoppingLoc);
    }

    public WebElement homeBtn() {
        return driver.findElement(homeLoc);
    }

    public WebElement checkoutBtn() {
        return driver.findElement(CheckoutLoc);
    }

    public WebElement itemEle() {
        return driver.findElement(itemLoc);
    }

    public WebElement descriptionEle() {
        return driver.findElement(descriptionLoc);
    }

    public WebElement priceEle() {
        return driver.findElement(priceLoc);
    }

    public WebElement quantityEle() {
        return driver.findElement(quantityLoc);
    }

    public WebElement totalEle() {
        return driver.findElement(totalLoc);
    }

    public WebElement quantityNpt() {
        return driver.findElement(quantityNptLoc);
    }

    public WebElement quantityValueEle() {
        return driver.findElement(quantityValueLoc);
    }

    public WebElement availabilityEle() {
        return driver.findElement(availabilityLoc);
    }

    public WebElement conditionEle() {
        return driver.findElement(conditionLoc);
    }

    public WebElement brandEle() {
        return driver.findElement(brandLoc);
    }

    public WebElement addToCartProductBtn() {
        return driver.findElement(addToCartProductLoc);
    }

    // Actions Of Lists;
    public void hover(int id) {
        action = new Actions(driver);
        action.moveToElement(allProductsImgEle().get(id)).perform();
    }

    public void addToCartBtn(int id) {
        cartBtnList().get(id).click();
    }

    public void removeItem(int index) {
        removeBtnList().get(index).click();
    }

    public void viewProductsBtn(int index) {
        viewProductBtnList().get(index).click();
    }


    // Assertions;
    public void newSoftAssert() {
        softAssert = new SoftAssert();
    }

    public void assertSuccessSMS() {
        String AR = successSMSEle().getText();
        String ER = "";
        softAssert.assertEquals(AR, ER, "Item is NOT Added!");
    }

    public void assertViewCartBtn() {
        softAssert.assertTrue(viewCartBtn().isDisplayed(), "Error: viewCart button is NOT displayed");
    }

    public void assertContinueSoppingBtn() {
        softAssert.assertTrue(continueSoppingBtn().isDisplayed(), "Error: continue sopping button is NOT displayed");
    }

    public void assertHomeBtn() {
        softAssert.assertTrue(homeBtn().isDisplayed(), "Error: Home button is NOT displayed");
    }

    public void assertCheckoutBtn() {
        softAssert.assertTrue(checkoutBtn().isDisplayed(), "Error: Checkout button is NOT displayed");
    }

    public void assertTotalItemsInCart(int Items) {
        int numberOfItems = itemsInCart().size();
        softAssert.assertEquals(numberOfItems, Items, "Number of Items NOT equal Items in the Cart");
    }

    public void assertItem() {
        softAssert.assertTrue(itemEle().isDisplayed(), "Error: Item is NOT exist");
    }

    public void assertDescription() {
        softAssert.assertTrue(descriptionEle().isDisplayed(), "Error: Description is NOT exist");
    }

    public void assertPrice() {
        softAssert.assertTrue(priceEle().isDisplayed(), "Error: Price is NOT exist");
    }

    public void assertQuantity() {
        softAssert.assertTrue(quantityEle().isDisplayed(), "Error: Quantity is NOT exist");
    }

    public void assertTotal() {
        softAssert.assertTrue(totalEle().isDisplayed(), "Error: Total is NOT exist");
    }

    public void assertQuantityNpt() {
        softAssert.assertTrue(quantityNpt().isDisplayed(), "Error: Quantity field is NOT displayed");
    }

    public void assertAvailability() {
        softAssert.assertTrue(availabilityEle().isDisplayed(), "Error: Availability Element is NOT displayed");
    }

    public void assertCondition() {
        softAssert.assertTrue(conditionEle().isDisplayed(), "Error: Condition Element is NOT displayed");
    }

    public void assertBrand() {
        softAssert.assertTrue(brandEle().isDisplayed(), "Error: Brand Element is NOT displayed");
    }

    public void assertQuantityValue(String ER_value) {
        String AR = quantityValueEle().getText();
        softAssert.assertEquals(AR, ER_value, "Error: Actual value NOT equal Expected value");
    }

    public void assertAddToCartProductBtn() {
        softAssert.assertTrue(addToCartProductBtn().isDisplayed(), "Error: Add to cart is NOT displayed");
    }

    public void assertAll() {
        softAssert.assertAll();
    }

}
