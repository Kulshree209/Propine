# Propine

Behavior Driven Framework using Maven, Cucumber and Selenium

Base Url: https://vast-dawn-73245.herokuapp.com/submit

Automated below 2 scenarios -

#Author: kulshree.patil@gmail.com
#Keywords Summary : Propine test
#Feature: List of scenarios.
valid
  Scenario: Performing first scenario of Test
  Given User redirects to url 'https://vast-dawn-73245.herokuapp.com/submit'
  And enter valid date in Date field 
	And  extract the result and display it on console
	Then close the browser
 
invalid
 Scenario: Performing first scenario of Test
 Given User redirects to url 'https://vast-dawn-73245.herokuapp.com/submit'
 And enter invalid date in Date field 
 And  extract the error and display it on console
 And Verify the error message
 Then close the browser
