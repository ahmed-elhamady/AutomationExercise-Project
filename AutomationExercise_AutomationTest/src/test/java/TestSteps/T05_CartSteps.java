package TestSteps;

import TestPages.P05_CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class T05_CartSteps {

    P05_CartPage cartPage = new P05_CartPage();

    @Given("user navigates to the home page")
    public void user_make_a_login() {
        // Initialization is now handled in setUp();
        cartPage.newSoftAssert();
    }

    @When("user clicks on 'products' button")
    public void user_clicks_on_products_button() {
        cartPage.productsBtn().click();
    }

    @And("hover over first product and clicks 'add to cart'")
    public void hover_over_first_product_and_click_add_to_cart() {
        cartPage.hover(2);
        cartPage.addToCartBtn(2);
    }

    @Then("success message 'Added!' , view cart link and 'Continue Shopping' button should be displayed")
    public void message_and_viewCart_link_and_continue_button_should_be_displayed() {
        cartPage.assertSuccessSMS();
        cartPage.assertViewCartBtn();
        cartPage.assertContinueSoppingBtn();
    }

    @When("the user click on 'Continue Shopping' button")
    public void user_clicks_continue_button() {
        cartPage.continueSoppingBtn().click();
    }

    @And("hover over second product and clicks 'add to cart'")
    public void user_clicks_add_to_cart() {
        cartPage.hover(7);
        cartPage.addToCartBtn(7);

    }

    @When("user clicks 'view cart' link")
    public void user_clicks_viewCart_button() {
        cartPage.viewCartBtn().click();
    }

    @Then("both products should be added to cart, home and Checkout button should be displayed")
    public void both_products_should_be_added_to_cart_and_home_and_Checkout_button_should_be_displayed() {
        cartPage.assertTotalItemsInCart(2);
        cartPage.assertHomeBtn();
        cartPage.assertCheckoutBtn();
    }

    @And("product details like Item, Description, Price, Quantity and Total should be displayed correctly")
    public void product_details_should_be_displayed_correctly() {
        cartPage.assertItem();
        cartPage.assertDescription();
        cartPage.assertPrice();
        cartPage.assertQuantity();
        cartPage.assertTotal();
        cartPage.assertAll();
    }

    // Remove Items;
    @When("user clicks 'x' icon to remove the product")
    public void click_on_remove_icon() throws InterruptedException {
        cartPage.removeItem(0);
        Thread.sleep(1000);
    }

    @Then("product should be removed from the cart page")
    public void product_should_be_removed() {
        cartPage.assertTotalItemsInCart(1);
        cartPage.assertAll();
    }

    // Quantity;
    @And("hover over first product and clicks 'view product'")
    public void click_on_view_product() {
        cartPage.hover(2);
        cartPage.viewProductsBtn(1);
    }

    @Then("Quantity field and 'Add to cart' button should displayed")
    public void Quantity_field_and_Add_to_cart_button_should_displayed() {
        cartPage.assertQuantityNpt();
        cartPage.assertAddToCartProductBtn();
    }

    @And("Availability, Condition and Brand should be displayed")
    public void Availability_Condition_and_Brand_should_be_displayed() {
        cartPage.assertAvailability();
        cartPage.assertCondition();
        cartPage.assertBrand();
    }

    @When("user increase the quantity to {string}")
    public void increase_the_quantity(String value) {
        cartPage.quantityNpt().clear();
        cartPage.quantityNpt().sendKeys(value);
    }

    @And("user clicks on 'Add to cart' button")
    public void click_on_add_to_button_cart() {
        cartPage.addToCartProductBtn().click();
    }

    @Then("product should be displayed in cart page with exact quantity as {string}")
    public void exact_quantity_should_be_displayed(String ER_value) {
        cartPage.assertQuantityValue(ER_value);
        cartPage.assertAll();
    }


}