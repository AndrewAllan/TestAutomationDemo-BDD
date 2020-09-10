@tag
Feature: As a user i can change the currency used on the site
 	

  @tag1
  Scenario: change currency to euro
    Given I am on the home page 
    And I select euro from the currency dropdown
    Then I am show prices in euros

  @tag2
  Scenario: default currency is USD
    Given I am on the home page 
    Then The default currency selected is USD
    And prices on the site are in USD 
