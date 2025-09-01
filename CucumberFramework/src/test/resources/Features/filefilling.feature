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
Feature: Registration functionality
 
  @sanity
  Scenario Outline: Verify registration form with multiple sets of data
    Given the user is on the Registration page
    When the user enters first name "<firstname>" and last name "<lastname>"
    And the user enters phone "<phone>"
    And the user enters email "<email>"
    And the user enters address "<address>"
    And the user enters city "<city>"
    And the user enters state "<state>"
    And the user enters postal code "<postalcode>"
    And the user selects country "<country>"
    And the user enters username "<username>"
    And the user enters password "<password>" and confirm password "<confirmpassword>"
    And the user clicks on the submit button
    Then the registration should be successful
 
    Examples:
      | firstname | lastname | phone       | email           | address           | city     | state     | postalcode | country | username | password | confirmpassword |
      | Pj   | Kishore    | 1234567890  | Pj@gmail.com | hyd, Telangana       | hyderabad  | telangana    | 508001     | INDIA | pj05 | test123 | test123 |
      | sravan     | sai    | 91234567889  | kishore@gmail.com | Hyderabad, TG     | Hyderabad| Telangana | 500001     | INDIA   | kishore02 | abc456 | abc456 |

