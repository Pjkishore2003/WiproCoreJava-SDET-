@DemoblazeTests
Feature: Full User Journey and Validation on Demoblaze Website
  As a user and tester of the Demoblaze website
  I want to verify both the successful end-to-end user flow
  And check how the application handles invalid user inputs

  @Positive
  Scenario: Successful user registration
    Given I am on the Demoblaze home page
    When I navigate to the registration page
    And I enter account details with username "pjkishore" and password "pjkishore"
    And I click the "Sign up" button
    Then a "Sign up successful." alert should be displayed

  @Positive
  Scenario: End-to-end flow from login to purchase
    Given I am on the Demoblaze home page
    When I navigate to the login page
    And I enter login username "pjkishore" and password "pjkishore"
    And I click the "Log in" button
    Then I should be logged in as "pjkishore"
    And I add "Iphone 6 32gb" to the cart
    And I view the shopping cart
    When I navigate to the checkout page
    And I fill in valid shipping and payment details
    And I confirm the purchase
    Then a purchase confirmation page should be displayed

  @Negative
  Scenario: TC_N01 - Verify sign up with an existing username
    Given I am on the Demoblaze home page
    When I navigate to the registration page
    And I enter account details with existing username "tester" and password "password"
    And I click the "Sign up" button
    Then a "This user already exist." alert should be displayed

  @Negative
  Scenario: TC_N02 - Verify login with an incorrect password
    Given I am on the Demoblaze home page
    When I navigate to the login page
    And I enter login username "tester" and password "wrongpassword"
    And I click the "Log in" button
    Then a "Wrong password." alert should be displayed

  @Negative
  Scenario: TC_N03 & N04 - Verify login with blank username and password fields
    Given I am on the Demoblaze home page
    When I navigate to the login page
    And I click the "Log in" button
    Then a "Please fill out Username and Password." alert should be displayed

  @Negative
  Scenario: TC_N05 - Verify checkout with missing required fields
    Given I am on the Demoblaze home page
    When I navigate to the login page
    And I enter login username "pjkishore" and password "pjkishore"
    And I click the "Log in" button
    Then I should be logged in as "pjkishore"
    When I add "Samsung galaxy s6" to the cart
    And I view the shopping cart
    And I navigate to the checkout page
    And I attempt to purchase without filling name and credit card
    Then a "Please fill out Name and Creditcard." alert should be displayed
