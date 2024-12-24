Feature: Testing test Project Site

  Scenario Outline: validating login with valid and invalid data
    Given user navigate to the login page
    And user enter the "<username>" & "<password>"
    When click on the login button
    Then close the Browser

    Examples: 
      | username                 | password  |
      | newaurmember@yopmail.com | Admin@123 |
      | newaurmember             | Admin@123 |
      | newaurmember@yopmail.com | 3214@123  |
