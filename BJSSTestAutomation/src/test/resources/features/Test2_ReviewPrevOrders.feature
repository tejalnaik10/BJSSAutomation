@reviewPrevOrders @browserTest
Feature: Review Previous Orders and add a message
  I want to use this template to review previous orders and add a message

  Background: 
    Given a user is on "Automation practice" page
    When the user selects "signIn"
    And the user enters "tejal.naik@gmail.com" and "BJSSTest"

  Scenario Outline: Review Previous orders
  And the user views "order history and details"
  And the user selects an "<order>" by date
  Then the user adds a "<comment>" on the order
  Then the user verifies the "<comment>"
  Then the user selects "signOut" 
  
  Examples:
  |   order  |    comment    |
  |10/18/2018|Automation test|
