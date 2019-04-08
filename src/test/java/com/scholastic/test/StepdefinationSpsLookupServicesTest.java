package com.scholastic.test;

import static com.jayway.restassured.RestAssured.given;

import com.scholastic.main.SpsLookupServiceSupportClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepdefinationSpsLookupServicesTest extends SpsLookupServiceSupportClass
{
	public SpsLookupServiceSupportClass supportClass= new SpsLookupServiceSupportClass();
	
	// Get All States
	@Given("^I am Using SPS Service to Get (.*)$")
	public void I_am_Using_SPS_Service_Get_All_States(String x) throws Throwable 
	{
	  System.out.println(x);
	}
	
	//injected
	
	
	//injected
	@Given("^SPS Service has been used to call \"([^\"]*)\"$")
    public void sps_Service_has_been_used_to_call(String x) throws Throwable {
	    System.out.println(x);
    }
	
	//injected
	@Given("^A text field to enter a \"([^\"]*)\"$")
    public void a_text_field_to_enter_a(String x) throws Throwable {
	    System.out.println(x);
     }
	
	// All States
	@When("^I am Calling The Get All States Service End Point$")
	public void I_am_Calling_The_Get_All_States_Service_End_Point() throws Throwable 
	{

		//ExtractableResponse<Response> getAllStateResponse=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_ALLSTATE).
//				then()
//						.statusCode(200)
//						.spec(
								getAllStateResponseValidator();
//								)
//						.extract();	
		//System.out.println(getAllStateResponse.asString());

	}
	
	// All Cities by State
	@When("^I am Calling Get All Cities by State Service End Point$")
	public void I_am_Calling_Get_All_Cities_by_State_Service_End_Point() throws Throwable 
	{
		//ExtractableResponse<Response> getAllCityResponse=
//				given()
//						
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_ALLCITY).
//				then()
//						.statusCode(200)
//						.spec(
								getAllCityResponseValidator();
//								)
//						.extract();	
		//System.out.println(getAllCityResponse.asString());
	}
	
	// All Countries	
	@When("^I am Calling Get All Countries Service End Point$")
	public void I_am_Calling_Get_All_Countries_Service_End_Point() throws Throwable 
	{
		//ExtractableResponse<Response> getAllCountryResponse=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_ALLCOUNTRY).
//		        then()
//		        		.statusCode(200)
//		        		.spec(
		        				getAllCountryResponseValidator();
//		        				)
//		        		.extract();		
		//System.out.println(getAllCountryResponse.asString());
	}
	
	// All Schools of a Country
	@When("^I am Calling Get All Schools by Country Service End Point$")
	public void I_am_Calling_Get_All_Schools_by_Country_Service_End_Point() throws Throwable 
	{
		//ExtractableResponse<Response> getCountrySchoolsResponse=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_COUNTRYSCHOOLS).
//				then()
//						.statusCode(200)
//						.spec(
								getCountrySchoolsResponseValidator();
//								)
//						.extract();		
		//System.out.println(getCountrySchoolsResponse.asString());
	}
	
	// All Schools by Zip Code
	@When("^I am Calling Get All Schools by Zip Code Service End Point$")
	public void I_am_Calling_Get_All_Schools_by_Zip_Code_Service_End_Point() throws Throwable 
	{
		String zipCode="11431";
			
		//ExtractableResponse<Response> getSchoolByZipcode=
//					given()
//							.param("clientId","SPSFacadeAPI").
//					when()
//							.get(ENDPOINT_SCHOOLBYZIPCODE, zipCode).
//					then()
//						 	.statusCode(200)
//						 	.spec(
						 			getSchoolByZipcodeResponseValidator();
//						 			)
//						 	.extract();		
		//System.out.println(getSchoolByZipcode.asString());
	}
	
	//injected
	@When("^End Point Zip Code service issued$")
    public void end_Point_Zip_Code_service_issued() throws Throwable {
	    String zipCode="11431";
        
        //ExtractableResponse<Response> getSchoolByZipcode=
//                    given()
//                            .param("clientId","SPSFacadeAPI").
//                    when()
//                            .get(ENDPOINT_SCHOOLBYZIPCODE, zipCode).
//                    then()
//                            .statusCode(200)
//                            .spec(
                            		getSchoolByZipcodeResponseValidator();
//                            		)
//                            .extract();     
        //System.out.println(getSchoolByZipcode.asString());
     }
	
	
	//injected
	@When("^I am selecting search button/link of all schools using zip code$")
    public void i_am_selecting_search_button_link_of_all_schools_using_zip_code() throws Throwable {
	    String zipCode="11431";
        
        //ExtractableResponse<Response> getSchoolByZipcode=
//                    given()
//                            .param("clientId","SPSFacadeAPI").
//                    when()
//                            .get(ENDPOINT_SCHOOLBYZIPCODE, zipCode).
//                    then()
//                            .statusCode(200)
//                            .spec(
                            		getSchoolByZipcodeResponseValidator();
//                            		)
//                            .extract();     
        //System.out.println(getSchoolByZipcode.asString());
    }
	
	// All Schools by State & City
		@When("^I am Calling Get All Schools by State and City Service End Point$")
		public void I_am_Calling_Get_All_Schools_by_State_and_City_Service_End_Point() throws Throwable 
		{
			//ExtractableResponse<Response> getSchoolByCityState=
//					given()
//							.param("clientId","SPSFacadeAPI").
//					when()
//							.get(ENDPOINT_SCHOOLBYCITYSATATE).
//					then()
//			 				.statusCode(200)
//			 				.spec(
			 						getSchoolByCityStateResponseValidator();
//			 						)
//			 				.extract();		
			//System.out.println(getSchoolByCityState.asString());
		}
	// All Teachers
	@When("^I am Calling Get All Teachers Service End Point$")
	public void I_am_Calling_Get_All_Teachers_Service_End_Point() throws Throwable 
	{
		String schoolId="411778";
		//ExtractableResponse<Response> getAllTeachersResponse=
//					given()
//							.param("clientId","SPSFacadeAPI").
//					when()
//							.get(ENDPOINT_ALLTEACHERS, schoolId).
//					then()
//							.statusCode(200)
//							.spec(
									getAllTeachersResponseValidator();
//									)
//							.extract();				
		//System.out.println(getAllTeachersResponse.asString());
	}
	
	//injected
	 @When("^I am performing End Point Zip Code service$")
     public void i_am_performing_End_Point_Zip_Code_service() throws Throwable {
	     String schoolId="411778";
	        //ExtractableResponse<Response> getAllTeachersResponse=
//	                    given()
//	                            .param("clientId","SPSFacadeAPI").
//	                    when()
//	                            .get(ENDPOINT_ALLTEACHERS, schoolId).
//	                    then()
//	                            .statusCode(200)
//	                            .spec(
	                            		getAllTeachersResponseValidator();
//	                            		)
//	                            .extract();             
	        //System.out.println(getAllTeachersResponse.asString());
     }
	
	// All Alternate Teachers
	@When("^I am Calling Get All Alternate Teachers Service End Point$")
	public void I_am_Calling_Get_All_Alternate_Teachers_Service_End_Point() throws Throwable 
	{
		String schoolId="348537";
			
		//ExtractableResponse<Response> getAlternateTeacherResponse=
//					given()
//							.param("clientId","SPSFacadeAPI").
//					when()
//							.get(ENDPOINT_ALTERNATETEACHER, schoolId).
//					then()
//							.statusCode(200)
//							.spec(
									getAlternateTeacherResponseValidator();
//									)
//							.extract();				
		//System.out.println(getAlternateTeacherResponse.asString());
	}
	
	// Expose Consumer
	@When("^I am Calling Expose Consumer Service End Point$")
	public void I_am_Calling_Expose_Consumer_Service_End_Point() throws Throwable 
	{
		//ExtractableResponse<Response> getExsposeConsumerResponse=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_EXPOSECONSUMER).
//				then()
// 						.statusCode(200)
 						//.spec(getExposeConsumerResponseValidator())
 						//.extract();		
		//System.out.println(getExsposeConsumerResponse.asString());
	}
	
	// Expose Educator
	@When("^I am Calling Expose Educator Service End Point$")
	public void I_am_Calling_Expose_Educator_Service_End_Point() throws Throwable 
	{
//		//ExtractableResponse<Response> getExposeEducatorResponse=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_EXPOSEEDUCATOR).
//				then()
//						.statusCode(200)
//						//.spec(getExposeEducatorResponseValidator())
//						.extract();		
		//System.out.println(getExposeEducatorResponse.asString());
	}
	
	// Get Primary School Address
	@When("^I am Calling Get Primary School Address Service End Point$")
	public void I_am_Calling_Get_Primary_Shool_Address_Service_End_Point() throws Throwable 
	{
		String userId="84305751";
		
		//ExtractableResponse<Response> getPrimarySchoolAddress=
//					given()
//							.param("clientId","SPSFacadeAPI").
//					when()
//							.get(ENDPOINT_PRIMARYSCHOOLADDRESS, userId).
//					then()
//							.statusCode(200)
//							.spec(
									getPrimarySchoolAddressResponseValidator();
//									)
//							.extract();		
		//System.out.println(getPrimarySchoolAddress.asString());
	}
	
	// Get Existing Shipping Address`
	@When("^I am Calling Get Existing Shipping Address Service End Point$")
	public void I_am_Calling_Get_Existing_Shipping_Address_Service_End_Point() throws Throwable 
	{
		String userId="83931883";
		//ExtractableResponse<Response> getExistingShippingAddress=
//					given()
//							.param("clientId","SPSFacadeAPI").
//					when()
//							.get(ENDPOINT_EXSISTINGSHIPPINGADDRESS, userId).
//					then()
//							.statusCode(200)
//							.spec(
									getExistingShippingAddressResponseValidator();
//									)
//							.extract();		
			//System.out.println(getExistingShippingAddress.asString());
	}
	
	// Get Only Teachers logged in Reading Club
	@When("^I am Calling Get Only Reading Club Teachers Service End Point$")
	public void I_am_Calling_Get_Only_Reading_Club_Teachers_Service_End_Point() throws Throwable 
	{
		String schoolId="411778";
		
		//ExtractableResponse<Response> getOnlyTeachers=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_ONLYTEACHERS, schoolId).
//				then()
//						.statusCode(200)
//						.spec(
								getOnlyTeachersResponseValidator();
//								)
//						.extract();				
		//System.out.println(getOnlyTeachers.asString());
	}
	
	// Get All Grades & Class Sizes
	@When("^I am Calling Get All Grades And Class Sizes Service End Point$")
	public void I_am_Calling_Get_All_Grades_And_Class_Sizes_Service_End_Point() throws Throwable 
	{
		String userId="88890958";
			
		//ExtractableResponse<Response> getAllGradeClassSize=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_ALLGRADECLASSSIZE, userId).
//				then()
//						.statusCode(200)
//						.spec(
								getAllGradeClassSizeResponseValidator();
//								)
//						.extract();				
		//System.out.println(getAllGradeClassSize.asString());
	}
	
	// Get All Credit Cards in a Wallet
	@When("^I am Calling Get All Credit Cards In Wallet Service End Point$")
	public void I_am_Calling_Get_All_Credit_Cards_In_Wallet_Service_End_Point() throws Throwable 
	{
		String userId="83931883";
			
		//ExtractableResponse<Response> getCreditCardsWallet=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_CRIDTCARDSWALLET, userId).
//				then()
//						.statusCode(200)
//						.spec(
								getCreditCardWalletResponseValidator();
//								)
//						.extract();		
		//System.out.println(getCreditCardsWallet.asString());
	}
	
	// Get All Existing Associated Social Media Accounts
	@When("^I am Calling Get All Existing Associated Social Media Accounts Service End Point$")
	public void I_am_Calling_Get_All_Existing_Associated_Social_Media_Accounts_Service_End_Point() throws Throwable 
	{
		String userId="83577405";
		
		//ExtractableResponse<Response> getExistingAssociatedSocialAccounts=
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_EXISTINGASSOCIATEDSOCIALACCOUNTS, userId).
//				then()
//						.statusCode(200)
//						.spec(
								getExistingAssociatedSocialAccountsResponseValidator();
