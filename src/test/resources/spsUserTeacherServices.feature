Feature: As QA Engineer I want to Create, Update, and Delete Teacher Profile,
         In order to Validate End to End Testing of SPS User Profile.

#@chosen
@original
Scenario: Create teacher using sps user services
As a SPS User I want to create teacher using sps user services - "Create Teacher & Get The Profile". 
	Given I am Using SPS User Service to "Create Teacher Profile" 
	When I am Calling The Create Teacher Service End Point 
	Then Should Display New Teacher Profile in response. 

@original
Scenario: Update teacher profile using sps user services
As a SPS User I want to update teacher profile using sps user services - "Create Teacher, Update & Get The Profile". 
	Given I am Using SPS User Service to "Update Teacher Profile"
	When I am Calling The Update Teacher Service End Point 
	Then Should Display Updated Teacher Profile in response.

@original
Scenario: Delete teacher profile using sps user services
As a SPS User I want to delete teacher profile using sps user services - "Create Teacher & Delete the Teacher Profile". 
	Given I am Using SPS User Service to "Delete Teacher Profile"
	When I am Calling The Delete Teacher Service End Point 
	Then Should Display No Teacher Profile - "Deleted" in response.