package com.scholastic.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jayway.restassured.builder.ResponseSpecBuilder;


import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.is;

import com.jayway.restassured.specification.ResponseSpecification;

public class SpsWalletServiceSupportClass 
{// Login for Session Id and TSP Id
	public String user;
	public String password ="passed1";
	public boolean singleToken = true;
	public boolean userForWS = false;
	public boolean addCookie = true;
	public boolean addExpiration = true;
	public String sps_session;
	public String sps_tsp;
	public String userSPSID;
	public List<Integer> walletID=new ArrayList<Integer>();
	public Integer totalcreditcardCount;
	// ******* Teacher Info ********
	//public String title="MR";
	public String firstName="Alan";
	public String lastName="Field";
	public String email;
	public String schoolId="453926";
	public List<String> userType=new ArrayList<String>();
	public String teacherSPSID;
	// *******Add Credit Card *********
	public String   reqBillToAddressCountry="US";  
	public String   authAvsCode="Y";  
	public String   reqBillToPhone="7189916545";  
	public String   reqMerchantDefinedData35="anythingelse";  
	public String   reqCardNumber="411111xxxxxx1111";  
	public String   reqCardExpiryDate="03-2017";  
	public String   decision="ACCEPT";  
	public String   reqBillToAddressState="NY";  
	public String   signedFieldNames="transaction_id_XXX SET ALL";  
	//public String   reqMerchantDefinedData12;  
	public String   reqPaymentMethod="card";  
	public String   reqTransactionType="create_payment_token";  
	public String   authCode="831000";  
	public String   signature="XSDSSDSDFSDFSDFSDFDFDFdffDFDSDF";  
	public String   reqLocale="en";  
	public String   reasonCode="100";  
	public String   reqBillToAddressPostalCode="11372";  
	public String   reqBillToAddressLine2="line2";  
	public String   reqBillToAddressLine1="34-21 70th Street";  
	public String   reqCardType="001";  
	public String   authAmount="000";  
	public String   reqBillToAddressCity="Jackson Heights";  
	public String   signedDateTime="2015-06-09T21:17:33Z";  
	public String   reqCurrency="USD";  
	public String   reqMerchantDefinedData25="ADD";  
	public String   reqReferenceNumber="SCH_SDSDSDDS";  
	public String   reqMerchantDefinedData22="-1";  
	public String   reqMerchantDefinedData23="true";  
	public String   reqMerchantDefinedData21="true";  
	public String   authAvsCodeRaw="Y";  
	public String   transactionId="4333XXXXXXXXXX";  
	public String   authTime="2015-06XXXXX";  
	public String   message="request+was+processed+succesfully";  
	public String   authResponse="85";  
	// public String   reqConsumerId;  
	public String   reqProfileId="MAAWSQA1";  
	public String   reqTransactionUuId="b5sdfsdfdsfdsf";  
	public String   reqPaymentToken="01019648212121";  
	public String   authTransRefNo="WWNTYDFDFD";  
	//public String   reqBillToSurname;  
	//public String   reqBillToForename;  
	// public String   reqBillToEmail;  
	public String   accessKey="84854545454564564564public String";
			 
	// ********* Update Credit Card ************
	public String   u_reqCardExpiryDate="04-2018";
	public String   u_reqBillToAddressLine1="89-24 215th Street";
	public String   u_reqBillToAddressCity="Queens Village";
	public String   u_reqBillToAddressPostalCode="11427";	
	
	// ******** End Points **********
	protected static final String ENDPOINT_TEACHER_REGISTRATION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/?clientId=SPSFacadeAPI"; 
	public static final String ENDPOINT_ADD_CREDITCARD="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/cybersource/creditcard?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_GET_CREDITCARD="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/cybersource/creditcard?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_UPDATE_CREDITCARD="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/cybersource/creditcard/0?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_DELETE_CREDITCARD="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/cybersource/creditcard/0?clientId=SPSFacadeAPI";
	

	public String getEmail()
	{
		 String email="sps_qa"+String.valueOf(System.currentTimeMillis())+"@gamble.com";
		 return email;
	
	}
	
	public Map<String, Object> createLogInPayload()

	{
		Map<String, Object> createLogInInfo = new HashMap<String, Object>();
		createLogInInfo.put("user",user );
		createLogInInfo.put("password",password);
		createLogInInfo.put("singleToken",singleToken);
		createLogInInfo.put("userForWS", userForWS);
		createLogInInfo.put("addCookie",addCookie);
		createLogInInfo.put("addExpiration",addExpiration);
		return createLogInInfo;
	
	}
	
	public Map<String, Object> createTeacherPayload()
	
	{
		if(email==null)
		{
			email=getEmail();
		}
		Map<String, Object> teacherRegistrationInfo = new HashMap<String, Object>();
		teacherRegistrationInfo.put("firstName",firstName);
		teacherRegistrationInfo.put("lastName",lastName);
		teacherRegistrationInfo.put("email",email);
		userType.add("TEACHER");
		teacherRegistrationInfo.put("userType", userType);
		teacherRegistrationInfo.put("password",password);
		teacherRegistrationInfo.put("userName",email);
		teacherRegistrationInfo.put("schoolId",schoolId);
		return teacherRegistrationInfo;
		
	}
		
