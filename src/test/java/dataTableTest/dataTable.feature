Feature: Data table 
#Verify that the new user registration is unsuccessful after passing incorrect inputs.

Scenario:
	Given I am on new user registration page
	When I enter invalid data on the page
	| Fields                 | Values              |
	| First Name             | Tom                 |
	| Last Name              | Kenny               |
	| Email Address          | someone@someone.com |
	| Re-enter Email Address | someone@someone.com |
	| Password               | Password1           |
	Then User registration should be unsuccessful