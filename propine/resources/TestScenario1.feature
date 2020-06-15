  #Author: kulshree.patil@gmail.com
#Keywords Summary : Propine test
#Feature: List of scenarios.

@QAtest
Feature: Validating Test Parser

  @valid
  Scenario: Performing first scenario of Test
  Given User redirects to url 'https://vast-dawn-73245.herokuapp.com/submit'
  And enter valid date in Date field "<date>" 
	And  extract the result and display it on console
	Then close the browser

 | date |
 | 12/12/12 |
 
 @invalid
 Scenario: Performing first scenario of Test
 Given User redirects to url 'https://vast-dawn-73245.herokuapp.com/submit'
 And enter invalid date in Date field "<indate>"
 And  extract the error and display it on console
 And Verify the error message
 Then close the browser

 | indate |
 | abc  |
