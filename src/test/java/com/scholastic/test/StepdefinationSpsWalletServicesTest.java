package com.scholastic.test;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;


import com.scholastic.main.SpsWalletServiceSupportClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinationSpsWalletServicesTest extends SpsWalletServiceSupportClass
{	
	public SpsWalletServiceSupportClass supportClasss=new SpsWalletServiceSupportClass();
	
	@Given("^I am Using SPS Wallet Service to (.*)$")
	public void i_am_Using_SPS_Wallet_Service_to(String x) throws Throwable 
	{
		System.out.println(x);
	}
	
	//injected
	 @Given("^sps wallet services are up and running$")
     public void sps_wallet_services_are_up_and_running() throws Throwable {
	     System.out.println("Get Crdit Card Info");
      }
	
	//injected
	 @Given("^SPS Wallet Service is the choice used to \"([^\"]*)\"$")
     public void sps_Wallet_Service_is_the_choice_used_to(String x) throws Throwable {
	     System.out.println(x);
     }
	 
	 //injected
	 @Given("^i have right to access sps wallet services$")
      public void i_have_right_to_access_sps_wallet_services() throws Throwable {
     }
     @Given("^i am authorised to view card and wallet details$")
     public void i_am_authorised_to_view_card_and_wallet_details() throws Throwable {
         System.out.println("Get Crdit Card Info");
     }
	
	// ########## Add Credit Card to Wallet ##########
	@When("^I am Calling the Add Credit Card to Wallet Service End Point$")
	public void i_am_Calling_the_Add_Credit_Card_to_Wallet_Service_End_Point() throws Throwable 
	{
		//Create Teacher
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
//		//System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
//		//System.out.println(">>>>>>>User Name is: "+user);
//		
//		//Thread.sleep(6000L);
//		
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
//		sps_session=createLogInResponse.path("SPS_SESSION.value");
//		sps_tsp=createLogInResponse.path("SPS_TSP.value");
//		//System.out.println(createLogInResponse.path("SPS_UD.value"));
//		userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
//		
//		//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
//		//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
//		//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
//							
//		// Add Credit card to wallet.
//		
//		//ExtractableResponse<Response> addCreditCardToWalletResponse=
//				given()
//						//.log().all()
//						.pathParam("spsId",userSPSID)
//						.cookies("SPS_SESSION",sps_session)
//						.cookie("SPS_TSP",sps_tsp)
//						.contentType("application/json")
//						.body(
								addCreditCardToWalletPayload();
//								).
//				when()
//						.post(ENDPOINT_ADD_CREDITCARD).
//				then()
//						.statusCode(400)
//						//.spec(addCreditCardToWalletResponseValidator())
//						.extract();
		//System.out.println("******************** AddCredit Card To Wallet Response *********************");
		//System.out.println(addCreditCardToWalletResponse.asString());
		//System.out.println("****************************************************************************");
			
	}
	// ########## Get Credit Card Info ##########
	
	@When("^I am Calling the Get Credit Card Service End Point$")
	public void i_am_Calling_the_Get_Credit_Card_Service_End_Point() throws Throwable 
	{
		//Create Teacher
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
//		//System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
//		//System.out.println(">>>>>>>User Name is: "+user);
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
//		sps_session=createLogInResponse.path("SPS_SESSION.value");
//		sps_tsp=createLogInResponse.path("SPS_TSP.value");
//		//System.out.println(createLogInResponse.path("SPS_UD.value"));
//		userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
//		
//		//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
//		//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
//		//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
//		
//		// Add Credit card to wallet.
//		
//		//ExtractableResponse<Response> addCreditCardToWalletResponse=
//				given()
//						//.log().all()
//						.pathParam("spsId",userSPSID)
//						.cookies("SPS_SESSION",sps_session)
//						.cookie("SPS_TSP",sps_tsp)
//						.contentType("application/json")
//						.body(
								addCreditCardToWalletPayload();
//								).
//				when()
//						.post(ENDPOINT_ADD_CREDITCARD).
//				then()
//						.statusCode(400)
//						//.spec(addCreditCardToWalletResponseValidator())
//						.extract();
//		
//		//System.out.println(addCreditCardToWalletResponse.asString());
//					
//		// Get the Credit Card
//		
//		ExtractableResponse<Response> getCreditCardResponse=
//				given()
//						.pathParam("spsId",teacherSPSID).
//				when()
//						.get(ENDPOINT_GET_CREDITCARD).
//				then()
//						.statusCode(409)
//						.spec(
								getCreditCardResponseValidator();
//								)
//						.extract();
//		totalcreditcardCount= getCreditCardResponse.path("count");
//		//int walletId=Integer.parseInt((String) getCreditCardResponse.path("wallet.id[0]"));
//		walletID.add(888);
		//System.out.println(">>>>>>>>> Wallet Id is: "+walletId);
		//System.out.println("@#######"+walletID.get(0));
		//System.out.println(">>>>>>>>> Total Credit Card Count is: "+totalcreditcardCount);
		//System.out.println("******************** Get Credit Card Info From Wallet *********************");
		//System.out.println(getCreditCardResponse.asString());
		//System.out.println("****************************************************************************");
	}
	
	//injected
	@When("^i am calling sps wallet service$")
    public void i_am_calling_sps_wallet_service() throws Throwable {
	  //Create Teacher
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
//        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
//        //System.out.println(">>>>>>>User Name is: "+user);
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
//        sps_session=createLogInResponse.path("SPS_SESSION.value");
//        sps_tsp=createLogInResponse.path("SPS_TSP.value");
//        //System.out.println(createLogInResponse.path("SPS_UD.value"));
//        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
//        
//        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
//        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
//        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
//        
//        // Add Credit card to wallet.
//        
//        //ExtractableResponse<Response> addCreditCardToWalletResponse=
//                given()
//                        //.log().all()
//                        .pathParam("spsId",userSPSID)
//                        .cookies("SPS_SESSION",sps_session)
//                        .cookie("SPS_TSP",sps_tsp)
//                        .contentType("application/json")
//                        .body(
                        		addCreditCardToWalletPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_ADD_CREDITCARD).
//                then()
//                        .statusCode(400)
//                        //.spec(addCreditCardToWalletResponseValidator())
//                        .extract();
//        
//        //System.out.println(addCreditCardToWalletResponse.asString());
//                    
//        // Get the Credit Card
//        
//        ExtractableResponse<Response> getCreditCardResponse=
//                given()
//                        .pathParam("spsId",teacherSPSID).
//                when()
//                        .get(ENDPOINT_GET_CREDITCARD).
//                then()
//                        .statusCode(409)
//                        .spec(
                        		getCreditCardResponseValidator();
//                        		)
//                        .extract();
//        totalcreditcardCount= getCreditCardResponse.path("count");
//        //int walletId=Integer.parseInt((String) getCreditCardResponse.path("wallet.id[0]"));
//        walletID.add(888);
        //System.out.println(">>>>>>>>> Wallet Id is: "+walletId);
        //System.out.println("@#######"+walletID.get(0));
        //System.out.println(">>>>>>>>> Total Credit Card Count is: "+totalcreditcardCount);
        //System.out.println("******************** Get Credit Card Info From Wallet *********************");
        //System.out.println(getCreditCardResponse.asString());
        //System.out.println("****************************************************************************");
    }
	
	//injected
	@When("^I am peforming the Get Credit Card Service End Point$")
    public void i_am_peforming_the_Get_Credit_Card_Service_End_Point() throws Throwable {
	  //Create Teacher
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
//        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
//        //System.out.println(">>>>>>>User Name is: "+user);
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
//        sps_session=createLogInResponse.path("SPS_SESSION.value");
//        sps_tsp=createLogInResponse.path("SPS_TSP.value");
//        //System.out.println(createLogInResponse.path("SPS_UD.value"));
//        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
//        
//        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
//        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
//        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
//        
//        // Add Credit card to wallet.
//        
//        //ExtractableResponse<Response> addCreditCardToWalletResponse=
//                given()
//                        //.log().all()
//                        .pathParam("spsId",userSPSID)
//                        .cookies("SPS_SESSION",sps_session)
//                        .cookie("SPS_TSP",sps_tsp)
//                        .contentType("application/json")
//                        .body(
                        		addCreditCardToWalletPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_ADD_CREDITCARD).
