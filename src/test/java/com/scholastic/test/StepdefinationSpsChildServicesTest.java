package com.scholastic.test;

import static com.jayway.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

//import org.junit.Test;

//import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;
//import com.jayway.restassured.specification.ResponseSpecification;
import com.scholastic.main.SpsChildServiceSupportClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepdefinationSpsChildServicesTest extends SpsChildServiceSupportClass
{
	public SpsChildServiceSupportClass supportClass=new SpsChildServiceSupportClass();
	@Given("^I am Using SPS Child Service to (.*)$")
	public void i_am_Using_SPS_Child_Service_to(String x) throws Throwable 
	{
	    System.out.println(x);
	}
	
	//injected
	 @Given("^I am required to \"([^\"]*)\" Using SPS Child Service$")
     public void i_am_required_to_Using_SPS_Child_Service(String x) throws Throwable {
	     System.out.println(x);
      }
	
	//injected
	@Given("^I want to \"([^\"]*)\" using SPS child service$")
    public void i_want_to_using_SPS_child_service(String x) throws Throwable {
	    System.out.println(x);
     }
		// ########## Create Teacher and Parent, Add Child and Get Child Info ##########
	@When("^I am Calling the Add Child Service End Point$")
	public void i_am_Calling_the_Add_Child_Service_End_Point() throws Throwable 
	{
//	// Light Teacher Registration
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
//	// Light Parent Registration
//		ExtractableResponse<Response> createParentResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createParentPayload();
								
//								).
//				when()
//						.post(ENDPOINT_PARENT_REGISTRATION).
//				then()
//						.statusCode(409)
//						.spec(
								createParentResponseValidator();
//								)
//						.extract();		
//
//		parentSPSID=createParentResponse.path("spsId");	
//					
//	// Add Child
//		ExtractableResponse<Response> createAddChildResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								addChildPayload();
//								).
//				when()
//						.post(ENDPOINT_ADDCHILD).
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
						.get(ENDPOINT_GET_EDIT_DELETE_CHILD).
				then()
						.statusCode(200)
						.extract();	*/
					
		//System.out.println(">>>>>>>>>> Child Info <<<<<<<<<<");
		//System.out.println(getChildResponse.asString());
		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	//injected
	@When("^I am Executing the Add Child Service End Point$")
    public void i_am_Executing_the_Add_Child_Service_End_Point() throws Throwable {
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
//    // Light Parent Registration
//        ExtractableResponse<Response> createParentResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		createParentPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_PARENT_REGISTRATION).
//                then()
//                        .statusCode(409)
//                        .spec(
                        		createParentResponseValidator();
//                        		)
//                        .extract();     
//
//        parentSPSID=createParentResponse.path("spsId"); 
//                    
//    // Add Child
//        ExtractableResponse<Response> createAddChildResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		addChildPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_ADDCHILD).
//                then()
//                        .statusCode(400)
//                        .spec(
//                        		addChildResponseValidator();
//                        		)
//                        .extract(); 
//        childSPSID=createAddChildResponse.path("spsId");    
        //System.out.println(childSPSID);
                
    // Get Child
        /*ExtractableResponse<Response> getChildResponse=
                given()
                        .pathParam("spsId",childSPSID).
                when()
                        .get(ENDPOINT_GET_EDIT_DELETE_CHILD).
                then()
                        .statusCode(200)
                        .extract(); */
                    
        //System.out.println(">>>>>>>>>> Child Info <<<<<<<<<<");
        //System.out.println(getChildResponse.asString());
        //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
     }
	
	//injected
	@When("^I start the Add Child Service End Point process$")
    public void i_start_the_Add_Child_Service_End_Point_process() throws Throwable {
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
//    // Light Parent Registration
//        ExtractableResponse<Response> createParentResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		createParentPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_PARENT_REGISTRATION).
//                then()
//                        .statusCode(409)
//                        .spec(
                        		createParentResponseValidator();
//                        		)
//                        .extract();     
//
//        parentSPSID=createParentResponse.path("spsId"); 
//                    
//    // Add Child
//        ExtractableResponse<Response> createAddChildResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		addChildPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_ADDCHILD).
//                then()
//                        .statusCode(400)
//                        .spec(
                        		addChildResponseValidator();
//                        		)
//                        .extract(); 
//        childSPSID=createAddChildResponse.path("spsId");    
        //System.out.println(childSPSID);
                
    // Get Child
        /*ExtractableResponse<Response> getChildResponse=
                given()
                        .pathParam("spsId",childSPSID).
                when()
                        .get(ENDPOINT_GET_EDIT_DELETE_CHILD).
                then()
                        .statusCode(200)
                        .extract(); */
                    
        //System.out.println(">>>>>>>>>> Child Info <<<<<<<<<<");
        //System.out.println(getChildResponse.asString());
        //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

	// ##########  Create Teacher and Parent, Add Child then Update and Get Child Info ##########
	@When("^I am Calling the Update Child Service End Point$")
	public void i_am_Calling_the_Update_Child_Service_End_Point() throws Throwable 
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
//		//System.out.println(">>>>>>>>>Teacher's SPSID = " +teacherSPSID);
//							
//	// Light Parent Registration
//		ExtractableResponse<Response> createParentResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createParentPayload();
//								).
//				when()
//						.post(ENDPOINT_PARENT_REGISTRATION).
//				then()
//						.statusCode(409)
//						.spec(
								createParentResponseValidator();
//								)
//						.extract();		
//
//		parentSPSID=createParentResponse.path("spsId");	
//		//System.out.println(">>>>>>>>>Parent's SPSID = " +parentSPSID);
//		//Thread.sleep(4000L);		
//	// Add Child
//		ExtractableResponse<Response> createAddChildResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								addChildPayload();
//								).
//				when()
//						.post(ENDPOINT_ADDCHILD).
//				then()
//						.statusCode(400)
//						.spec(
								addChildResponseValidator();
//								)
//						.extract();	
//		childSPSID=createAddChildResponse.path("spsId");	
		//System.out.println(">>>>>>>>>Child's SPSID = " +childSPSID);
	// Update Child
		/*ExtractableResponse<Response> createEditChildResponse=
				given()
						//.log().all()
						.pathParam("spsId",childSPSID)
						.contentType("application/json")
						.body(updateChildPayload()).
				when()
						.put(ENDPOINT_GET_EDIT_DELETE_CHILD).
				then()
						.statusCode(200)
						.extract();*/	
		//childSPSID=createEditChildResponse.path("spsId");	
		//System.out.println(childSPSID);
						
	// Get Child
		/*ExtractableResponse<Response> getUpdatedChildResponse=
				given()
						.pathParam("spsId",childSPSID).
				when()
						.get(ENDPOINT_GET_EDIT_DELETE_CHILD).
				then()
						.statusCode(200)
						.spec(updateChildResponseValidator())
						.extract();*/	
								
		//System.out.println(">>>>>>>>>>Updated ChildInfo<<<<<<<<<<");
		//System.out.println(getUpdatedChildResponse.asString());
		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");		
	}
	
	// ##########  Create Teacher and Parent, Add Child then Update and Get Child Info ##########
	@When("^I am Calling the Delete Child Service End Point$")
	public void i_am_Calling_the_Delete_Child_Service_End_Point() throws Throwable 
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
//		//System.out.println(">>>>>>>>>Teacher's SPSID = " +teacherSPSID);
//									
//	// Light Parent Registration
//		ExtractableResponse<Response> createParentResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createParentPayload();
//								).
//				when()
//						.post(ENDPOINT_PARENT_REGISTRATION).
//				then()
//						.statusCode(409)
//						.spec(
								createParentResponseValidator();
//								)
//						.extract();		
//
//		parentSPSID=createParentResponse.path("spsId");	
		//System.out.println(">>>>>>>>>Parent's SPSID = " +parentSPSID);
		//Thread.sleep(4000L);		
	// Add Child
//		ExtractableResponse<Response> createAddChildResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								addChildPayload();
								//).
//				when()
//						.post(ENDPOINT_ADDCHILD).
//				then()
//						.statusCode(201)
						addChildResponseValidator();
//						.extract();	
//		childSPSID=createAddChildResponse.path("spsId");*/	
//		//System.out.println(">>>>>>>>>Child's SPSID = " +childSPSID);
//	// Delete Child
//		ExtractableResponse<Response> deleteChildUserResponse=
//				given()
//						.pathParam("spsId",childSPSID).
//				when()
//						.delete(ENDPOINT_GET_EDIT_DELETE_CHILD).
//				then()
//						.statusCode(200)
//						.extract();	*/
//		//childSPSID=createEditChildResponse.path("spsId");	
//		//System.out.println(childSPSID);
//				
//				
//		//System.out.println(">>>>>>>>>>After Deleted Child<<<<<<<<<<");
//		//System.out.println(deleteChildUserResponse.asString());
//		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	@Then("^I should Get the (.*) in response.$")
	public void i_should_Get_the_Added_Child_Info_in_response(String x) throws Throwable 
	{
	    System.out.print(x);
	}
	
	//injected
	 @Then("^the School are replaced by \"([^\"]*)\" in response$")
     public void the_School_are_replaced_by_in_response(String x) throws Throwable {
	     System.out.print(x);
      }
	
	//injected
	@Then("^I have to receive \"([^\"]*)\" as a response$")
    public void i_have_to_receive_as_a_response(String x) throws Throwable {
	    System.out.print(x);
     }
	
	//injected
	 @Then("^I should receive a response of \"([^\"]*)\"$")
     public void i_should_receive_a_response_of(String x) throws Throwable {
	     System.out.print(x);
      }
	
}
