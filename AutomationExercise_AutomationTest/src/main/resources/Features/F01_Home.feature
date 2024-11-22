@Home
Feature: Check the Home functionality.

  Background: Open the website.
    Given user navigate to the Home page


  @Smoke @Regression
  Scenario: Test the Home functionality when user clicks on 'Home' button.
    Then Home button should be enabled
    And image, H1 'Automation Exercise' , H2 'Full-Fledged practice website for Automation Engineers' and paragraph 'All QA engineers can use this website' should be visible
    And TestCases and APIsList buttons should be displayed
    And Features items, Category and Brands should be displayed

  @Regression
  Scenario: Test the Scroll Up functionality using 'Arrow' button.
    Then Home button should be enabled
    And image, H1 'Automation Exercise' , H2 'Full-Fledged practice website for Automation Engineers' and paragraph 'All QA engineers can use this website' should be visible
    And TestCases and APIsList buttons should be displayed
    When the user scroll down to the footer
    Then 'Arrow' button should be displayed
    When user click on 'Arrow' button
    Then user should be navigated to the top of the page and H1 'Automation Exercise' , H2 'Full-Fledged practice website for Automation Engineers' should be visible
    And TestCases and APIsList buttons should be displayed

  @Regression
  Scenario: Test the Scroll Up functionality without using 'Arrow' button.
    Then Home button should be enabled
    And image, H1 'Automation Exercise' , H2 'Full-Fledged practice website for Automation Engineers' and paragraph 'All QA engineers can use this website' should be visible
    And TestCases and APIsList buttons should be displayed
    When the user scroll down to the footer
    Then 'Arrow' button should be displayed
    When user scroll up to the top
    Then user should be navigated to the top of the page and H1 'Automation Exercise' , H2 'Full-Fledged practice website for Automation Engineers' should be visible
    And TestCases and APIsList buttons should be displayed