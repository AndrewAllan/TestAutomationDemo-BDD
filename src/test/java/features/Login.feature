#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: login
  

  @tag1
  Scenario: login happy path
    Given I am on the login screen
    And I enter my username 
    And I enter my password
    When I press the submit button
    Then I am navigated to the account page 

   @tag1
  Scenario: email validation check
    Given I am on the login screen
    And I enter my username 
    When I press the submit button
    Then a validation email validation message is displayed  
    
    @tag1
  Scenario: password validation check
    Given I am on the login screen
    And I enter my password 
    When I press the submit button
    Then a validation password validation message is displayed 