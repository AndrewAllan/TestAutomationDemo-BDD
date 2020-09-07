@tag
Feature: As a user i can search for a hotel
  this feature will allow the user to enter information and return relevent hotels

  @Regression
  Scenario: search hotel by hotel name
    Given I am on the home page of phptravel
    And I select hotels from the search section 	
    When I enter a hotel name
    And I enter a check in date
    And I enter a check out date
    And I enter the number of adults
    When I press the search button 
    Then I am show the listing for the hotel


   @tag1
  Scenario: search hotel by city
    Given I am on the home page of phptravel
    And I select hotels from the search section 	
    When I enter a city name
    And I enter a check in date
    And I enter a check out date
    And I enter the number of adults
    When I press the search button 
    Then I am shown hotel listings for the city
    
     @Regression
  Scenario: search hotel with children
    Given I am on the home page of phptravel
    And I select hotels from the search section 	
    When I enter a hotel name
    And I enter a check in date
    And I enter a check out date
    And I enter the number of adults
    And I enter the number of children
    When I press the search button 
    Then I am show the listing for the hotel
    
     @tag1
  Scenario: check validation rules on destination
    Given I am on the home page of phptravel
    And I select hotels from the search section 	
    And I enter a check in date
    And I enter a check out date
    And I enter the number of adults
    When I press the search button 
    Then I am shown validation for the description feild
  
    