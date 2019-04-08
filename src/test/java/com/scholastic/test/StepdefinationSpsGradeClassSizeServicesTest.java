package com.scholastic.test;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;

import com.scholastic.main.SpsGradeClassSizeServiceSupportClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinationSpsGradeClassSizeServicesTest extends SpsGradeClassSizeServiceSupportClass
{
	public SpsGradeClassSizeServiceSupportClass supportClass=new SpsGradeClassSizeServiceSupportClass();
	
	@Given("^I am Using SPS GradeClassSize Service to (.*)$")
	public void i_am_Using_SPS_GradeClassSize_Service_to(String x) throws Throwable 
	{
	    System.out.println(x);
	}
	
	//injected
	 @Given("^I have to \"([^\"]*)\" via SPS GradeClassSize Service$")
     public void i_have_to_via_SPS_GradeClassSize_Service(String x) throws Throwable {
	     System.out.println(x);
     }
	
	//injected
	@Given("^GradeClassSize is added using SPS GradeClassSize Service$")
    public void gradeclasssize_is_added_using_SPS_GradeClassSize_Service() throws Throwable {
	    System.out.println("Add GradeClassSize");
    }
	
			// ########## Crate GradeClassSize and Get the GradeClassSize ##########
	
	@When("^I am Calling the Add GradeClassSize Service End Point$")
	public void i_am_Calling_the_Add_GradeClassSize_Service_End_Point() throws Throwable 
	{
		// Light Teacher Registration
////		ExtractableResponse<Response> createTeacherResponse=
////				given()
////						//.log().all()
////						.contentType("application/json")
//						.body(
								createTeacherPayload();
//						).
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
//		// Create GradeClassSize
//		ExtractableResponse<Response> createGradeClassSizeResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createGradeClassSizePayload();
//								).
//				when()
//						.post(ENDPOINT_CREATE_GRADECLASSSIZE).
//				then()
//						.statusCode(200)
//						.spec(
								createGradeClassSizeResponseValidator();
//								)
//						.extract();
//		gradeclasssizeSPSID=createGradeClassSizeResponse.path("spsId");	
		
		//System.out.println("gradeclasssizeSPSID is: "+gradeclasssizeSPSID);
					
		//System.out.println(createGradeClassSizeResponse.asString());
					
		// Get GradeClassSize 
		//ExtractableResponse<Response> getGradeClassSizeResponse=
//				given()
//						.pathParam("spsId",gradeclasssizeSPSID).
//				when()
//						.get(ENDPOINT_GET_UPDATE_DELETE_GRADECLASSSIZE).
//				then()
//						.statusCode(200)
//						.extract();	
				
		//System.out.println("********** Grade Class Size Info **********");
		//System.out.println(getGradeClassSizeResponse.asString());
		//System.out.println("********************************************");
	}
	
	//injected
	@When("^I am Executing the Grade Class Size Service End Point$")
    public void i_am_Executing_the_Grade_Class_Size_Service_End_Point() throws Throwable {
//	 // Light Teacher Registration
//        ExtractableResponse<Response> createTeacherResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		createTeacherPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_TEACHER_REGISTRATION).
//                then()
//                        .statusCode(201)
//                        .spec(
                        		createTeacherResponseValidator();
//                        		)
//                        .extract();     
//                    
//        teacherSPSID=createTeacherResponse.path("spsId");   
//        //System.out.println(teacherSPSID);
//                                
//        // Create GradeClassSize
//        ExtractableResponse<Response> createGradeClassSizeResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		createGradeClassSizePayload();
//                        		).
//                when()
//                        .post(ENDPOINT_CREATE_GRADECLASSSIZE).
//                then()
//                        .statusCode(200)
//                        .spec(
                        		createGradeClassSizeResponseValidator();
//                        		)
//                        .extract();
//        gradeclasssizeSPSID=createGradeClassSizeResponse.path("spsId"); 
//        
//        //System.out.println("gradeclasssizeSPSID is: "+gradeclasssizeSPSID);
//                    
//        //System.out.println(createGradeClassSizeResponse.asString());
//                    
//        // Get GradeClassSize 
//        //ExtractableResponse<Response> getGradeClassSizeResponse=
//                given()
//                        .pathParam("spsId",gradeclasssizeSPSID).
//                when()
//                        .get(ENDPOINT_GET_UPDATE_DELETE_GRADECLASSSIZE).
//                then()
//                        .statusCode(200)
//                        .extract(); 
                
        //System.out.println("********** Grade Class Size Info **********");
        //System.out.println(getGradeClassSizeResponse.asString());
        //System.out.println("********************************************");
     }
	
	//injected
	@When("^I trigger Add GradeClassSize Service End Point$")
    public void i_trigger_Add_GradeClassSize_Service_End_Point() throws Throwable {
	 // Light Teacher Registration
//        ExtractableResponse<Response> createTeacherResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		createTeacherPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_TEACHER_REGISTRATION).
//                then()
//                        .statusCode(201)
//                        .spec(
                        		createTeacherResponseValidator();
//                        		)
//                        .extract();     
//                    
//        teacherSPSID=createTeacherResponse.path("spsId");   
//        //System.out.println(teacherSPSID);
//                                
//        // Create GradeClassSize
//        ExtractableResponse<Response> createGradeClassSizeResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		createGradeClassSizePayload();
//                        		).
//                when()
//                        .post(ENDPOINT_CREATE_GRADECLASSSIZE).
//                then()
//                        .statusCode(200)
//                        .spec(
                        		createGradeClassSizeResponseValidator();
//                        		)
//                        .extract();
//        gradeclasssizeSPSID=createGradeClassSizeResponse.path("spsId"); 
//        
//        //System.out.println("gradeclasssizeSPSID is: "+gradeclasssizeSPSID);
//                    
//        //System.out.println(createGradeClassSizeResponse.asString());
//                    
//        // Get GradeClassSize 
//        //ExtractableResponse<Response> getGradeClassSizeResponse=
//                given()
//                        .pathParam("spsId",gradeclasssizeSPSID).
//                when()
//                        .get(ENDPOINT_GET_UPDATE_DELETE_GRADECLASSSIZE).
//                then()
//                        .statusCode(200)
//                        .extract(); 
                
        //System.out.println("********** Grade Class Size Info **********");
        //System.out.println(getGradeClassSizeResponse.asString());
        //System.out.println("********************************************");
   }
	
	// ########## Update GradeClassSize and Get the GradeClassSize ##########
	@When("^I am Calling the Update GradeClassSize Service End Point$")
	public void i_am_Calling_the_Update_GradeClassSize_Service_End_Point() throws Throwable 
	{
		// Light Teacher Registration
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
//		// Create GradeClassSize
//		ExtractableResponse<Response> createGradeClassSizeResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createGradeClassSizePayload();
//								).
//				when()
//						.post(ENDPOINT_CREATE_GRADECLASSSIZE).
//				then()
//						.statusCode(200)
//						.spec(
								createGradeClassSizeResponseValidator();
//								)
//						.extract();
//		gradeclasssizeSPSID=createGradeClassSizeResponse.path("spsId");	
		//System.out.println("gradeclasssizeSPSID is: "+gradeclasssizeSPSID);
					
//		// Update GradeClassSize
//		ExtractableResponse<Response> updateGradeClassSizeResponse=
//				given()
//						//.log().all()
//						.pathParam("spsId",gradeclasssizeSPSID)
//						.contentType("application/json")
//						.body(
								updateGradeClassSizePayload();
//								).
//				when()
//						.put(ENDPOINT_GET_UPDATE_DELETE_GRADECLASSSIZE).
//				then()
//						.statusCode(200)
//						.spec(
								updateGradeClassSizeResponseValidator();
//								)
//						.extract();
//		gradeclasssizeSPSID=updateGradeClassSizeResponse.path("spsId");	
//		//System.out.println("gradeclasssizeSPSID is: "+gradeclasssizeSPSID);	
//			
//		// Get GradeClassSize 
//		//ExtractableResponse<Response> getUpdatedGradeClassSizeResponse=
//				given()
//						.pathParam("spsId",gradeclasssizeSPSID).
//				when()
//						.get(ENDPOINT_GET_UPDATE_DELETE_GRADECLASSSIZE).
//				then()
//						.statusCode(200)
//						.extract();	
		//System.out.println("********** Updated Grade Class Size Info **********");
		//System.out.println(getUpdatedGradeClassSizeResponse.asString());
		//System.out.println("***************************************************");
			
		//System.out.println("********** Grade Class Size Info **********");
		//System.out.println(createGradeClassSizeResponse.asString());
		//System.out.println("***************************************************");
	}

	// ########## Delete GradeClassSize and Get the GradeClassSize ##########
	
	@When("^I am Calling the Delete GradeClassSize Service End Point$")
	public void i_am_Calling_the_Delete_GradeClassSize_Service_End_Point() throws Throwable 
	{
		// Light Teacher Registration
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
//		
//		//System.out.println(teacherSPSID);
//							
//		// Create GradeClassSize
//		ExtractableResponse<Response> createGradeClassSizeResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createGradeClassSizePayload();
//								).
//				when()
//						.post(ENDPOINT_CREATE_GRADECLASSSIZE).
//				then()
//						.statusCode(200)
//						.spec(
								createGradeClassSizeResponseValidator();
//								)
//						.extract();
//		gradeclasssizeSPSID=createGradeClassSizeResponse.path("spsId");	
//		//System.out.println("gradeclasssizeSPSID is: "+gradeclasssizeSPSID);
//						
//		// Delete GradeClassSize
//		//ExtractableResponse<Response> deleteGradeClassSizeResponse=
//				given()
//						//'.log().all()
//						.pathParam("spsId",gradeclasssizeSPSID)
//						.contentType("application/json").
//				when()
//						.delete(ENDPOINT_GET_UPDATE_DELETE_GRADECLASSSIZE).
//				then()
//						.statusCode(200)
//						//.spec(
						updateGradeClassSizeResponseValidator();
//				)
//						.extract();
						
		//System.out.println("********** Deleted Grade Class Size ***************");
		//System.out.println(deleteGradeClassSizeResponse.asString());
		//System.out.println("***************************************************");
	}
	
	@Then("^I should See the (.*) in response.$")
	public void i_should_See_the_Added_GradeClassSize_to_the_Profile_in_response(String x) throws Throwable 
	{
	    System.out.print(x);
	}
	
	//injected
	 @Then("^I receive the confirmation message$")
     public void i_receive_the_confirmation_message() throws Throwable {
	     System.out.print("Added GradeClassSize to the Profile");
     }
	
	//injected
	 @Then("^GradeClassSize is added to the profile$")
     public void gradeclasssize_is_added_to_the_profile() throws Throwable {
      }
	
}