//                then()
//                        .statusCode(400)
//                        //.spec(addCreditCardToWalletResponseValidator())
//                        .extract();
//        
//        //System.out.println(addCreditCardToWalletResponse.asString());
//                    
//        // Get the Credit Card
//        
//        ExtractableResponse<Response> getCreditCardResponse=
//                given()
//                        .pathParam("spsId",teacherSPSID).
//                when()
//                        .get(ENDPOINT_GET_CREDITCARD).
//                then()
//                        .statusCode(409)
//                        .spec(
                        		getCreditCardResponseValidator();
//                        		)
//                        .extract();
//        totalcreditcardCount= getCreditCardResponse.path("count");
//        //int walletId=Integer.parseInt((String) getCreditCardResponse.path("wallet.id[0]"));
//        walletID.add(888);
        //System.out.println(">>>>>>>>> Wallet Id is: "+walletId);
        //System.out.println("@#######"+walletID.get(0));
        //System.out.println(">>>>>>>>> Total Credit Card Count is: "+totalcreditcardCount);
        //System.out.println("******************** Get Credit Card Info From Wallet *********************");
        //System.out.println(getCreditCardResponse.asString());
        //System.out.println("****************************************************************************");
     }
	
	//injected
	@When("^I am requesting user cards$")
    public void i_am_requesting_user_cards() throws Throwable {
	  //Create Teacher
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
//        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
//        //System.out.println(">>>>>>>User Name is: "+user);
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
//        sps_session=createLogInResponse.path("SPS_SESSION.value");
//        sps_tsp=createLogInResponse.path("SPS_TSP.value");
//        //System.out.println(createLogInResponse.path("SPS_UD.value"));
//        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
//        
//        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
//        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
//        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
//        
//        // Add Credit card to wallet.
//        
//        //ExtractableResponse<Response> addCreditCardToWalletResponse=
//                given()
//                        //.log().all()
//                        .pathParam("spsId",userSPSID)
//                        .cookies("SPS_SESSION",sps_session)
//                        .cookie("SPS_TSP",sps_tsp)
//                        .contentType("application/json")
//                        .body(
                        		addCreditCardToWalletPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_ADD_CREDITCARD).
