Feature: Application Login

Scenario: Home Page Default Login
Given User is on netbanking login page
When user login using pwd "rrr" and username "uuu"
Then Home is populated
And cards are displayed



Scenario: Home Page Default Login
Given User is on netbanking login page
When user login using pwd "yyy" and username "eeee"
Then Home is populated
And cards are displayed