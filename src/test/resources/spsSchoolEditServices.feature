Feature: As QA Engineer I want to change user's existing school to existing International School, Home school, Manual School or 
send a request to customer service to review my school Info because of the school name is correct, but the address is incorrect.
         In order to Validate the End to End Testing of edit user's school information.

#@chosen
@target-just-this
Scenario: Change existing US domestic school to existing international school using sps edit school services
As a SPS User I want to change existing US domestic school to existing international school using sps edit school services - "Create Teacher attached with US Domestic School, Access to Account & Change the School by Add existing International School Id".
 
	Given I am Using SPS Edit School Service to Change from US Domestic School to "Existing International School"
	When I am Calling the Edit Domestic To International School Service End Point
	Then I should See the School changed to "International School" in response.
	
	@injected
	Scenario: changing US domestic school to international school using sps school edit services-5
	Given sps school edit services are up and running
	And I am authentic user to change information in database
	And I am allowed to view school information in database
	When I query school database using sps edit school service
	Then school is changed from domestic to international
	And I see changes applied.

	
	@injected
	Scenario: The use of sps edit to change available US domestic school to available international school-7
    Given that SPS Edit School Service is used to Change from US Domestic School to "Existing International School"
    When Edit Domestic To International School Service End Point  called 
    Then the response should be "International School"
	
	@injected
	Scenario: Alter school information using school profile in the main page-6
   Given School profile information
   When I am selecting modify link in the main menu of school profile
   Then I should get failure or success message of the action after altering information
	
#@chosen
@target
Scenario: Change existing US domestic school to home School using sps edit school services
As a SPS User I want to change existing US domestic school to home School using sps edit school services - "Create Teacher attached with US Domestic School, Create Home School, Access to Account & Change the School by Adding the Home School".

	Given I am Using SPS Edit School Service to Change from US Domestic School to "Home School"
	When I am Calling the Edit Domestic To Home School Service End Point
	Then I should See the School changed to "Home School" in response.
	
	@injected
	Scenario: Replace current US domestic school to home School utilizing sps edit school services-10
    Given US Domestic Schools are replaced by "Home School" by utilizing SPS Edit School Service
    When the Edit Domestic To Home School Service End Point is invoked
    Then the School are replaced by "Home School" in response
	
	@injected
	Scenario: Renaming existing Domestic school to home school using SPS school services editor-8
    Given I want to change US domestic school to "home School" by the use of SPS school service editor
    When I initiate the Edit Domestic to Home School Service End Point
    Then the school is changed to home school
    And the response message for the action is shown
	
@original
Scenario: Change existing US domestic school to manual School using sps edit school services
As a SPS User I want to change existing US domestic school to manual School using sps edit school services - "Create Teacher attached with US Domestic School, Create Manual School, Access to Account & Change the School by Adding the Manual School".
 
	Given I am Using SPS Edit School Service to Change from US Domestic School to "Manual School" 
	When I am Calling the Edit Domestic To Manual School Service End Point 
	Then I should See the School changed to "Manual School" in response.
	
@original
Scenario: Send my school info using sps edit school services to send a request to customer service to review my school Info
As a SPS User I want to send my school info using sps edit school services to send a request to customer service to review my school Info - "Create Teacher attached with US Domestic School, Access to Account & Send School Info for Review".

	Given I am Using SPS Edit School Service to Send request for "Review" 
	When I am Calling the Edit School Service for Review End Point 
	Then I should Get the Request for "Review Sent" in response.
	