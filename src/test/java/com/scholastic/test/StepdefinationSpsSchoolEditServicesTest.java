package com.scholastic.test;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;
import com.scholastic.main.SpsSchoolEditServiceSupportClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepdefinationSpsSchoolEditServicesTest extends SpsSchoolEditServiceSupportClass
{
	public SpsSchoolEditServiceSupportClass supportClass = new SpsSchoolEditServiceSupportClass(); 	
	@Given("^I am Using SPS Edit School Service to Change from US Domestic School to (.*)$")
	public void i_am_Using_SPS_Edit_School_Service_to_Change_from_US_Domestic_School_to(String x) throws Throwable 
	{
		System.out.println(x);
	}
	
	//injected
	 @Given("^School profile information$")
     public void school_profile_information() throws Throwable {
	     System.out.println("Existing International School");
     }
	
	//injected
	@Given("^US Domestic Schools are replaced by \"([^\"]*)\" by utilizing SPS Edit School Service$")
    public void us_Domestic_Schools_are_replaced_by_by_utilizing_SPS_Edit_School_Service(String x) throws Throwable {
	    System.out.println(x);
     }
	
	//injected-both 3
	 @Given("^sps school edit services are up and running$")
     public void sps_school_edit_services_are_up_and_running() throws Throwable {
     }
    
	 @Given("^I am authentic user to change information in database$")
     public void i_am_authentic_user_to_change_information_in_database() throws Throwable {
	     System.out.println("Existing International School");
      }
     
     @Given("^I am allowed to view school information in database$")
     public void i_am_allowed_to_view_school_information_in_database() throws Throwable {
      }
	
	//injection
	@Given("^I want to change US domestic school to \"([^\"]*)\" by the use of SPS school service editor$")
    public void i_want_to_change_US_domestic_school_to_by_the_use_of_SPS_school_service_editor(String x) throws Throwable {
	    System.out.println(x);
    }
	
	//injected
	 @Given("^that SPS Edit School Service is used to Change from US Domestic School to \"([^\"]*)\"$")
     public void that_SPS_Edit_School_Service_is_used_to_Change_from_US_Domestic_School_to(String x) throws Throwable {
	     System.out.println(x);
      }
	 

	@When("^I am Calling the Edit Domestic To International School Service End Point$")
	public void i_am_Calling_the_Edit_Domestic_To_International_School_Service_End_Point() throws Throwable 
	{
	    // ##########  Edit School-option 1 international Existing Schools ##########
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
//		teacherSPSID=createTeacherResponse.path("spsId");
//		user=createTeacherResponse.path("userName");
		//System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
		//System.out.println(">>>>>>>User Name is: "+user);
		
		//Thread.sleep(6000L);
		
		//Authentication
//		ExtractableResponse<Response> createLogInResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//		                .body(
		                		createLogInPayload();
//		                		).
//				when()
//						.post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//				then()
//						.statusCode(200)
//						.extract();	
		/*sps_session=createLogInResponse.path("SPS_SESSION.value");
		sps_tsp=createLogInResponse.path("SPS_TSP.value");
		//System.out.println(createLogInResponse.path("SPS_UD.value"));
		userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
		
		//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
		//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
		//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
		
		//Change School to Existing International School
		
//		
//				given()
//						//.log().all()
//						.pathParam("spsId",userSPSID)
//						.cookies("SPS_SESSION",sps_session)
//						.cookie("SPS_TSP",sps_tsp)
//						.contentType("application/json")
//						.body(
								changedToInternationalSchoolPayload();
//								).
//				when()
//						.put(ENDPOINT_CHANGE_SCHOOL).
//				then()
//						.statusCode(200)
//						.extract();
//		teacherSPSID=changedToInternationalSchoolResponse.path("spsId");
		
		//System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
		// Get School Info after change school
		// ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
//		 				given()
//		 						//.log().all()
//		 						.pathParam("spsId",teacherSPSID)
//		 						.contentType("application/json").
//		 				when()
//		 						.get(ENDPOINT_GET_SCHOOL).
//		 				then()
//		 						.statusCode(200)
//		 						.spec(
		 								changedToInternationalSchoolResponseValidator();
//		 								)
//								.extract();		
		//System.out.println("******************** Teacher's Initial Registerd School Was **********************");
		//System.out.println(createTeacherResponse.asString());
		//System.out.println("**********************************************************************************");
		
		//System.out.println("******************** Changed To International School is **************************");
		//System.out.println(afterChangedSchoolGetInfoResponse.asString());
		//System.out.println("**********************************************************************************");
	}
	
	//injected
	 @When("^I am selecting modify link in the main menu of school profile$")
     public void i_am_selecting_modify_link_in_the_main_menu_of_school_profile() throws Throwable {
//	     // ##########  Edit School-option 1 international Existing Schools ##########
//	        ExtractableResponse<Response> createTeacherResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createTeacherPayload();
//	                        		).
//	                when()
//	                        .post(ENDPOINT_TEACHER_REGISTRATION).
//	                then()
//	                        .statusCode(201)
//	                        .spec(
	                        		createTeacherResponseValidator();
//	                        		)
//	                        .extract();     
//	        teacherSPSID=createTeacherResponse.path("spsId");
//	        user=createTeacherResponse.path("userName");
	        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
	        //System.out.println(">>>>>>>User Name is: "+user);
	        
	        //Thread.sleep(6000L);
	        
	        //Authentication
//	        ExtractableResponse<Response> createLogInResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createLogInPayload();
//	                        		).
//	                when()
//	                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//	                then()
//	                        .statusCode(200)
//	                        .extract(); 
//	        sps_session=createLogInResponse.path("SPS_SESSION.value");
//	        sps_tsp=createLogInResponse.path("SPS_TSP.value");
//	        //System.out.println(createLogInResponse.path("SPS_UD.value"));
//	        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
//	        
//	        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
//	        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
//	        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
//	        
//	        //Change School to Existing International School
//	        
//	        
//	                given()
//	                        //.log().all()
//	                        .pathParam("spsId",userSPSID)
//	                        .cookies("SPS_SESSION",sps_session)
//	                        .cookie("SPS_TSP",sps_tsp)
//	                        .contentType("application/json")
//	                        .body(
	                        		changedToInternationalSchoolPayload();
//	                        		).
//	                when()
//	                        .put(ENDPOINT_CHANGE_SCHOOL).
//	                then()
//	                        .statusCode(200)
//	                        .extract();
//	        teacherSPSID=changedToInternationalSchoolResponse.path("spsId");
//	        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
//	        // Get School Info after change school
//	        // ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
//	                        given()
//	                                //.log().all()
//	                                .pathParam("spsId",teacherSPSID)
//	                                .contentType("application/json").
//	                        when()
//	                                .get(ENDPOINT_GET_SCHOOL).
//	                        then()
//	                                .statusCode(200)
//	                                .spec(
	                                		changedToInternationalSchoolResponseValidator();
//	                                		)
//	                                .extract();     
	        //System.out.println("******************** Teacher's Initial Registerd School Was **********************");
	        //System.out.println(createTeacherResponse.asString());
	        //System.out.println("**********************************************************************************");
	        
	        //System.out.println("******************** Changed To International School is **************************");
	        //System.out.println(afterChangedSchoolGetInfoResponse.asString());
	        //System.out.println("**********************************************************************************");
      }
	
	//injected
	 @When("^I query school database using sps edit school service$")
     public void i_query_school_database_using_sps_edit_school_service() throws Throwable {
//	     // ##########  Edit School-option 1 international Existing Schools ##########
//	        ExtractableResponse<Response> createTeacherResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createTeacherPayload();
//	                        		).
//	                when()
//	                        .post(ENDPOINT_TEACHER_REGISTRATION).
//	                then()
//	                        .statusCode(201)
//	                        .spec(
	                        		createTeacherResponseValidator();
//	                        		)
//	                        .extract();     
//	        teacherSPSID=createTeacherResponse.path("spsId");
//	        user=createTeacherResponse.path("userName");
	        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
	        //System.out.println(">>>>>>>User Name is: "+user);
	        
	       // Thread.sleep(6000L);
	        
//	        //Authentication
//	        ExtractableResponse<Response> createLogInResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createLogInPayload();
//	                        		).
//	                when()
//	                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//	                then()
//	                        .statusCode(200)
//	                        .extract(); 
	        /*sps_session=createLogInResponse.path("SPS_SESSION.value");
	        sps_tsp=createLogInResponse.path("SPS_TSP.value");
	        //System.out.println(createLogInResponse.path("SPS_UD.value"));
	        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
	        
	        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
	        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
	        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
	        
	        //Change School to Existing International School
	        
//	       ExtractableResponse<Response> changedToInternationalSchoolResponse=
//	                given()
//	                        //.log().all()
//	                        .pathParam("spsId",userSPSID)
//	                        .cookies("SPS_SESSION",sps_session)
//	                        .cookie("SPS_TSP",sps_tsp)
//	                        .contentType("application/json")
//	                        .body(
	                        		changedToInternationalSchoolPayload();
//	                        		).
//	                when()
//	                        .put(ENDPOINT_CHANGE_SCHOOL).
//	                then()
//	                        .statusCode(200)
//	                        .extract();
//	        teacherSPSID=changedToInternationalSchoolResponse.path("spsId");
	        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
	        // Get School Info after change school
	        // ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
//	                        given()
//	                                //.log().all()
//	                                .pathParam("spsId",teacherSPSID)
//	                                .contentType("application/json").
//	                        when()
//	                                .get(ENDPOINT_GET_SCHOOL).
//	                        then()
//	                                .statusCode(200)
//	                                .spec(
	                                		changedToInternationalSchoolResponseValidator();
//	                                		)
//	                                .extract();     
	        //System.out.println("******************** Teacher's Initial Registerd School Was **********************");
	        //System.out.println(createTeacherResponse.asString());
	        //System.out.println("**********************************************************************************");
	        
	        //System.out.println("******************** Changed To International School is **************************");
	        //System.out.println(afterChangedSchoolGetInfoResponse.asString());
	        //System.out.println("**********************************************************************************");
     }
	

    //injected
    @When("^Edit Domestic To International School Service End Point  called$")
    public void edit_Domestic_To_International_School_Service_End_Point_called() throws Throwable {
     // ##########  Edit School-option 1 international Existing Schools ##########
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
//        teacherSPSID=createTeacherResponse.path("spsId");
//        user=createTeacherResponse.path("userName");
        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
        //System.out.println(">>>>>>>User Name is: "+user);
        
        //Thread.sleep(6000L);
        
        //Authentication
//        ExtractableResponse<Response> createLogInResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		createLogInPayload();
//                        		).
//                when()
//                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//                then()
//                        .statusCode(200)
//                        .extract(); 
        /*sps_session=createLogInResponse.path("SPS_SESSION.value");
        sps_tsp=createLogInResponse.path("SPS_TSP.value");
        //System.out.println(createLogInResponse.path("SPS_UD.value"));
        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
        
        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
        
        //Change School to Existing International School
        
//        ExtractableResponse<Response> changedToInternationalSchoolResponse=
//                given()
//                        //.log().all()
//                        .pathParam("spsId",userSPSID)
//                        .cookies("SPS_SESSION",sps_session)
//                        .cookie("SPS_TSP",sps_tsp)
//                        .contentType("application/json")
//                        .body(
                        		changedToInternationalSchoolPayload();
//                        		).
//                when()
//                        .put(ENDPOINT_CHANGE_SCHOOL).
//                then()
//                        .statusCode(200)
//                        .extract();
//        teacherSPSID=changedToInternationalSchoolResponse.path("spsId");
        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
        // Get School Info after change school
        // ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
//                        given()
//                                //.log().all()
//                                .pathParam("spsId",teacherSPSID)
//                                .contentType("application/json").
//                        when()
//                                .get(ENDPOINT_GET_SCHOOL).
//                        then()
//                                .statusCode(200)
//                                .spec(
                                		changedToInternationalSchoolResponseValidator();
//                                		)
//                                .extract();     
        //System.out.println("******************** Teacher's Initial Registerd School Was **********************");
        //System.out.println(createTeacherResponse.asString());
        //System.out.println("**********************************************************************************");
        
        //System.out.println("******************** Changed To International School is **************************");
        //System.out.println(afterChangedSchoolGetInfoResponse.asString());
        //System.out.println("**********************************************************************************");
     }
		// ########## Service to edit school - (option 1) for homeschooler. ##########
	@When("^I am Calling the Edit Domestic To Home School Service End Point$")
	public void i_am_Calling_the_Edit_Domestic_To_Home_School_Service_End_Point() throws Throwable
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
//		teacherSPSID=createTeacherResponse.path("spsId");
//		user=createTeacherResponse.path("userName");
//		//System.out.println(">>>>>>User SPSID is: "+teacherSPSID);
//		//System.out.println(">>>>>>>User Name is: "+user);
//		
//		//Create Home School
//		ExtractableResponse<Response> createHomeSchoolResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createHomeSchoolPayload();
//								).
//				when()
//						.post(ENDPOINT_CREATE_SCHOOL).
//				then()
//						.statusCode(201)
//						.spec(
								createHomeSchoolResponseValidator();
//								)
//						 .extract();	
//		h_schoolSPSID=createHomeSchoolResponse.path("spsId");
//		//System.out.println(createHomeSchoolResponse.asString());
//		//System.out.println(">>>>>>Home School SPSID is: "+h_schoolSPSID);
//		
//		//Thread.sleep(6000L);
//		//Authentication
//		ExtractableResponse<Response> createLogInResponse=
//				given()
//						.contentType("application/json")
//		                .body(
		                		createLogInPayload();
//		                		).
//				when()
//						.post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//				then()
//						.statusCode(200)
//						.extract();	
		
		/*sps_session=createLogInResponse.path("SPS_SESSION.value");
		sps_tsp=createLogInResponse.path("SPS_TSP.value");
		//System.out.println(createLogInResponse.path("SPS_UD.value"));
		userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
		
		//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
		//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
		//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);	
		
		//Change School to Home School
//		
//		ExtractableResponse<Response> changedToHomeSchoolResponse=
//				given()
//						//.log().all()
//						.pathParam("spsId",userSPSID)
//						.cookies("SPS_SESSION",sps_session)
//						.cookie("SPS_TSP",sps_tsp)
//						.contentType("application/json")
//						.body(
								changedToHomeSchoolPayload();
//								).
//				when()
//						.put(ENDPOINT_CHANGE_SCHOOL).
//				then()
//						.statusCode(200)
//						.extract();
//		userSPSID=changedToHomeSchoolResponse.path("spsId");	
//		//System.out.println("User SPSID is: "+userSPSID);
//		// Get School Info after change school
//		//ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
//				 given()
//				 		//.log().all()
//				 		.pathParam("spsId",teacherSPSID)
//				 		.contentType("application/json").
//				 when()
//				 		.get(ENDPOINT_GET_SCHOOL).
//				 then()
//				 		.statusCode(200)
//				 		.spec(
				 				changedToHomeSchoolResponseValidator();
//				 				)
//						.extract();		
		//System.out.println("******************** Teacher's Initial Registerd School Was *********************");
		//System.out.println(createTeacherResponse.asString());
		//System.out.println("**********************************************************************************");
				
		//System.out.println("******************** Changed To Home School is ***********************************");
		//System.out.println(afterChangedSchoolGetInfoResponse.asString());
		//System.out.println("**********************************************************************************");
	}
	
	//injected
	@When("^the Edit Domestic To Home School Service End Point is invoked$")
    public void the_Edit_Domestic_To_Home_School_Service_End_Point_is_invoked() throws Throwable {
//	    ExtractableResponse<Response> createTeacherResponse=
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
//        teacherSPSID=createTeacherResponse.path("spsId");
//        user=createTeacherResponse.path("userName");
//        //System.out.println(">>>>>>User SPSID is: "+teacherSPSID);
//        //System.out.println(">>>>>>>User Name is: "+user);
//        
//        //Create Home School
//        ExtractableResponse<Response> createHomeSchoolResponse=
//                given()
//                        //.log().all()
//                        .contentType("application/json")
//                        .body(
                        		createHomeSchoolPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_CREATE_SCHOOL).
//                then()
//                        .statusCode(201)
//                        .spec(
                        		createHomeSchoolResponseValidator();
//                        		)
//                         .extract();    
//        h_schoolSPSID=createHomeSchoolResponse.path("spsId");
//        //System.out.println(createHomeSchoolResponse.asString());
//        //System.out.println(">>>>>>Home School SPSID is: "+h_schoolSPSID);
//        
//        //Thread.sleep(6000L);
//        //Authentication
//        ExtractableResponse<Response> createLogInResponse=
//                given()
//                        .contentType("application/json")
//                        .body(
                        		createLogInPayload();
//                        		).
//                when()
//                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//                then()
//                        .statusCode(200)
//                        .extract(); 
        
        /*sps_session=createLogInResponse.path("SPS_SESSION.value");
        sps_tsp=createLogInResponse.path("SPS_TSP.value");
        //System.out.println(createLogInResponse.path("SPS_UD.value"));
        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
        
        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID); 
        
        //Change School to Home School
//        
//        ExtractableResponse<Response> changedToHomeSchoolResponse=
//                given()
//                        //.log().all()
//                        .pathParam("spsId",userSPSID)
//                        .cookies("SPS_SESSION",sps_session)
//                        .cookie("SPS_TSP",sps_tsp)
//                        .contentType("application/json")
//                        .body(
                        		changedToHomeSchoolPayload();
//                        		).
//                when()
//                        .put(ENDPOINT_CHANGE_SCHOOL).
//                then()
//                        .statusCode(200)
//                        .extract();
//        userSPSID=changedToHomeSchoolResponse.path("spsId"); 
//        //System.out.println("User SPSID is: "+userSPSID);
//        // Get School Info after change school
//        //ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
//                 given()
//                        //.log().all()
//                        .pathParam("spsId",teacherSPSID)
//                        .contentType("application/json").
//                 when()
//                        .get(ENDPOINT_GET_SCHOOL).
//                 then()
//                        .statusCode(200)
//                        .spec(
                        		changedToHomeSchoolResponseValidator();
//                        		)
//                        .extract();     
        //System.out.println("******************** Teacher's Initial Registerd School Was *********************");
        //System.out.println(createTeacherResponse.asString());
        //System.out.println("**********************************************************************************");
                
        //System.out.println("******************** Changed To Home School is ***********************************");
        //System.out.println(afterChangedSchoolGetInfoResponse.asString());
        //System.out.println("**********************************************************************************");
     }
	
	//injected
	 @When("^I initiate the Edit Domestic to Home School Service End Point$")
     public void i_initiate_the_Edit_Domestic_to_Home_School_Service_End_Point() throws Throwable {
//	     ExtractableResponse<Response> createTeacherResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createTeacherPayload();
//	                        		).
//	                when()
//	                        .post(ENDPOINT_TEACHER_REGISTRATION).
//	                then()
//	                        .statusCode(201)
//	                        .spec(
	                        		createTeacherResponseValidator();
//	                        		)
//	                        .extract();     
//	        teacherSPSID=createTeacherResponse.path("spsId");
//	        user=createTeacherResponse.path("userName");
//	        //System.out.println(">>>>>>User SPSID is: "+teacherSPSID);
//	        //System.out.println(">>>>>>>User Name is: "+user);
//	        
//	        //Create Home School
//	        ExtractableResponse<Response> createHomeSchoolResponse=
//	                given()
//	                        //.log().all()
//	                        .contentType("application/json")
//	                        .body(
	                        		createHomeSchoolPayload();
//	                        		).
//	                when()
//	                        .post(ENDPOINT_CREATE_SCHOOL).
//	                then()
//	                        .statusCode(201)
//	                        .spec(
	                        		createHomeSchoolResponseValidator();
//	                        		)
//	                         .extract();    
//	        h_schoolSPSID=createHomeSchoolResponse.path("spsId");
//	        //System.out.println(createHomeSchoolResponse.asString());
//	        //System.out.println(">>>>>>Home School SPSID is: "+h_schoolSPSID);
//	        
//	        //Thread.sleep(6000L);
//	        //Authentication
//	        ExtractableResponse<Response> createLogInResponse=
//	                given()
//	                        .contentType("application/json")
//	                        .body(
	                        		createLogInPayload();
//	                        		).
//	                when()
//	                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//	                then()
//	                        .statusCode(200)
//	                        .extract(); 
	        
	        /*sps_session=createLogInResponse.path("SPS_SESSION.value");
	        sps_tsp=createLogInResponse.path("SPS_TSP.value");
	        //System.out.println(createLogInResponse.path("SPS_UD.value"));
	        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
	        
	        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
	        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
	        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID); 
	        
	        //Change School to Home School
//	        
//	        ExtractableResponse<Response> changedToHomeSchoolResponse=
//	                given()
//	                        //.log().all()
//	                        .pathParam("spsId",userSPSID)
//	                        .cookies("SPS_SESSION",sps_session)
//	                        .cookie("SPS_TSP",sps_tsp)
//	                        .contentType("application/json")
//	                        .body(
	                        		changedToHomeSchoolPayload();
//	                        		).
//	                when()
//	                        .put(ENDPOINT_CHANGE_SCHOOL).
//	                then()
//	                        .statusCode(200)
//	                        .extract();
//	        userSPSID=changedToHomeSchoolResponse.path("spsId"); 
//	        //System.out.println("User SPSID is: "+userSPSID);
//	        // Get School Info after change school
//	        //ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
//	                 given()
//	                        //.log().all()
//	                        .pathParam("spsId",teacherSPSID)
//	                        .contentType("application/json").
//	                 when()
//	                        .get(ENDPOINT_GET_SCHOOL).
//	                 then()
//	                        .statusCode(200)
//	                        .spec(
	                        		changedToHomeSchoolResponseValidator();
//	                        		)
//	                        .extract();     
	        //System.out.println("******************** Teacher's Initial Registerd School Was *********************");
	        //System.out.println(createTeacherResponse.asString());
	        //System.out.println("**********************************************************************************");
	                
	        //System.out.println("******************** Changed To Home School is ***********************************");
	        //System.out.println(afterChangedSchoolGetInfoResponse.asString());
	        //System.out.println("**********************************************************************************");
      }
	
		// ########## Service to edit school - (option 1) for Manual School. ##########
	@When("^I am Calling the Edit Domestic To Manual School Service End Point$")
	public void i_am_Calling_the_Edit_Domestic_To_Manual_School_Service_End_Point() throws Throwable
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
//		teacherSPSID=createTeacherResponse.path("spsId");
//		user=createTeacherResponse.path("userName");
//		//System.out.println(">>>>>>User SPSID is: "+teacherSPSID);
//		//System.out.println(">>>>>>>User Name is: "+user);
//		
//		//Create Manual School
//		ExtractableResponse<Response> createManualSchoolResponse=
//				given()
//						//.log().all()
//						.contentType("application/json")
//						.body(
								createManualSchoolPayload();
//								).
//				when()
//						.post(ENDPOINT_CREATE_SCHOOL).
//				then()
//						.statusCode(201)
//						.spec(
								createManualSchoolResponseValidator();
//								)
//						 .extract();	
//		m_schoolSPSID=createManualSchoolResponse.path("spsId");
		//System.out.println(createManualSchoolResponse.asString());
		//System.out.println(">>>>>>Manual School SPSID is: "+m_schoolSPSID);
		
		//Thread.sleep(6000L);
//		//Authentication
//		ExtractableResponse<Response> createLogInResponse=
//				given()
//						.contentType("application/json")
//		                .body(
		                		createLogInPayload();
//		                		).
//				when()
//						.post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//				then()
//						.statusCode(200)
//						.extract();	
		/*sps_session=createLogInResponse.path("SPS_SESSION.value");
		sps_tsp=createLogInResponse.path("SPS_TSP.value");
		//System.out.println(createLogInResponse.path("SPS_UD.value"));
		userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
		
		//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
		//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
		//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);	
		
		//Change School to Manual School
		
//		ExtractableResponse<Response> changedToManualSchoolResponse=
//				given()
//						//.log().all()
//						.pathParam("spsId",userSPSID)
//						.cookies("SPS_SESSION",sps_session)
//						.cookie("SPS_TSP",sps_tsp)
//						.contentType("application/json")
//						.body(
								changedToManualSchoolPayload();
//								).
//				when()
//						.put(ENDPOINT_CHANGE_SCHOOL).
//				then()
//						.statusCode(200)
//						//.spec(changedToManualSchoolResponseValidator())
//						.extract();
//		userSPSID=changedToManualSchoolResponse.path("spsId");	
//		//System.out.println("User SPSID is: "+userSPSID);
//		// Get School Info after change school
//		//ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
//				 given()
//				 		//.log().all()
//				 		.pathParam("spsId",teacherSPSID)
//				 		.contentType("application/json").
//				 when()
//				 		.get(ENDPOINT_GET_SCHOOL).
//				 then()
//				 		.statusCode(200)
//				 		.spec(
				 				changedToManualSchoolResponseValidator();
//				 				)
//						.extract();		
		//System.out.println("******************** Teacher's Initial Registerd School Was *********************");
		//System.out.println(createTeacherResponse.asString());
		//System.out.println("**********************************************************************************");
				
		//System.out.println("******************** Changed To Manual School is ***********************************");
		//System.out.println(afterChangedSchoolGetInfoResponse.asString());
		//System.out.println("**********************************************************************************");	
	}
	
	@Then("^I should See the (.*) School changed to in response.$")
	public void I_Should_See_the_School_changed_to_in_response(String x) throws Throwable 
	{
		System.out.println(x);
	}
	
	//injected
	 @Then("^I should get failure or success message of the action after altering information$")
     public void i_should_get_failure_or_success_message_of_the_action_after_altering_information() throws Throwable {
	     System.out.println("International School");
     }
	
	@Given("^I am Using SPS Edit School Service to Send request for (.*)$")
	public void I_am_Using_SPS_Edit_School_Service_to_Send_request_for_Review_Request(String y) throws Throwable 
	{
		System.out.println(y);
	}
		// ########## Service to edit School:(option 2&3)The school name is correct, but the address is incorrect. ##########
	@When("^I am Calling the Edit School Service for Review End Point$")
	public void i_am_Calling_the_Edit_School_Service_for_Review_End_Point() throws Throwable 
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
//		teacherSPSID=createTeacherResponse.path("spsId");
//		user=createTeacherResponse.path("userName");
		//System.out.println(">>>>>>User SPSID is: "+teacherSPSID);
		//System.out.println(">>>>>>>User Name is: "+user);
		
		//Thread.sleep(7000L);
		//Authentication
//		ExtractableResponse<Response> createLogInResponse=
//				given()
//						.contentType("application/json")
//		                .body(
		                		createLogInPayload();
//		                		).
//				when()
//						.post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//				then()
//						.statusCode(200)
//						.extract();	
		/*sps_session=createLogInResponse.path("SPS_SESSION.value");
		sps_tsp=createLogInResponse.path("SPS_TSP.value");
		//System.out.println(createLogInResponse.path("SPS_UD.value"));
		userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
		
		//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
		//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
		//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);	
		
		//Send School Info for Review
		
//		ExtractableResponse<Response> sendSchoolInfoForReviewResponse=
//				given()
//						//.log().all()
//						.pathParam("spsId",userSPSID)
//						.cookies("SPS_SESSION",sps_session)
//						.cookie("SPS_TSP",sps_tsp)
//						.contentType("application/json")
//						.body(
							sendSchoolInfoForReviewPayload();
//								).
//				when()
//						.post(ENDPOINT_REVIEW_SCHOOL).
//				then()
//						.statusCode(200)
//						//.spec(sendSchoolInfoForReviewResponseValidator())
//						.extract();
		//userSPSID=createCapturePaymentResponse.path("spsId");	
		//System.out.println("User SPSID is: "+userSPSID);
		//System.out.println("******************** Teacher's Initial Registerd School Was *********************");
		//System.out.println(createTeacherResponse.asString());
		//System.out.println("**********************************************************************************");
				
		//System.out.println("********** Response When Send School Info For Review ***************");
		//System.out.println(sendSchoolInfoForReviewResponse.asString());
		//System.out.println("*******************************************************************");
	}
	
	@Then("^I should Get the (.*) School changed to in response.$")
	public void I_Should_Get_the_School_changed_to_in_response(String y) throws Throwable 
	{
		System.out.println(y);
	}
	
	//injected
	@Then("^the response should be \"([^\"]*)\"$")
    public void the_response_should_be(String y) throws Throwable {
	    System.out.println(y);
     }
	
	@Then("^the school is changed to home school$")
    public void the_school_is_changed_to_home_school() throws Throwable {
     }
	
	//injected
	@Then("^the response message for the action is shown$")
    public void the_response_message_for_the_action_is_shown() throws Throwable {
	    System.out.println("Home School");
    }
	
	//injected-both of the follwing 2
	 @Then("^school is changed from domestic to international$")
     public void school_is_changed_from_domestic_to_international() throws Throwable {
	     System.out.println("International School");
      }
      @Then("^I see changes applied\\.$")
     public void i_see_changes_applied() throws Throwable {
     }
}
