@captureImage @browserTest
Feature: Capture screenshot on failure
  I want to use this template to capture a screenshot on failure

  Background: 
    Given a user is on "Automation practice" page
    When the user selects "signIn"
    And the user enters "tejal.naik@gmail.com" and "BJSSTest"

  Scenario Outline: Asserting Order details
  And the user views "order history and details"
  And the user selects an "<order>" by date
  And the users confirms that the dress "<dressref>" is "<description>"
  Then the user selects "signOut" 
  
  Examples:
  |   order  |dressref|					description		 			  |
  |10/18/2018| demo_2 |Blouse - Color : Red, Size : S |
