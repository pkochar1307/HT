Feature: Hotel login Functionality
Scenario: firstname not entered
Given User is on registration Page
When firstname is blank
Then Dispay Error Message 'Please fill the First Name'

Scenario: Lastname not entered
Given User is on registration Page
When lastname is blank
Then Display Error Message 'Please enter Lastname'

Scenario: Email not entered 
Given User is on registration Page
When Email is blank
Then Display alert 'Please enter email'

Scenario: Mobile Number not entered 
Given User is on registration Page
When Mobile Number is blank
Then Display alert 'Please enter mobile number'

Scenario: Invalid Email 
Given User is on registration Page
When Invalid email is entered
Then Display alert 'Invalid email'

Scenario: Invalid Mobile Number 
Given User is on registration Page
When Invalid Mobile Number is entered
Then Display alert 'Invalid Mobile Number'
