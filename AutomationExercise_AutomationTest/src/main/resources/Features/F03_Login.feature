@Login
Feature: Check the login functionality.

  Background: Open the website
    Given user launches the browser and navigates to the home page


  @Smoke @Regression
  Scenario: Test the login functionality when user enter correct Email and Password.
    When the user clicks on Signup_Login button
    Then 'Login to your account' and login button should be displayed
    When the user enters email address as "Hassan2005@gmail.com" and password as "Hassan2005"
    And clicks 'login' button
    Then 'Logged in as username' should be visible
    And delete account button and logout button should be visible

  @Regression
  Scenario: Test the login functionality when user enter correct Email and Password to logged in and Delete his Account.
    When the user clicks on Signup_Login button
    Then 'Login to your account' and login button should be displayed
    When the user enters email address as "Hassan2005@gmail.com" and password as "Hassan2005"
    And clicks 'login' button
    Then 'Logged in as username' should be visible
    And delete account button and logout button should be visible
    When user clicks on 'Delete Account' button
    Then 'ACCOUNT DELETED!' should be visible

  @Regression
  Scenario: Test the login functionality when user enter incorrect Email OR Password.
    When the user clicks on Signup_Login button
    Then 'Login to your account' and login button should be displayed
    When the user enters email address as "Alaa222333@gmail.com" and password as "Aa107632"
    And clicks 'login' button
    Then an error message 'Your email or password is incorrect!' should be displayed

  @Regression
  Scenario: Test the logout functionality when user enter correct Email and Password to logged in and then logged out.
    When the user clicks on Signup_Login button
    Then 'Login to your account' and login button should be displayed
    When the user enters email address as "Mazen2000@gmail.com" and password as "Mazen&2000"
    And clicks 'login' button
    Then 'Logged in as username' should be visible
    And delete account button and logout button should be visible
    When the user clicks 'logout' button
    Then user should be redirected to the login page

