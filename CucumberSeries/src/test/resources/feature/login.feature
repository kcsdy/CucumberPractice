Feature: Login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to the facebook website as a user
    Given user navigates to the facebook website
    When user validates the home page title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on signin button

    Examples: 
      | username | password |
      | valid    | valid    |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |
