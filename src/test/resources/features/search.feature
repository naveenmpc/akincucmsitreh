Feature: : Search functionality

  Scenario: To test the search functionality of demowebshop page
    Given I am on Search page of demowebshop
    When I search the product 
    And I click on Add to cart
    Then I click on Logout
