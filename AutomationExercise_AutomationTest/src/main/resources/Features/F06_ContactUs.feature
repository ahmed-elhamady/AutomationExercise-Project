@Contactus
Feature: Check the ContactUs functionality.

  @Smoke @Regression
  Scenario: Test the contactUs functionality when user clicks on contactUs button and submits the contact us form successfully.
    Given the user open the browser and navigates to the home page
    When user clicks on 'contactUs' button
    Then 'GET IN TOUCH' and 'Contact Us' should be appeared
    When the user enters name as "Hossam", email as "Hossam@gmail", subject as "programming languages" and message as "Hello, I am interested in learning more about programming languages like HTML, CSS, JS, Python and Java. Could you please provide more details? Thank you!"
    And the user uploads a file
    And the user clicks the 'Submit' button
    And the user clicks the OK button
    Then success message 'Success! Your details have been submitted successfully.' and home button should be appeared
    When the user clicks on 'Home' button
    Then user should be landed to home page successfully