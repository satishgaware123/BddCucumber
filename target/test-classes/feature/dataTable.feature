Feature: Testing Aurelius Site

  Scenario: verifying login functionality
    Given user navigate to the login page
    And user enter the email address and password
      | newaurmember@yopmail.com | Admin@123 |
    And click on the login button
    Then close the Browser
