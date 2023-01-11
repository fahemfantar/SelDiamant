@E2E

Feature: Loginof TuttoSport applicaltion
Scenario: Connect with email and password correct
Given  I launch the TuttoSport application
When I hover and click on connexion button
Then The connexion page is displayed
When I enter the email "fahem.fantar@gmail.com"
And I entre the password "f1111000"
And I click on submit button

Then I connect on the application 