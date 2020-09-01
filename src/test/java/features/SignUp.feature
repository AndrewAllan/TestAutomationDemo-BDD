@tag
Feature: sign up 
to check that a valid user can sign up to phptravel will also check some of the validation
rules

  @tag1
  Scenario: forename validation check
    Given I am on the sign in page
    And I enter my lastname
    And I enter my mobile number
    And I enter my email address
    And I enter my new password
    And I enter my confirm password
    When I press submit
    Then I am displayed a forename validation message

@tag1
  Scenario: email validation check
    Given I am on the sign in page
    And I enter my lastname
    And I enter my mobile number
    And I enter my forename
    And I enter my new password
    And I enter my confirm password
    When I press submit
    Then I am displayed a email validation message
    
    @tag1
  Scenario: lastname validation check
    Given I am on the sign in page
    And I enter my forename
    And I enter my mobile number
    And I enter my email address
    And I enter my new password
    And I enter my confirm password
    When I press submit
    Then I am displayed a lastname validation message
    
    @tag1
  Scenario: mobile number validation check
    Given I am on the sign in page
    And I enter my lastname
    And I enter my forename
    And I enter my email address
    And I enter my new password
    And I enter my confirm password
    When I press submit
    Then I am displayed a mobile number validation message
 
     @tag1
  Scenario: password validation check
    Given I am on the sign in page
    And I enter my lastname
    And I enter my forename
    And I enter my email address
    And I enter my forename
    And I enter my confirm password
    When I press submit
    Then I am displayed a password validation message
    
        @tag1
  Scenario: confirm password validation check
    Given I am on the sign in page
    And I enter my lastname
    And I enter my forename
    And I enter my email address
    And I enter my new password
    And I enter my forename
    When I press submit
    Then I am displayed a confirm passowrd validation message
    
      @tag1
  Scenario: user registeres with site
    Given I am on the sign in page
    And I enter my lastname
    And I enter my forename
    And I enter my email address
    And I enter my new password
    And I enter my forename
    And I enter my confirm password
    When I press submit
    Then I am redirected to the account screen
    