Feature: As QA Engineer I want to Add, Update, Get and Delete the Grade and the Class Size from the Teachers Profile.
In order to Validate the End to End Testing of Create Complete Teacher Profile.

#@chosen
@target-chosen-2
  Scenario: Add grade class size using sps GradeClassSize Service 
    As a SPS User I want to add grade class size using sps GradeClassSize Service  - "Create Teacher, Add GradeClassSize 
    and Get the GradeClassSize ".

    Given I am Using SPS GradeClassSize Service to "Add GradeClassSize"
	When I am Calling the Add GradeClassSize Service End Point
	Then I should See the "Added GradeClassSize to the Profile" in response.
	
	@injected
	Scenario: Use spsGradeClassSize Service to add grade class-10
        Given I have to " Add GradeClassSize " via SPS GradeClassSize Service
        When I am Executing the Grade Class Size Service End Point
        Then I should receive a response of " Added Grade Class Size Info"
	
	@injected
	Scenario: Using SPS GradeClassSize to increase grade class size-8
    	Given GradeClassSize is added using SPS GradeClassSize Service
    	When I trigger Add GradeClassSize Service End Point
    	Then GradeClassSize is added to the profile
    	And I receive the confirmation message	

  @original
  Scenario: Update grade class size using sps GradeClassSize Service 
    As a SPS User I want to update grade class size using sps GradeClassSize Service  - "Create Teacher, Add GradeClassSize, 
    Update and Get the GradeClassSize ".

    Given I am Using SPS GradeClassSize Service to "Update GradeClassSize"
	When I am Calling the Update GradeClassSize Service End Point
	Then I should See the "Updated GradeClassSize to the Profile" in response.

  @original
  Scenario: Delete grade class size using sps GradeClassSize Service 
    As a SPS User I want to delete grade class size using sps GradeClassSize Service  - "Create Teacher, Add GradeClassSize 
    and Delete the GradeClassSize ".

    Given I am Using SPS GradeClassSize Service to "Delete GradeClassSize"
	When I am Calling the Delete GradeClassSize Service End Point
	Then I should See the "Deleted GradeClassSize from the Profile" in response.























	
		

		