//								)
//						.extract();		
		//System.out.println(getExistingAssociatedSocialAccounts.asString());
	}
	
	// Get All Child Users
	@When("^I am Calling Get All Child Users Service End Point$")
	public void I_am_Calling_Get_All_Child_Users_Service_End_Point() throws Throwable 
	{
		String childUserId="13494551";
		
		//ExtractableResponse<Response> getChildUsers=
		
//				given()
//						.param("clientId","SPSFacadeAPI").
//				when()
//						.get(ENDPOINT_CHILDUSERS, childUserId).
//				then()
//						.statusCode(200)
//						.spec(
								getChildUsersResponseValidator();
//								)
//						.extract();		
		//System.out.println(getChildUsers.asString());
	}
	
	@Then("^I should Get all (.*) in response.$")
	public void I_should_Get_all_States_in_response(String x) throws Throwable 
	{
	    	System.out.println(x);
			
	}
	
	//injected
	@Then("^this should return all Teachers$")
    public void this_should_return_all_Teachers() throws Throwable {
	    System.out.println("All Teachers");
    }
	
	//injected
	 @Then("^the result should be all schools by Zip Code$")
     public void the_result_should_be_all_schools_by_Zip_Code() throws Throwable {
	     System.out.println("Schools by Zip Code");
     }
	
	//injected
	@Then("^I must receive a list of schools corresponding to the zip code$")
    public void i_must_receive_a_list_of_schools_corresponding_to_the_zip_code() throws Throwable {
	    System.out.println("Schools by Zip Code");
     }

		
}
