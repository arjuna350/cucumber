Feature: Cucumber Tag

Scenario Outline: Login functionality for a social networking site.
	Given user navigates to facebook
	When I enter Username as "<username>" and Password as "<password>"
	Then login should be unsuccessful
	
	Examples:
	| username  | password | 
	| username1 | password1 | 
	| username2 | password2 |
	

#following scenario has been tagged as SmokeTest and this should get executed. 

@SmokeTest
Scenario:
	Given user navigates to facebook
	When I enter Username as "tom" and Password as "jerry"
	Then the user should be redirected to login retry