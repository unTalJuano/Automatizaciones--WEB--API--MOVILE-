#Author: jdoj@gmail.com

Feature: Test for google page

  @scenario1
  Scenario Outline: User can search with “Google Search”
    Given I’m on the homepage
    When I type <text> into the search field
    And  I click the Google Search button
    Then the first result is "The Name of the Wind - Patrick Rothfuss"
    When  I click on the first result link
    Then  I go to the page "The Books - Patrick Rothfuss"
    
    Examples:
    
    |text|
    |The name of the wind|
    
   @scenario2
   Scenario Outline: User can search by using the suggestions
		Given I’m on the homepage
		When I type <text> into the search field
		And I click on the first suggestion in the list
		Then the first result is "The Name of the Wind - Patrick Rothfuss"
		When I click on the first result link
		Then I go to the page "The Books - Patrick Rothfuss"
		
		Examples:
		|text|
		|The name of the w|