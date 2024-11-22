@Signup
Feature: Check the User SignUp functionality.

  Background: Open the website.
    Given the user launches the browser and navigates to the home page


  @Smoke @Regression
  Scenario: Test the 'User SignUp' functionality when user enter valid data to signUp and enter valid data to Create New Account.
    When the user clicks on Signup OR Login button
    Then 'New User Signup!' and Signup button should be visible
    When the user enters name as "Hassan" and email address as "Hassan2005@gmail.com"
    And clicks 'Signup' button
    Then 'ENTER ACCOUNT INFORMATION' should be visible
    When the user fills in the details: select Title, Name , Email, Password as "Hassan2005", Date of birth
    And selects the checkbox 'Sign up for our newsletter!'
    And selects the checkbox 'Receive special offers from our partners!'
    And fills in the details: First name as "Hassan", Last name as "Ahmed", Company as "Amit Learning", Address as "123 Abdelaziz Street", Address_2 as "Apt 4B", select Country, State as "Single", City as "Alex", Zipcode as "M5H 2N2", Mobile Number as "01122334455"
    And clicks 'Create Account' button
    Then 'ACCOUNT CREATED!' and continue button should be visible
    When the user clicks 'Continue' button
    Then 'Logged in as username' , delete account button and logout button should be visible


  @Regression
  Scenario: Test the 'User SignUp' functionality when using an already used Email Address.
    When the user clicks on Signup OR Login button
    Then 'New User Signup!' and Signup button should be visible
    When the user enters name as "Mazen" and email address as "Mazen2000@gmail.com"
    And clicks 'Signup' button
    Then an error message 'Email Address already exist!' should be appeared and signUp button should be displayed


  @Regression
  Scenario: Test the 'Delete Account' functionality when user create an Account and delete it.
    When the user clicks on Signup OR Login button
    Then 'New User Signup!' and Signup button should be visible
    When the user enters name as "John" and email address as "John2332@gmail.com"
    And clicks 'Signup' button
    Then 'ENTER ACCOUNT INFORMATION' should be visible
    When the user fills in the details: select Title, Name , Email, Password as "John&332020", Date of birth
    And selects the checkbox 'Sign up for our newsletter!'
    And selects the checkbox 'Receive special offers from our partners!'
    And fills in the details: First name as "John", Last name as "Doe", Company as "Amit Learning", Address as "123 Maple Street", Address_2 as "Apt 4B", select Country, State as "Ontario", City as "Toronto", Zipcode as "M5H 2N2", Mobile Number as "01122334466"
    And clicks 'Create Account' button
    Then 'ACCOUNT CREATED!' and continue button should be visible
    When the user clicks 'Continue' button
    Then 'Logged in as username' , delete account button and logout button should be visible
    When the user clicks 'Delete Account' button
    Then 'ACCOUNT DELETED!' and delete message and continue button should be visible

