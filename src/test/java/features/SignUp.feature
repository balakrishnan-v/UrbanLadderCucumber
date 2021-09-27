Feature: Urbanladder
#1
Scenario: SignUp for UrbanLadder

Given driver is intialised
And url "https://urbanladder.com" is entered
When wait for few seconds and enter the login credentials
Then click on login in

#2

Scenario: Updating details
When profile is clicked and profie page is loaded 
#Then edit the profile with "username" and "phonenumber"

#3
Scenario: Landing on Stores
When stores is clicked
#Then stores page is opened and get the details  
#4
Scenario: Checking for Customer stories
When customer stories is clicked
#Then customer stories page is opened
#5
Scenario: About the company
When About the company is clicked
#Then About the company page is opened
#6
Scenario: Searching for a product
When lights are searched 
#Then click on the required light
#7
Scenario: Adding to cart
When light is shown and click on add cart
#8
Scenario: Checking for EMI
When lights page is opened and check for EMI
#9
Scenario: Signing up for givewaway
When enter <email> by username
#Then click subscribe button

#10
Scenario: LOggin out
When click logout