	public Map<String, Object> addCreditCardToWalletPayload()
	{					
		 Map<String, Object> addCreditCardInfo = new HashMap<String, Object>();
		 addCreditCardInfo.put("reqBillToAddressCountry",reqBillToAddressCountry);  
		 addCreditCardInfo.put("authAvsCode",authAvsCode);  
		 addCreditCardInfo.put("reqBillToPhone",reqBillToPhone);  
		 addCreditCardInfo.put("reqMerchantDefinedData35",reqMerchantDefinedData35);  
		 addCreditCardInfo.put("reqCardNumber",reqCardNumber);  
		 addCreditCardInfo.put("reqCardExpiryDate",reqCardExpiryDate);  
		 addCreditCardInfo.put("decision",decision);  
		 addCreditCardInfo.put("reqBillToAddressState",reqBillToAddressState);  
		 addCreditCardInfo.put("signedFieldNames",signedFieldNames);  
		 addCreditCardInfo.put("reqMerchantDefinedData12",userSPSID);  
		 addCreditCardInfo.put("reqPaymentMethod",reqPaymentMethod);  
		 addCreditCardInfo.put("reqTransactionType",reqTransactionType);  
		 addCreditCardInfo.put("authCode",authCode);  
		 addCreditCardInfo.put("signature",signature);  
		 addCreditCardInfo.put("reqLocale",reqLocale);  
		 addCreditCardInfo.put("reasonCode",reasonCode);  
		 addCreditCardInfo.put("reqBillToAddressPostalCode",reqBillToAddressPostalCode);  
		 addCreditCardInfo.put("reqBillToAddressLine2",reqBillToAddressLine2);  
		 addCreditCardInfo.put("reqBillToAddressLine1",reqBillToAddressLine1);  
		 addCreditCardInfo.put("reqCardType",reqCardType);  
		 addCreditCardInfo.put("authAmount",authAmount);  
		 addCreditCardInfo.put("reqBillToAddressCity",reqBillToAddressCity);  
		 addCreditCardInfo.put("signedDateTime",signedDateTime);  
		 addCreditCardInfo.put("reqCurrency",reqCurrency);  
		 addCreditCardInfo.put("reqMerchantDefinedData25",reqMerchantDefinedData25);  
		 addCreditCardInfo.put("reqReferenceNumber",reqReferenceNumber);  
		 addCreditCardInfo.put("reqMerchantDefinedData22",reqMerchantDefinedData22);  
		 addCreditCardInfo.put("reqMerchantDefinedData23",reqMerchantDefinedData23);  
		 addCreditCardInfo.put("reqMerchantDefinedData21",reqMerchantDefinedData21);  
		 addCreditCardInfo.put("authAvsCodeRaw",authAvsCodeRaw);  
		 addCreditCardInfo.put("transactionId",transactionId);  
		 addCreditCardInfo.put("authTime",authTime);  
		 addCreditCardInfo.put("message",message);  
		 addCreditCardInfo.put("authResponse",authResponse);  
		 addCreditCardInfo.put("reqConsumerId",userSPSID);  
		 addCreditCardInfo.put("reqProfileId",reqProfileId);  
		 addCreditCardInfo.put("reqTransactionUuId",reqTransactionUuId);  
		 addCreditCardInfo.put("reqPaymentToken",reqPaymentToken);  
		 addCreditCardInfo.put("authTransRefNo",authTransRefNo);  
		 addCreditCardInfo.put("reqBillToSurname",lastName);  
		 addCreditCardInfo.put("reqBillToForename",firstName);  
		 addCreditCardInfo.put("reqBillToEmail",email);  
		 addCreditCardInfo.put("accessKey",accessKey);
		 return addCreditCardInfo;
			
	}
		
	public ResponseSpecification createTeacherResponseValidator()

	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		//.expectBody("userName",equalTo(email))
		//.expectBody("modifiedDate",equalTo(""))
		//.expectBody("registrationDate",equalTo(new Date()))
		//.expectBody("schoolId",equalTo(schoolId))
		.expectBody("orgZip",is(not(empty())))
		//.expectBody("userType",equalTo(userType))
		.expectBody("isEducator",is(not(empty())))
		.expectBody("cac",is(not(empty())))
		.expectBody("cacId",is(not(empty())))
		.expectBody("isIdUsed",is(not(empty())))
		.expectBody("isEnabled",is(not(empty())))
		.expectBody("schoolUcn",is(not(empty())))
		//.expectBody("email",equalTo(email))
		//.expectBody("firstName",equalTo(firstName))
		//.expectBody("lastName",equalTo(lastName))
		//.expectBody("password",equalTo(password))
		.expectBody("spsId",is(not(empty())));
		return rspec.build();		
	}
		
	public ResponseSpecification getCreditCardResponseValidator()

	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("count",is(not(empty())))
		.rootPath("wallet");
		//.expectBody("id[0]",is(not(empty())))
		//.expectBody("ccmonth[0]",equalTo("03"))
		//.expectBody("cbspt[0]",equalTo("01019648212121"))
		//.expectBody("cnm[0]",is(not(empty())))
		//.expectBody("phoneExtNumber[0]",is(not(empty())))
		//.expectBody("email[0]",is(not(empty())))
		//.expectBody("zip[0]",equalTo("11372"))
		//.expectBody("firstName[0]",equalTo("Alan"))
		//.expectBody("address1[0]",equalTo("34-21 70th Street"))
		//.expectBody("address2[0]",equalTo("line2"))
		//.expectBody("ccBrand[0]",equalTo("V"))
		//.expectBody("phoneNumber[0]",equalTo("7189916545"))
		//.expectBody("lastName[0]",equalTo("Field"))
		//.expectBody("ccnumber[0]",equalTo("xxxxxxxxxxxx1111"))
		//.expectBody("city[0]",equalTo("Jackson Heights"))
		//.expectBody("success[0]",equalTo("test"))
		//.expectBody("default[0]",equalTo("true"))
		//.expectBody("state[0]",equalTo("NY"));
		return rspec.build();
	}	
}
