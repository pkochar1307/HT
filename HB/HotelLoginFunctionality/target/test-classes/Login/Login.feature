Feature: Hotel login Functionality
Scenario: Username not entered
Given User is on login Page
When Username Password is blank
Then Dispay Error Message 'Please enter Username'
