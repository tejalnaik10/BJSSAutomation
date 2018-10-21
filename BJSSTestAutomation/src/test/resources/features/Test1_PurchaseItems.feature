@purchaseItems @browserTest
Feature: Happy Path- Purchase 2 items
  I want to use this template to purchase 2 items

  Background: 
   Given a user is on "Automation practice" page
    When the user selects "signIn"
    And the user enters "tejal.naik@gmail.com" and "BJSSTest"

  Scenario: 
    And the user navigates to "Home" page
    Then the user selects "firstItem"
    And the users changes the "Size" of the item to "M"
    And the user "Adds to cart"
    Then the user "Continues shopping"
    And the user selects "secondItem"
    And the user "Adds to cart"
    And the user "Proceeds to checkout"
    And the user verifies the order details
    Then the user places the order
    Then the user selects "signOut"