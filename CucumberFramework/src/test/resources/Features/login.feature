#Feature: Login Functionality

  #@regression
#  Scenario: Verify login functionality for both valid and invalid credentials
   # Given User is on the login page

    # Invalid credentials attempt
   # When user enters username as "invalidUser"
    #And user enters password as "invalidPass"
    #And user clicks on the login button
    #Then user should see an error message "Invalid credentials"
    #And user remains on the login page

    # Valid credentials attempt
    #When user enters username as "Admin"
    #And user enters password as "admin123"
    #And user clicks on the login button
    #Then user is navigated to the home page
Feature: Login Functionality

#@sanity
#Scenario Outline: Verify the login functionality for valid credentials using parameterization
 # Given User is on the login page
  #When user enters the "<username>" and "<password>"
  #And user clicks on the login button
  #Then user is navigated to home page

#Examples:
 # | username | password  |
  #| Admin    | admin123  |
  #| Admin    | admin123  |
  #| Admin    | admin123  |
 Background: Given User is on the login page
 @regression
 Scenario Outline: Successful login with valid credentials
  Given User is on the login page
  When user enters the "<username>" and "<password>"
  And user clicks on the login button
  Then user is navigated to the home page

Examples:
  | username | password |
  | Admin    | admin123 |
@sanity
Scenario Outline: Unsuccessful login with invalid credentials
  Given User is on the login page
  When user enters the "<username>" and "<password>"
  And user clicks on the login button
  Then user should see an error message "Invalid credentials"
  And user remains on the login page

Examples:
  | username | password  |
  | Admin    | wrong123  |
 
    