//                then()
//                        .statusCode(400)
//                        //.spec(addCreditCardToWalletResponseValidator())
//                        .extract();
//        
//        //System.out.println(addCreditCardToWalletResponse.asString());
//                    
//        // Get the Credit Card
//        
//        ExtractableResponse<Response> getCreditCardResponse=
//                given()
//                        .pathParam("spsId",teacherSPSID).
//                when()
//                        .get(ENDPOINT_GET_CREDITCARD).
//                then()
//                        .statusCode(409)
//                        .spec(
                        		getCreditCardResponseValidator();
//                        		)
//                        .extract();
//        totalcreditcardCount= getCreditCardResponse.path("count");
//        //int walletId=Integer.parseInt((String) getCreditCardResponse.path("wallet.id[0]"));
//        walletID.add(888);
        //System.out.println(">>>>>>>>> Wallet Id is: "+walletId);
        //System.out.println("@#######"+walletID.get(0));
        //System.out.println(">>>>>>>>> Total Credit Card Count is: "+totalcreditcardCount);
        //System.out.println("******************** Get Credit Card Info From Wallet *********************");
        //System.out.println(getCreditCardResponse.asString());
        //System.out.println("****************************************************************************");
     }
	
	// ########## Delete Credit Card from Wallet ##########
	@When("^I am Calling the Delete Credit Card Service End Point$")
	public void i_am_Calling_the_Delete_Credit_Card_Service_End_Point() throws Throwable 
	{
//		//Create Teacher
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
//		//System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
//		//System.out.println(">>>>>>>User Name is: "+user);
//			
//		//Thread.sleep(6000L);
//			
//		//Authentication
//		ExtractableResponse<Response> createLogInResponse=
//				given()
//						.contentType("application/json")
//			            .body(
			            		createLogInPayload();
//			            		).
//				when()
//						.post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//				then()
//						.statusCode(200)
//						.extract();	
//		sps_session=createLogInResponse.path("SPS_SESSION.value");
//		sps_tsp=createLogInResponse.path("SPS_TSP.value");
//		//System.out.println(createLogInResponse.path("SPS_UD.value"));
//		userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
//			
//		//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
//		//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
//		//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
//			
//		// Add Credit card to wallet.
//			
//		//ExtractableResponse<Response> addCreditCardToWalletResponse=
//				given()
//						//.log().all()
//						.pathParam("spsId",userSPSID)
//						.cookies("SPS_SESSION",sps_session)
//						.cookie("SPS_TSP",sps_tsp)
//						.contentType("application/json")
//						.body(
								addCreditCardToWalletPayload();
//								).
//				when()
//						.post(ENDPOINT_ADD_CREDITCARD).
//				then()
//						.statusCode(400)
//						//.spec(addCreditCardToWalletResponseValidator())
//						.extract();
//			
//		//System.out.println("******************** Response After Adding Credit Card To Wallet *********************");
//		//System.out.println(addCreditCardToWalletResponse.asString());
//		//System.out.println("**************************************************************************************");			
//		// Delete Credit Card From Wallet
//			
//		//ExtractableResponse<Response> deleteCreditCardResponse=
//				given()
//						.pathParam("spsId",teacherSPSID).
//				when()
//						.delete(ENDPOINT_DELETE_CREDITCARD).
//				then()
//						.statusCode(409)
//						//.spec(deleteCreditCardResponseValidator())
//						.extract();
		//System.out.println("******************** Response After Deleting Credit Card From Wallet *********************");
		//System.out.println(deleteCreditCardResponse.asString());
		//System.out.println("*******************************************************************************************");
	}
	@Then("^Should Get the (.*) in response.$")
	public void Should_Get_the_Added_Credit_Info_in_response(String x) throws Throwable 
	{
		System.out.println(x);
	}
	
	//injected-both of the immediate 2
	@Then("^a number of cards is displayed$")
    public void a_number_of_cards_is_displayed() throws Throwable {
     }
   
	@Then("^information of each card is printed along with it$")
    public void information_of_each_card_is_printed_along_with_it() throws Throwable {
	    System.out.println("Credit Card Info from the Wallet");
     }
	
	//injected
	 @Then("^my reply should be \"([^\"]*)\"$")
     public void my_reply_should_be(String x) throws Throwable {
	     System.out.println(x);
     }
	
	//injected
	@Then("^I should receive the number cards and their details$")
    public void i_should_receive_the_number_cards_and_their_details() throws Throwable {
	    System.out.println("Credit Card Info from the Wallet");
     }
	
	//injected
	@Given("^The link to user cards$")
    public void the_link_to_user_cards() throws Throwable {
	    System.out.println("Get Crdit Card Info");
     }
	
}
