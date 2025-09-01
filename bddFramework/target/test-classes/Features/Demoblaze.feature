@tag
Feature: End-to-End User Flow on Demoblaze
As a user of the Demoblaze website
I want to register, log in, and make a purchase
So that I can test the full user journey

Scenario: Successful user registration
Given I am on the Demoblaze home page
When I navigate to the registration page
And I enter account details with username "pjkishore" and password "pjkishore"
And I click the "Sign up" button
Then a "Sign up successful." alert should be displayed

Scenario: End-to-end flow from login to purchase
Given I am on the Demoblaze home page
When I navigate to the login page
And I enter login username "pjkishore" and password "pjkishore"
And I click the "Log in" button
Then I should be logged in as "pjkishore"
And I add "Iphone 6 32gb" to the cart
And I view the shopping cart
And the cart should display the correct products and total price
When I navigate to the checkout page
And I fill in valid shipping and payment details
And I confirm the purchase
Then a purchase confirmation page should be displayed