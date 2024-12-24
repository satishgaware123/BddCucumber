Feature: Login Funtionality

  Scenario: verifying user should be longin with valid inputs
    Given open the browser
    Given user navigate to the test site
    And user enter the username
    When user enter the  password
    And user click on the login button
    And verify user navigate to the home page
    Then close the browser
    
    


    
    
    