#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Regression
Feature: Booking a Hotel
  I want to book a hotel 

Background:
	
	When user clicks login button "loguinsdet" "loguin"
   
  @sydney
  Scenario: booking hotel creek in sydney



  When user enters the requirements with "1" "1"
  And user selects the room
 	And user enters the booking details
  Then booking has been completed
 
  
  
  
  @paris
  Scenario: booking hotel sunshine in paris

	 When user enters the requirements with "2" "2"
  And user selects the room
 	And user enters the booking details
  Then booking has been completed
 
 
   @london
  Scenario: booking hotel hervey in london

 When user enters the requirements with "3" and "3"
  And user selects the room
 	And user enters the booking details
  Then booking has been completed
 
  
	
  