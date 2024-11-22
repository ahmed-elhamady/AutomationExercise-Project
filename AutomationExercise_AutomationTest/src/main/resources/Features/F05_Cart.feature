@Cart
Feature: Check the Cart functionality.

  Background: Open the website.
    Given user navigates to the home page

  @Smoke @Regression
  Scenario: Test the cart functionality when user add item/s to the cart from the products page.
    When user clicks on 'products' button
    And hover over first product and clicks 'add to cart'
    Then success message 'Added!' , view cart link and 'Continue Shopping' button should be displayed
    When the user click on 'Continue Shopping' button
    And hover over second product and clicks 'add to cart'
    Then success message 'Added!' , view cart link and 'Continue Shopping' button should be displayed
    When user clicks 'view cart' link
    Then both products should be added to cart, home and Checkout button should be displayed
    And product details like Item, Description, Price, Quantity and Total should be displayed correctly

  @Regression
  Scenario: Test the cart functionality when user remove item/s from the cart page.
    When user clicks on 'products' button
    And hover over first product and clicks 'add to cart'
    Then success message 'Added!' , view cart link and 'Continue Shopping' button should be displayed
    When the user click on 'Continue Shopping' button
    And hover over second product and clicks 'add to cart'
    Then success message 'Added!' , view cart link and 'Continue Shopping' button should be displayed
    When user clicks 'view cart' link
    Then both products should be added to cart, home and Checkout button should be displayed
    And product details like Item, Description, Price, Quantity and Total should be displayed correctly
    When user clicks 'x' icon to remove the product
    Then product should be removed from the cart page

  @Regression
  Scenario: Test the Product Quantity functionality when user Increase quantity of the product.
    When user clicks on 'products' button
    And hover over first product and clicks 'view product'
    Then Quantity field and 'Add to cart' button should displayed
    And Availability, Condition and Brand should be displayed
    When user increase the quantity to "4"
    And user clicks on 'Add to cart' button
    Then success message 'Added!' , view cart link and 'Continue Shopping' button should be displayed
    When user clicks 'view cart' link
    Then product should be displayed in cart page with exact quantity as "4"
