Feature: As QA Engineer I want to Add, Update, Get and Delete the Child users from the Teacher or Parents Profile.
         In order to Validate the End to End Testing of Create Complete Teacher or Parent Profile.

#@target-H1
@chosen-new-computer-1
Scenario: Add child user using sps child Service
As a SPS User I want to add child user using sps child Service to - "Create Teacher and Parent Profile, Add Child To the Profile 
and Get the Child Info". 
	Given I am Using SPS Child Service to "Add Child" 
	When I am Calling the Add Child Service End Point 
	Then I should Get the "Added Child Info" in response.
	
	@injected
	Scenario: Use SPS child Service to add child user-10
    	Given I am required to "Add Child" Using SPS Child Service
    	When I am Executing the Add Child Service End Point
    	Then I should receive a response of "Added Child Info" 	
	
	@injected
	Scenario: Additional of child user through SPS service-8
    	Given I want to "add child service" using SPS child service
    	When I start the Add Child Service End Point process
    	Then I have to receive "Added Child Info" as a response

#@chosen
@original
Scenario: Update child user using sps child Service
As a SPS User I want to update child user using sps child Service to - "Create Teacher and Parent Profile, Add Child, 
Update and Get the Child Info". 
	Given I am Using SPS Child Service to "Update Child" 
	When I am Calling the Update Child Service End Point 
	Then I should Get the "Updated Child Info" in response.
	
@original
Scenario: Delete child user using sps child Service
As a SPS User I want to delete child user using sps child Service to - "Create Teacher and Parent Profile, Add Child and 
Delete the Child". 
	Given I am Using SPS Child Service to "Delete Child" 
	When I am Calling the Delete Child Service End Point 
	Then I should Get the "No Child Info - Deleted" in response.
	