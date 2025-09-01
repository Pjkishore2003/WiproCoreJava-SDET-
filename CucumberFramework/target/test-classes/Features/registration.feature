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
Feature: Student Registration Form

  @sanity
  Scenario Outline: Fill student registration form and submit
    Given User is on the Selenium Practice Registration page
    When User enters Name "<name>"
    And User enters Email "<email>"
    And User selects Gender "<gender>"
    And User enters Mobile Number "<mobile>"
    And User enters Date of Birth "<dob>"
    And User enters Subject "<subject>"
    And User selects Hobbies "<hobbies>"
    And User uploads Picture "<picturePath>"
    And User enters Current Address "<address>"
    And User selects State "<state>" and City "<city>"
    Then User submits the form
    And User should see the confirmation message

    Examples:
      | name    | email             | gender | mobile      | dob        | subject | hobbies | picturePath                                                               | address     | state | city |
      | Kishore | pj@example.com    | Male   | 9876543210  | 05/01/2003 | Maths   | Sports  | C:\Users\kisho\Downloads\wallpaperflare.com_wallpaper (1).jpg             | 123 hyd     | NCR   | Agra |
