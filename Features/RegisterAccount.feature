Feature:Register Account
  Scenario: Register Account with valid credentials

    When User launches browser and navigate to url
    When User clicks on My Account
    Then User clicks on Register button
    And User provide firstname
    And User provide lastname
    Then User provide email
    When User provide telephone
    Given User provide password
    Given User confirm password
    And User unsubsribe to newsletter
    When User accept Privacy Policy
    Then User continues to Register Account
    When User navigates to My Account
    Then User clicks on logout