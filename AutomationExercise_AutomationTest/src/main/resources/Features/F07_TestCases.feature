Feature: Check the test case functionality.

  Background: Open the website
    Given the user go to the Home page

  Scenario: Test the test cases functionality when user click on Test Cases button.
    When user click on 'TestCases' button
    Then user navigates to the Test Cases page