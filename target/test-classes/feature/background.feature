Feature: Testing the Aurelius

  Background: user is on login Page
    Given user navigate to lpage
    And eters username & password
    Then click on the login button

  Scenario: testing home Page
    Given click on the profile tab

  Scenario: testing homePage
    Given click on the people tab
    Given close the browser
    