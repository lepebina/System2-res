package com.scholastic.test;

import static com.jayway.restassured.RestAssured.given;
import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;
import com.scholastic.main.SpsUserTeacherServiceSupportClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class StepdefinationSpsUserTeacherServicesTest extends SpsUserTeacherServiceSupportClass
{
	public SpsUserTeacherServiceSupportClass supportClass= new SpsUserTeacherServiceSupportClass();
	
	@Given("^I am Using SPS User Service to (.*)$")
	public void I_am_Using_SPS_User_Service_to_(String x) throws Throwable 
	{
			System.out.println(x);
	}

	@When("^I am Calling The Create Teacher Service End Point$")
	public void I_am_Calling_The_Create_Teacher_Service_End_Point() throws Throwable 
	{
//		ExtractableResponse<Response> createTeacherResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createTeacherPayload();
//								).
//				when()
//						.post(ENDPOINT_TEACHER_REGISTRATION).
//				then()
//						.statusCode(201)
//						.spec(
								createTeacherResponseValidator();
//								)
//						.extract();		


////		teacherSPSID=createTeacherResponse.path("spsId");
////		userName=createTeacherResponse.path("email");	
////		//System.out.println(teacherSPSID);
//			
//		// Get Teacher 
//		//ExtractableResponse<Response> getTeacherResponse=
//				given()
//						.pathParam("spsId",teacherSPSID).
//				when()
//						.get(ENDPOINT_TEACHER_GET).
//				then()
//						.statusCode(200)
//						.extract();		
	//System.out.println(getTeacherResponse.asString());
	}
		
	@When("^I am Calling The Update Teacher Service End Point$")
	public void I_am_Calling_The_Update_Teacher_Service_End_Point() throws Throwable
	{
//		ExtractableResponse<Response> createTeacherResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createTeacherPayload();
//								).
//				when()
//						.post(ENDPOINT_TEACHER_REGISTRATION).
//				then()
//						.statusCode(201)
//						.spec(
								createTeacherResponseValidator();
//								)
//						.extract();		
//				
//		teacherSPSID=createTeacherResponse.path("spsId");
		//System.out.println(teacherSPSID);
		
		// Update Teacher 
			
//			given()
//					//.log().all()
//					.pathParam("spsId",teacherSPSID)
//					.contentType("application/json")
//					.body(
							updateTeacherPayload();
//							).
//			when()
//					.put(ENDPOINT_TEACHER_UPDATE).
//			then()
//					.statusCode(409)
//					.extract();	
//			
//		teacherSPSID=createTeacherResponse.path("spsId");
//		//System.out.println(teacherSPSID);
//
//		// Get Teacher
//		//ExtractableResponse<Response> getTeacherResponse=
//				given()
//						.pathParam("spsId",teacherSPSID).
//				when()
//						.get(ENDPOINT_TEACHER_GET).
//				then()
//						.statusCode(200)
//						.spec(
								createTeacherUpdateResponseValidator();
//								)
//						.extract();		
		//System.out.println(getTeacherResponse.asString());
	}
		
				
	@When("^I am Calling The Delete Teacher Service End Point$")
	public void I_am_Calling_The_Delete_Teacher_Service_End_Point() throws Throwable
	{
//		// Light Teacher Registration
//		ExtractableResponse<Response> createTeacherResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createTeacherPayload();
//								).
//				when()
//						.post(ENDPOINT_TEACHER_REGISTRATION).
//				then()
//						.statusCode(201)
//						.spec(
								createTeacherResponseValidator();
//								)
//						.extract();		
//
//		teacherSPSID=createTeacherResponse.path("spsId");	
//		//System.out.println(teacherSPSID);
//						
//				
//		// Delete Teacher 
//		//ExtractableResponse<Response> deleteTeacherResponse=
//				given()
//						.pathParam("spsId",teacherSPSID).
//				when()
//						.delete(ENDPOINT_TEACHER_DELETE).
//				then()
//						.statusCode(200)
//						.extract();		
		//System.out.println(deleteTeacherResponse.asString());
	}
		
	@Then("^Should Display (.*) in response.$")
	public void Should_Display_Teacher_Profile_in_response(String x) throws Throwable 
	{
		System.out.println(x);
	}	
		
	
}
	
	


