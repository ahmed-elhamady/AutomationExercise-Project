@Products
Feature: Check the products functionality.

  Background: SetUp the Browser
    Given the user go to the browser and navigates to the home page

  @Smoke @Regression
  Scenario: Test the products functionality when user click on Products button to navigate the products page.
    When user clicks 'products' button
    Then 'All Products' should be visible
    And 'Search' field and button should be displayed

  @Regression
  Scenario: Test the Search functionality when user Search for a product.
    When user clicks 'products' button
    Then 'All Products' should be visible
    And 'Search' field and button should be displayed
    When the user enters the product name as "MEN" in the search input
    And clicks 'Search' button
    Then 'SEARCHED PRODUCTS' should be displayed
    And all the products related to the search should be displayed

  @Regression
  Scenario: Test the Search functionality when user Navigate through categories and sub-categories.
    When user clicks 'products' button
    Then 'All Products' should be visible
    And 'Search' field and button and 'category' link should be displayed
    When the user click on'Women' category
    And click on any category link under 'Women' category, for example: Dress
    Then category page and confirm text 'WOMEN - TOPS PRODUCTS' should be displayed
    And all the products related to the search should be displayed