Feature: Returning Customer
  Scenario: Returning customer with valid Credentials
    When User launches the browser and navigate to url
    And User Register Account
    And User clicks My Account
    When User clicks on login
    Then User provides email
    And User provides password
    Then User clicks on loginbutton