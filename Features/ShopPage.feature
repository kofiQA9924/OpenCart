Feature: Shop Page
  Scenario: A Returning Registered Customer
    When A Registered user logs in
    And User clicks on phones & PDSs
    And User adds iphone to Cart
    Then User selects Cameras
    And User Adds Nikon D300 to cart
    When User clicks cart
    Then User checkout
    But User logs out