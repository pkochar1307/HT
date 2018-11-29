Feature: Hotel login Functionality
Scenario: Username Password not entered
Given User is on login Page
When Username Password is blank
Then Dispay Error Message 'Please enter Username'

Scenario:Password not entered
Given User is on login Page
When Username is given but Password is blank
Then Dispay Error Message 'Please enter Password'

Scenario:Username and Password not correct
Given User is on login Page
When Username and Password are not correct
Then Dispay Error Message 'Invalid login'

Scenario:Username and Password are correct
Given User is on login Page
When Username and Password are  correct
Then Dispay Error Message 'Valid Login'



 