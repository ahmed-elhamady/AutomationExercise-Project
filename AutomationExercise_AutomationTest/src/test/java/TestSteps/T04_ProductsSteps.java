package TestSteps;

import TestPages.P04_ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class T04_ProductsSteps {

    P04_ProductsPage productPage = new P04_ProductsPage();

    @Given("the user go to the browser and navigates to the home page")
    public void the_user_go_to_the_browser_and_navigates_to_the_home_page() {
        // Open the Home page;
        productPage.newSoftAssert();
    }

    @When("user clicks 'products' button")
    public void user_clicks_products_button() {
        productPage.productsBtn().click();
    }

    @Then("'All Products' should be visible")
    public void all_products_should_be_visible() {
        productPage.assertAllProducts();
    }

    @And("'Search' field and button should be displayed")
    public void search_field_and_button_should_be_displayed() {
        productPage.assertSearchNpt();
        productPage.assertSearchBtn();
    }

    @When("the user enters the product name as {string} in the search input")
    public void enter_the_product_name_in_the_search_input(String product) {
        productPage.searchNpt().sendKeys(product);
    }

    @And("clicks 'Search' button")
    public void clicks_search_button() {
        productPage.searchBtn().click();
    }

    @Then("'SEARCHED PRODUCTS' should be displayed")
    public void searched_products_should_be_displayed() {
        productPage.assertSearchedProduct();
        productPage.assertProductsRelated();
    }

    @And("all the products related to the search should be displayed")
    public void all_the_products_related_to_the_search_should_be_displayed() {
        productPage.assertCategoryItems();
        productPage.assertBrands();
        productPage.assertAll();
    }

    // Category;
    @And("'Search' field and button and 'category' link should be displayed")
    public void category_link_should_be_displayed() {
        productPage.assertSearchNpt();
        productPage.assertSearchBtn();
        productPage.assertCategory();
    }

    @When("the user click on'Women' category")
    public void click_on_Women_category() {
        productPage.womenLink().click();
    }

    @And("click on any category link under 'Women' category, for example: Dress")
    public void click_on_dress() {
        productPage.dressLink().click();
    }

    @Then("category page and confirm text 'WOMEN - TOPS PRODUCTS' should be displayed")
    public void category_page_and_confirm_text_should_be_displayed() {
        productPage.assertCategoryItems();
        productPage.assertProductsRelated();
        productPage.assertTopsProduct();
        productPage.assertAll();
    }

}
