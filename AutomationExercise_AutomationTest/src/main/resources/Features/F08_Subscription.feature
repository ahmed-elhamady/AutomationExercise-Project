@Subscription
Feature: Check the subscription functionality.

  Background: open the website.
    Given user open the home page

  @Regression
  Scenario: Test the subscription functionality when user open the 'Home' page and subscription to the new updates.
    When user enter the email address as "Ali@gmail.com"
    And clicks on arrow Btn
    Then the success message 'You have been successfully subscribed!' should be appeared

  @Regression
  Scenario: Test the subscription functionality when user open the 'Cart' page and subscription to the new updates.
    When the user click on 'Cart' button
    And user enter the email address as "Ali@gmail.com"
    And clicks on arrow Btn
    Then the success message 'You have been successfully subscribed!' should be appeared