Feature: Virgo Healthcare Test
Scenario Outline: Registration on the Virgo Site 
Given I Navigate to Virgo site by entering valid URL
    When I click on  My Account Icon
    Then I validate that Registration page is displayed
    Then I fill in the <Username> and <Password>
    And Click on Register button
    Then I validate that Account is created successfully
    Then I close the browser
 
 Examples: 
 |Username|Password|
 |virgo0108@yopmail.com|Welcome@0108@goa|
 |test0108@yopmail.com|Welcome@0108@goa|   
 

Scenario: Search a product on the  Home Page 
Given I Navigate to Virgo site by entering valid URL 
When I click on the Search Icon 
Then I search Lycowerg 
Then I close the browser

@SmokeTest
Scenario: Search a product on the Home page using Capital Letters search item
Given I Navigate to Virgo site by entering valid URL 
When I click on the Search Icon 
Then I search product 
Then I close the browser
