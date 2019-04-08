package com.scholastic.test;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;
import com.scholastic.main.SpsUserConsumerServiceSupportClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinationSpsUserConsumerServicesTest extends SpsUserConsumerServiceSupportClass
{
	public SpsUserConsumerServiceSupportClass supportClass = new SpsUserConsumerServiceSupportClass();
	@Given("^I am Having SPS User Service to (.*)$")
	public void I_am_Having_SPS_User_Service_to_(String x) throws Throwable 
	{
		System.out.println(x);
	}
	
	//injected
	@Given("^sps user services are up and running$")
    public void sps_user_services_are_up_and_running() throws Throwable {
	    System.out.println("Upgrade Consumer To Teacher");
     }
	
	//injected
	 @Given("^I perform \"([^\"]*)\" SPS User Service$")
     public void i_perform_SPS_User_Service(String x) throws Throwable {
	     System.out.println(x);
      }
	
	//injected
	@Given("^User profile information$")
    public void user_profile_information() throws Throwable {
	    System.out.println("Upgrade Consumer To Teacher");
    }
	
	@When("^I am Calling The Service End Point of Create Consumer$")
	public void i_am_Calling_The_Service_End_Point_of_Create_Consumer() throws Throwable
	{
		// Light Consumer Registration
//		ExtractableResponse<Response> createConsumerResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createConsumerPayload();
//								).
//				when()
//						.post(ENDPOINT_CONSUMER_REGISTRATION).
//				then()
//						.statusCode(409)
//						.spec(
								createConsumerResponseValidator();
//								)
//						.extract();		
//
//		consumerSPSID=createConsumerResponse.path("spsId");	
		//System.out.println(consumerSPSID);
					
		// Get Consumer
		/*ExtractableResponse<Response> getConsumerResponse=
				given()
						.pathParam("spsId",consumerSPSID).
				when()
						.get(ENDPOINT_CONSUMER_GET).
				then()
						.statusCode(200)
						.extract();	*/	
		//System.out.println(getConsumerResponse.asString());
	}
	
		// Light Consumer Registration
	@When("^I am Calling The Service End Point of Update Consumer$")
	public void i_am_Calling_The_Service_End_Point_of_Update_Consumer() throws Throwable
	{
//		ExtractableResponse<Response> createConsumerResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createConsumerPayload();
//								).
//				when()
//						.post(ENDPOINT_CONSUMER_REGISTRATION).
//				then()
//						.statusCode(409)
//						.spec(
								createConsumerResponseValidator();
//								)
//						.extract();		
//					
//		consumerSPSID=createConsumerResponse.path("spsId");
		//System.out.println(consumerSPSID);
		
		// Update Consumer 
//		ExtractableResponse<Response> updateConsumerResponse=		
//				given()
//						//.log().all()
//						.pathParam("spsId",consumerSPSID)
//						.contentType("application/json")
//						.body(
								updateConsumerPayload();
//								).
//				when()
//						.put(ENDPOINT_CONSUMER_UPDATE).
//				then()
//						.statusCode(200)
//						.extract();	
				
		// Get Consumer
//		ExtractableResponse<Response> getConsumerResponse=
//				given()
//						.pathParam("spsId",consumerSPSID).
//				when()
//						.get(ENDPOINT_CONSUMER_GET).
//				then()
//						.statusCode(200)
//						.spec(
						createConsumerUpdateResponseValidator();
//						)
//						.extract();		
		//System.out.println(getConsumerResponse.asString());
	}
	
	// Delete Consumer
	@When("^I am Calling The Service End Point of Delete Consumer$")
	public void i_am_Calling_The_Service_End_Point_of_Delete_Consumer() throws Throwable 
	{
//		// Light Consumer Registration
//		ExtractableResponse<Response> createConsumerResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createConsumerPayload();
//								).
//				when()
//						.post(ENDPOINT_CONSUMER_REGISTRATION).
//				then()
//						.statusCode(409)
//						.spec(
								createConsumerResponseValidator();
//								)
//						.extract();		
//
//		consumerSPSID=createConsumerResponse.path("spsId");	
		//System.out.println(consumerSPSID);
					
		// Delete Consumer 
		/*ExtractableResponse<Response> deleteConsumerResponse=
				given()
						.pathParam("spsId",consumerSPSID).
				when()
						.delete(ENDPOINT_CONSUMER_DELETE).
				then()
						.statusCode(200)
						.extract();*/	
		//System.out.println(deleteConsumerResponse.asString());
	}
	
	//injected
	 @When("^The Service End Point of Upgrade Consumer has been issued$")
     public void the_Service_End_Point_of_Upgrade_Consumer_has_been_issued() throws Throwable {
//	  // Light Consumer Registration
//	        ExtractableResponse<Response> createConsumerResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createConsumerPayload();
//	                        		).
//	                when()
//	                        .post(ENDPOINT_CONSUMER_REGISTRATION).
//	                then()
//	                        .statusCode(409)
//	                        .spec(
	                        		createConsumerResponseValidator();
//	                        		)
//	                        .extract();     
//
//	        consumerSPSID=createConsumerResponse.path("spsId"); 
	        //System.out.println(consumerSPSID);
	                    
	        // Delete Consumer 
	        /*ExtractableResponse<Response> deleteConsumerResponse=
	                given()
	                        .pathParam("spsId",consumerSPSID).
	                when()
	                        .delete(ENDPOINT_CONSUMER_DELETE).
	                then()
	                        .statusCode(200)
	                        .extract();*/   
	        //System.out.println(deleteConsumerResponse.asString());
      }
	
	// Upgrade Consumer
	@When("^I am Calling The Service End Point of Upgrade Consumer$")
	public void i_am_Calling_The_Service_End_Point_of_Upgrade_Consumer() throws Throwable 
	{
		// Light Consumer Registration
//		ExtractableResponse<Response> createConsumerResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createConsumerPayload();
//								).
//				when()
//						.post(ENDPOINT_CONSUMER_REGISTRATION).
//				then()
//						.statusCode(409)
//						.spec(
								createConsumerResponseValidator();
//								)
//						.extract();		
						
//		consumerSPSID=createConsumerResponse.path("spsId");
		//System.out.println(consumerSPSID);
				
		// Upgrade Consumer to Teacher
//		ExtractableResponse<Response> upgradeConsumerResponse=
//				given()
//						//.log().all()
//						.pathParam("spsId",consumerSPSID)
//						.contentType("application/json")
//						.body(
								upgradeConsumerToEducatorPayload();
//								).
//				when()
//						.put(ENDPOINT_CONSUMER_UPGRADETEACHER).
//				then()
//						.statusCode(200)
//						.extract();				
				
		//System.out.println("@@@@@"+upgradeConsumerResponse.asString());

		// Get Teacher
//		ExtractableResponse<Response> getTeacherResponse=
//				given()
//						.pathParam("spsId",consumerSPSID).
//				when()
//						.get(ENDPOINT_CONSUMER_GET).
//				then()
//						.statusCode(200)
//						.spec(
								createConsumerUpgradeResponseValidator();
//								)
//						.extract();		
		//System.out.println(getTeacherResponse.asString());
	}
	
	//injected
	 @When("^i am calling sps user upgrade services$")
     public void i_am_calling_sps_user_upgrade_services() throws Throwable {
	  // Light Consumer Registration
//	        ExtractableResponse<Response> createConsumerResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createConsumerPayload();
//	                        		).
//	                when()
//	                        .post(ENDPOINT_CONSUMER_REGISTRATION).
//	                then()
//	                        .statusCode(409)
//	                        .spec(
	                        		createConsumerResponseValidator();
//	                        		)
//	                        .extract();     
//	                        
//	        consumerSPSID=createConsumerResponse.path("spsId");
	        //System.out.println(consumerSPSID);
	                
	        // Upgrade Consumer to Teacher
//	        ExtractableResponse<Response> upgradeConsumerResponse=
//	                given()
//	                        //.log().all()
//	                        .pathParam("spsId",consumerSPSID)
//	                        .contentType("application/json")
//	                        .body(
	                        		upgradeConsumerToEducatorPayload();
//	                        		).
//	                when()
//	                        .put(ENDPOINT_CONSUMER_UPGRADETEACHER).
//	                then()
//	                        .statusCode(200)
//	                        .extract();               
	                
	        //System.out.println("@@@@@"+upgradeConsumerResponse.asString());

	        // Get Teacher
//	        ExtractableResponse<Response> getTeacherResponse=
//	                given()
//	                        .pathParam("spsId",consumerSPSID).
//	                when()
//	                        .get(ENDPOINT_CONSUMER_GET).
//	                then()
//	                        .statusCode(200)
//	                        .spec(
	                        		createConsumerUpgradeResponseValidator();
//	                        		)
//	                        .extract();       
	        //System.out.println(getTeacherResponse.asString());
      }
	
	//inject
	 @When("^I click a link update user profile$")
     public void i_click_a_link_update_user_profile() throws Throwable {
	  // Light Consumer Registration
//	        ExtractableResponse<Response> createConsumerResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createConsumerPayload();
//	                        		).
//	                when()
//	                        .post(ENDPOINT_CONSUMER_REGISTRATION).
//	                then()
//	                        .statusCode(409)
//	                        .spec(
	                        		createConsumerResponseValidator();
//	                        		)
//	                        .extract();     
//	                        
//	        consumerSPSID=createConsumerResponse.path("spsId");
	        //System.out.println(consumerSPSID);
	                
//	        // Upgrade Consumer to Teacher
//	        ExtractableResponse<Response> upgradeConsumerResponse=
//	                given()
//	                        //.log().all()
//	                        .pathParam("spsId",consumerSPSID)
//	                        .contentType("application/json")
//	                        .body(
	                        		upgradeConsumerToEducatorPayload();
//	                        		).
//	                when()
//	                        .put(ENDPOINT_CONSUMER_UPGRADETEACHER).
//	                then()
//	                        .statusCode(200)
//	                        .extract();               
	                
	        //System.out.println("@@@@@"+upgradeConsumerResponse.asString());

	        // Get Teacher
//	        ExtractableResponse<Response> getTeacherResponse=
//	                given()
//	                        .pathParam("spsId",consumerSPSID).
//	                when()
//	                        .get(ENDPOINT_CONSUMER_GET).
//	                then()
//	                        .statusCode(200)
//	                        .spec(
	                        		createConsumerUpgradeResponseValidator();
//	                        		)
//	                        .extract();       
	        //System.out.println(getTeacherResponse.asString());
      }
	
		// Add child to Consumer Profile
	@When("^I am Calling The Service End Point of Add Child$")
	public void i_am_Calling_The_Service_End_Point_of_Add_Child() throws Throwable
	{
		// Light Consumer Registration
//		ExtractableResponse<Response> createConsumerResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createConsumerPayload();
//								).
//				when()
//						.post(ENDPOINT_CONSUMER_REGISTRATION).
//				then()
//						.statusCode(409)
//						.spec(
								createConsumerResponseValidator();
//								)
//						.extract();		
//
//		consumerSPSID=createConsumerResponse.path("spsId");	
		//System.out.println(consumerSPSID);
					
		// Add Child
//		ExtractableResponse<Response> createAddChildResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								addChildPayload();
//								).
//				when()
//						.post(ENDPOINT_CONSUMER_ADDCHILD).
//				then()
//						.statusCode(400)
//						.spec(
								addChildResponseValidator();
//								)
//						.extract();	
//		childSPSID=createAddChildResponse.path("spsId");	
		//System.out.println(childSPSID);
				
		// Get Child
		/*ExtractableResponse<Response> getChildResponse=
				given()
						.pathParam("spsId",childSPSID).
				when()
						.get(ENDPOINT_CONSUMER_GETCHILD).
				then()
						.statusCode(200)
						.extract();	*/	
		//System.out.println(getChildResponse.asString());
	}
	
	@Then("^I should Have (.*) in response.$")
	public void i_Should_have_Consumer_Profile_in_response(String x) throws Throwable 
	{
		System.out.println(x);
	}
	
	//injected
	 @Then("^consumer profile is upgraded to teachers profile$")
     public void consumer_profile_is_upgraded_to_teachers_profile() throws Throwable {

	        System.out.println("Teacher Profile - Upgraded from Consumer");
      }
	
	//injected
	 @Then("^upgrade to \"([^\"]*)\" should occur as result$")
     public void upgrade_to_should_occur_as_result(String x) throws Throwable {
	     System.out.println(x);
      }
	
	//injected
	@Then("^I should receive a message \"([^\"]*)\" after editing user information$")
    public void i_should_receive_a_message_after_editing_user_information(String arg1) throws Throwable {
	    System.out.println("user information updated successfully");
    }
	
}
