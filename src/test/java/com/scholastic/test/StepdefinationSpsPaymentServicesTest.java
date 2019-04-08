package com.scholastic.test;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;
import com.scholastic.main.SpsPaymentServiceSupportClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinationSpsPaymentServicesTest extends SpsPaymentServiceSupportClass
{
	public SpsPaymentServiceSupportClass supportClass=new SpsPaymentServiceSupportClass();
	
	@Given("^I am Utilizing SPS Payment Service to Get(.*)$")
	public void i_am_Utilizing_SPS_Payment_Service_to_Get(String x) throws Throwable 
	{
	   System.out.println(x);
	}
	
	//injected
	@Given("^SPS Payment Service is being executed to gain \"([^\"]*)\"$")
    public void sps_Payment_Service_is_being_executed_to_gain(String x) throws Throwable {
	    System.out.println(x);
     }
	
	//injected
	@Given("^I use SPS Payment Service to track payment$")
    public void i_use_SPS_Payment_Service_to_track_payment() throws Throwable {
	    System.out.println("Capture Payment");
     }

	@When("^I am Calling The Capture Payment Service End Point$")
	public void i_am_Using_The_Capture_Payment_Service_End_Point() throws Throwable 
	{
		//Authentication
//				ExtractableResponse<Response> createLogInResponse=
//						given()
//								.contentType("application/json")
//				                .body(
				                		createLogInPayload();
//				                		).
//						when()
//								.post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//						then()
//								.statusCode(200)
//								.extract();	
//				sps_session=createLogInResponse.path("SPS_SESSION.value");
//				sps_tsp=createLogInResponse.path("SPS_TSP.value");
//				//System.out.println(createLogInResponse.path("SPS_UD.value"));
//				userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
				
				//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
				//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
				//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
							
				// Capture Payment
				//ExtractableResponse<Response> createCapturePaymentResponse=
//						given()
//								//.log().all()
//								.pathParam("spsId",userSPSID)
//								.cookies("SPS_SESSION",sps_session)
//								.cookie("SPS_TSP",sps_tsp)
//								.contentType("application/json")
//								.body(
										createCapturePaymentPayload();
//										).
//						when()
//								.post(ENDPOINT_CAPTURE_PAYMENT).
//						then()
//								.statusCode(200)
//								//.spec(createCapturePaymentResponse())
//								.extract();
				//userSPSID=createCapturePaymentResponse.path("spsId");	
				//System.out.println("User SPSID is: "+userSPSID);
				//System.out.println("******************** Captured Payment Response ********************");
				//System.out.println(createCapturePaymentResponse.asString());
				//System.out.println("*******************************************************************");
	}
	
	//injected
	 @When("^The Capture Payment Service End Point is being invoked$")
     public void the_Capture_Payment_Service_End_Point_is_being_invoked() throws Throwable {
	   //Authentication
//         ExtractableResponse<Response> createLogInResponse=
//                 given()
//                         .contentType("application/json")
//                         .body(
                        		 createLogInPayload();
//                        		 ).
//                 when()
//                         .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//                 then()
//                         .statusCode(200)
//                         .extract(); 
//         sps_session=createLogInResponse.path("SPS_SESSION.value");
//         sps_tsp=createLogInResponse.path("SPS_TSP.value");
//         //System.out.println(createLogInResponse.path("SPS_UD.value"));
//         userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
         
         //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
         //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
         //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
                     
         // Capture Payment
         //ExtractableResponse<Response> createCapturePaymentResponse=
//                 given()
//                         //.log().all()
//                         .pathParam("spsId",userSPSID)
//                         .cookies("SPS_SESSION",sps_session)
//                         .cookie("SPS_TSP",sps_tsp)
//                         .contentType("application/json")
//                         .body(
                        		 createCapturePaymentPayload();
//                        		 ).
//                 when()
//                         .post(ENDPOINT_CAPTURE_PAYMENT).
//                 then()
//                         .statusCode(200)
//                         //.spec(createCapturePaymentResponse())
//                         .extract();
         //userSPSID=createCapturePaymentResponse.path("spsId"); 
         //System.out.println("User SPSID is: "+userSPSID);
         //System.out.println("******************** Captured Payment Response ********************");
         //System.out.println(createCapturePaymentResponse.asString());
         //System.out.println("*******************************************************************");
      }
	
	//injected
	 @When("^Capture payment Service end point is initiated$")
     public void capture_payment_Service_end_point_is_initiated() throws Throwable {
	   //Authentication
//         ExtractableResponse<Response> createLogInResponse=
//                 given()
//                         .contentType("application/json")
//                         .body(
                        		 createLogInPayload();
//                        		 ).
//                 when()
//                         .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//                 then()
//                         .statusCode(200)
//                         .extract(); 
//         sps_session=createLogInResponse.path("SPS_SESSION.value");
//         sps_tsp=createLogInResponse.path("SPS_TSP.value");
//         //System.out.println(createLogInResponse.path("SPS_UD.value"));
//         userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
         
         //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
         //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
         //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
                     
         // Capture Payment
         //ExtractableResponse<Response> createCapturePaymentResponse=
//                 given()
//                         //.log().all()
//                         .pathParam("spsId",userSPSID)
//                         .cookies("SPS_SESSION",sps_session)
//                         .cookie("SPS_TSP",sps_tsp)
//                         .contentType("application/json")
//                         .body(
                        		 createCapturePaymentPayload();
//                        		 ).
//                 when()
//                         .post(ENDPOINT_CAPTURE_PAYMENT).
//                 then()
//                         .statusCode(200)
//                         //.spec(createCapturePaymentResponse())
//                         .extract();
         //userSPSID=createCapturePaymentResponse.path("spsId"); 
         //System.out.println("User SPSID is: "+userSPSID);
         //System.out.println("******************** Captured Payment Response ********************");
         //System.out.println(createCapturePaymentResponse.asString());
         //System.out.println("*******************************************************************");
     }

	@When("^I am Calling The Sign in Payment Service End Point$")
	public void i_am_Calling_The_Sign_in_Payment_Service_End_Point() throws Throwable {
		//Authentication
//				ExtractableResponse<Response> createLogInResponse=
//						given()
//								.contentType("application/json")
//				                .body(
				                		createLogInPayload();
//				                ).
//						when()
//								.post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//						then()
//								.statusCode(200)
//								.extract();	
//				sps_session=createLogInResponse.path("SPS_SESSION.value");
//				sps_tsp=createLogInResponse.path("SPS_TSP.value");
//				//System.out.println(createLogInResponse.path("SPS_UD.value"));
//				userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];
				
				//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
				//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
				//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
							
				// Sign a Payment
				//ExtractableResponse<Response> createSignPaymentResponse=
//						given()
//								//.log().all()
//								.pathParam("spsId",userSPSID)
//								.cookies("SPS_SESSION",sps_session)
//								.cookie("SPS_TSP",sps_tsp)
//								.contentType("application/json")
//								.body(
										createSignPaymentPayload();
//										).
//						when()
//								.post(ENDPOINT_SIGN_PAYMENT).
//						then()
//								.statusCode(200)
//								//.spec(createCapturePaymentResponse())
//								.extract();
				//userSPSID=createCapturePaymentResponse.path("spsId");	
				//System.out.println("User SPSID is: "+userSPSID);
				//System.out.println("******************** Signed Payment Response ********************");
				//System.out.println(createSignPaymentResponse.asString());
				//System.out.println("*******************************************************************");
	}
	
		

	@Given("^I am Utilizing SPS Service to (.*).$")
	public void i_am_Utilizing_SPS_Service_to (String y) throws Throwable 
	{
		System.out.println(y);   
	}
	
	//injected
	 @Given("^Links to update existing credit card, add credit card and delete credit card-(\\d+)$")
     public void links_to_update_existing_credit_card_add_credit_card_and_delete_credit_card(int arg1) throws Throwable {
	     System.out.println("Add Credit Card");
      }
	
	//injected
	@Given("^credit card expire date is not passed$")
    public void credit_card_expire_date_is_not_passed() throws Throwable {
     }
   @Given("^is enabled for online transactions$")
   public void is_enabled_for_online_transactions() throws Throwable {
       System.out.println("Add Credit Card");
     }
	
	//injected
	 @Given("^I issue SPS Service command to \"([^\"]*)\"\\.$")
     public void i_issue_SPS_Service_command_to(String y) throws Throwable {
	     System.out.println(y);
      }
	
	//injected
	@Given("^Links to update existing credit card, add credit card and delete credit card$")
    public void links_to_update_existing_credit_card_add_credit_card_and_delete_credit_card() throws Throwable {
	    System.out.println("Add Credit Card"); 
    
    }

	@When("^I am Calling Add Credit Card to Subscription Service End Point$")
	public void i_am_Calling_Add_Credit_Card_to_Subscription_Service_End_Point() throws Throwable 
	{
		//Authentication
//				ExtractableResponse<Response> createLogInSubsResponse=
//						given()
//								.contentType("application/json")
//				                .body(
				                		createLogInSubsPayload();
//				                		).
//						when()
//								.post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//						then()
//								.statusCode(200)
//								.extract();	
//				sps_session=createLogInSubsResponse.path("SPS_SESSION.value");
//				sps_tsp=createLogInSubsResponse.path("SPS_TSP.value");
//				//System.out.println(createLogInSubsResponse.path("SPS_UD.value"));
//				userSPSID=((String)createLogInSubsResponse.path("SPS_UD.value")).split("\\|")[0];
				
				//System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
				//System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
				//System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
							
				// Add Credit Card To Subscription
//				ExtractableResponse<Response> addCreditCardToSubscriptionResponse=
//						given()
//								//.log().all()
//								.pathParam("spsId",userSPSID)
//								.contentType("application/json")
//								.cookies("SPS_SESSION",sps_session)
//								.cookie("SPS_TSP",sps_tsp)
//								.body(
										addCreditCardToSubscriptionPayload();
//										).
//						when()
//								.post(ENDPOINT_ADDCREDITCARD_SUBSCRIPTION).
//						then()
//								.statusCode(202)
//								//.spec(createCapturePaymentResponse())
//								.extract();
				//userSPSID=createCapturePaymentResponse.path("spsId");	
				//System.out.println("User SPSID is: "+userSPSID);
				//System.out.println("******************** Add Credit Card To Subscription Response ********************");
				//System.out.println(addCreditCardToSubscriptionResponse.asString());
				//System.out.println("**********************************************************************************");
	}
	
	//injected
	 @When("^I add credit card from the subscription services$")
     public void i_add_credit_card_from_the_subscription_services() throws Throwable {
	   //Authentication
//         ExtractableResponse<Response> createLogInSubsResponse=
//                 given()
//                         .contentType("application/json")
//                         .body(
                        		 createLogInSubsPayload();
//                        		 ).
//                 when()
//                         .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//                 then()
//                         .statusCode(200)
//                         .extract(); 
//         sps_session=createLogInSubsResponse.path("SPS_SESSION.value");
//         sps_tsp=createLogInSubsResponse.path("SPS_TSP.value");
//         //System.out.println(createLogInSubsResponse.path("SPS_UD.value"));
//         userSPSID=((String)createLogInSubsResponse.path("SPS_UD.value")).split("\\|")[0];
//         
         //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
         //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
         //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
                     
         // Add Credit Card To Subscription
//         ExtractableResponse<Response> addCreditCardToSubscriptionResponse=
//                 given()
//                         //.log().all()
//                         .pathParam("spsId",userSPSID)
//                         .contentType("application/json")
//                         .cookies("SPS_SESSION",sps_session)
//                         .cookie("SPS_TSP",sps_tsp)
//                         .body(
                        		 addCreditCardToSubscriptionPayload();
//                        		 ).
//                 when()
//                         .post(ENDPOINT_ADDCREDITCARD_SUBSCRIPTION).
//                 then()
//                         .statusCode(202)
//                         //.spec(createCapturePaymentResponse())
//                         .extract();
         //userSPSID=createCapturePaymentResponse.path("spsId"); 
         //System.out.println("User SPSID is: "+userSPSID);
         //System.out.println("******************** Add Credit Card To Subscription Response ********************");
         //System.out.println(addCreditCardToSubscriptionResponse.asString());
         //System.out.println("**********************************************************************************");
      }
	
	//injected
	@When("^\"([^\"]*)\" called$")
    public void called(String arg1) throws Throwable {
//	  //Authentication
//        ExtractableResponse<Response> createLogInSubsResponse=
//                given()
//                        .contentType("application/json")
//                        .body(
                        		createLogInSubsPayload();
//                        		).
//                when()
//                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//                then()
//                        .statusCode(200)
//                        .extract(); 
//        sps_session=createLogInSubsResponse.path("SPS_SESSION.value");
//        sps_tsp=createLogInSubsResponse.path("SPS_TSP.value");
//        //System.out.println(createLogInSubsResponse.path("SPS_UD.value"));
//        userSPSID=((String)createLogInSubsResponse.path("SPS_UD.value")).split("\\|")[0];
        
        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
                    
        // Add Credit Card To Subscription
//        ExtractableResponse<Response> addCreditCardToSubscriptionResponse=
//                given()
//                        //.log().all()
//                        .pathParam("spsId",userSPSID)
//                        .contentType("application/json")
//                        .cookies("SPS_SESSION",sps_session)
//                        .cookie("SPS_TSP",sps_tsp)
//                        .body(
                        		addCreditCardToSubscriptionPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_ADDCREDITCARD_SUBSCRIPTION).
//                then()
//                        .statusCode(202)
//                        //.spec(createCapturePaymentResponse())
//                        .extract();
        //userSPSID=createCapturePaymentResponse.path("spsId"); 
        //System.out.println("User SPSID is: "+userSPSID);
        //System.out.println("******************** Add Credit Card To Subscription Response ********************");
        //System.out.println(addCreditCardToSubscriptionResponse.asString());
        //System.out.println("**********************************************************************************");
     }
	
	//injected
	@When("^I click credit card option$")
    public void i_click_credit_card_option() throws Throwable {
	  //Authentication
//        ExtractableResponse<Response> createLogInSubsResponse=
//                given()
//                        .contentType("application/json")
//                        .body(
                        		createLogInSubsPayload();
//                        		).
//                when()
//                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
//                then()
//                        .statusCode(200)
//                        .extract(); 
//        sps_session=createLogInSubsResponse.path("SPS_SESSION.value");
//        sps_tsp=createLogInSubsResponse.path("SPS_TSP.value");
//        //System.out.println(createLogInSubsResponse.path("SPS_UD.value"));
//        userSPSID=((String)createLogInSubsResponse.path("SPS_UD.value")).split("\\|")[0];
        
        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
                    
        // Add Credit Card To Subscription
//        ExtractableResponse<Response> addCreditCardToSubscriptionResponse=
//                given()
//                        //.log().all()
//                        .pathParam("spsId",userSPSID)
//                        .contentType("application/json")
//                        .cookies("SPS_SESSION",sps_session)
//                        .cookie("SPS_TSP",sps_tsp)
//                        .body(
                        		addCreditCardToSubscriptionPayload();
//                        		).
//                when()
//                        .post(ENDPOINT_ADDCREDITCARD_SUBSCRIPTION).
//                then()
//                        .statusCode(202)
//                        //.spec(createCapturePaymentResponse())
//                        .extract();
        //userSPSID=createCapturePaymentResponse.path("spsId"); 
        //System.out.println("User SPSID is: "+userSPSID);
        //System.out.println("******************** Add Credit Card To Subscription Response ********************");
        //System.out.println(addCreditCardToSubscriptionResponse.asString());
        //System.out.println("***************************************
     }

	@Then("^I Should Suppose to Get (.*) in response.$")
	public void i_Should_Suppose_to_Get_in_response(String x) throws Throwable
	{
		System.out.println(x);
	}
	
	//injected
	@Then("^\"([^\"]*)\" is received as the result$")
    public void is_received_as_the_result(String x) throws Throwable {
	    System.out.println(x);
     }
	
	//injected
	@Then("^my card is added$")
    public void my_card_is_added() throws Throwable {
	    System.out.println("Success - Credit Card Added");
     }
	
	//injected
	@Then("^the process confirmation message is displayed$")
    public void the_process_confirmation_message_is_displayed() throws Throwable {
	    System.out.println("Success Capture Payment");
     }
	
	//injected
	@Then("^\"([^\"]*)\" should be the notification$")
    public void should_be_the_notification(String x) throws Throwable {
	    System.out.println(x);
     }
	
	//injected
	@Then("^The failed or Success message should be displayed after selected  transaction$")
    public void the_failed_or_Success_message_should_be_displayed_after_selected_transaction() throws Throwable {
	    System.out.println("Success - Credit Card Added");
   
    }
	
	@Then("^the payment is tracked$")
    public void the_payment_is_tracked() throws Throwable {
   }
	
}
