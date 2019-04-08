Feature: As QA Engineer I want to Create, Update, Upgrade and Delete Consumer Profile,
         In order to Validate End to End Testing of SPS User Profile.
 #@chosen 
 @original    
Scenario: Create consumer profile using sps user services
As a SPS User I want to create consumer profile using sps user services - "Create & Get Consumer Profile". 
	Given I am Having SPS User Service to "Create Consumer Profile" 
	When I am Calling The Service End Point of Create Consumer
	Then I should Have "New Consumer Profile" in response.

 @original
Scenario: Update consumer profile using sps user services
As a SPS User I want to update consumer profile using sps user services - "Update & Get Consumer Profile". 
	Given I am Having SPS User Service to "Update Consumer Profile" 
	When I am Calling The Service End Point of Update Consumer
	Then I should Have "Updated Consumer Profile": in response.
 
 #@original
  @original
Scenario: Delete consumer profile using sps user services
As a SPS User I want to delete consumer profile using sps user services - "Delete Consumer Profile". 
	Given I am Having SPS User Service to "Delete Consumer Profile" 
	When I am Calling The Service End Point of Delete Consumer
	Then I should Have "No Consumer Profile - Deleted" in response.

#@chosen
@target-consumer
Scenario: Upgrade consumer profile to teacher using sps user services
As a SPS User I want to upgrade consumer profile to teacher using sps user services - "Upgrade Consumer to Teacher & Get The Profile". 
	Given I am Having SPS User Service to "Upgrade Consumer To Teacher" 
	When I am Calling The Service End Point of Upgrade Consumer
	Then I should Have "Teacher Profile - Upgraded from Consumer" in response.
	
	@injected
	Scenario: Upgrade consumer profile to teacher using sps user service-5
    Given sps user services are up and running
    When i am calling sps user upgrade services 
    Then consumer profile is upgraded to teachers profile
	
	@injected
	Scenario: Upgrade of  consumer user profile to teacher user profile using sps user services-7
	Given I perform "Upgrade Consumer To Teacher" SPS User Service
	When The Service End Point of Upgrade Consumer has been issued
	Then upgrade to "Teacher Profile - Upgraded from Consumer" should occur as result
	
	@injected
	Scenario: Update user information using user's profile page-6
	Given User profile information
	When I click a link update user profile
	Then I should receive a message "user information updated successfully" after editing user information
	
#@ignore
 @original
Scenario: Add child to a consumer profile using sps user services
As a SPS User I want to add child to a consumer profile using sps user services - "Add Child To Consumer Profile & Get The Child Info ". 
	Given I am Having SPS User Service to "Add Child To Consumer Profile" 
	When I am Calling The Service End Point of Add Child
	Then I should Have "Child Info - Added to Consumer Profile" in response.