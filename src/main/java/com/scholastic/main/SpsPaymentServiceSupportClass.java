package com.scholastic.main;



import java.util.HashMap;
import java.util.Map;




public class SpsPaymentServiceSupportClass 
{
	
	//Login for Session Id and TSP Id
			public String user ="qatestsample@juno1.com";
			//public String user1 ="print38sample@scholastic.com";
			public String user1 ="sps_qa1450453570124@sample.com";
			public String password ="passed1";
			public boolean singleToken = true;
			public boolean userForWS = false;
			public boolean addCookie = true;
			public boolean addExpiration = true;
			public String sps_session;
			public String sps_tsp;
			public String userSPSID;
			
			
			//Capture Payment Info
			public String reqCardNumber="411111xxxxxx1111";
			public String reqPaymentToken="0001177062611111";
			public String reqCardExpiryDate="03-2017";
			public String reqAccessKey="3613e1d4d11c33dbbf5370ee90d188a0";
			public String reqBillToEmail="qatestsample@juno1.com";
			public String signedFieldNames="transaction_id,decision,req_access_key,req_profile_id,req_transaction_uuid,req_transaction_type,req_reference_number,req_amount,req_currency,req_locale,req_payment_method,req_payment_token,req_consumer_id,req_bill_to_forename,req_bill_to_surname,req_bill_to_email,req_bill_to_phone,req_bill_to_address_line1,req_bill_to_address_city,req_bill_to_address_state,req_bill_to_address_country,req_bill_to_address_postal_code,req_card_number,req_card_type,req_card_expiry_date,req_merchant_defined_data32,req_merchant_defined_data35,message,reason_code,auth_avs_code,auth_avs_code_raw,auth_response,auth_amount,auth_code,auth_trans_ref_no,auth_time,bill_trans_ref_no,signed_field_names,signed_date_time";
			public String authAvsCode="Y";
			public String decision="ACCEPT";
			public String signature="zLJKnRRr9QGgyzkAPfLKu1+94JjIG0ClBsdmiaA6I6g=";
			public String reqBillToPhone="3024568967";
			public String reasonCode="100";
			public String signedDateTime="2015-07-08T17:19:18Z";
			public String reqCurrency="USD";
			public String message="request+was+processed+succesfully";
			public String authTransRefNo="WWNTOBO0Q5QL";
			public String reqPaymentMethod="card";
			public String transactionId="4362997513055000001MZR";
			public String reqProfileId="MAAWSPSQA1";
			//public String reqConsumerId;
			public String authResponse="00";
			public String reqTransactionUuId="9bef93ae-e783-49bd-bffe-0700834601e0";
			public String reqBillToSurname="Singh";
			public String reqBillTransRefNo="11903606";
			public String reqBillToForename="Ranvir";
			public String reqBillToAddressCountry="US";
			public String reqMerchantDefinedData35="anythingelse";
			public String authTime="2015-07-07T200912Z";
			public String reqTransactionType="sale";
			public String reqLocale="en";
			public String authAmount="3.21";
			public String reqReferenceNumber="SCH_SPS_MA2_1436297997535";
			public String authAvsCodeRaw="Y";
			public String authCode="831000";
			public String reqCardType="001";
			public String reqMerchantDefinedData32="true";
			public String reqAmount="3.21";
			public String reqBillToAddressCity="Westland";
			public String reqBillToAddressLine1="33241 Creston Street";
			public String reqBillToAddressLine2="line2";
			public String reqBillToAddressState="MI";
			public String reqBillToAddressPostalCode="48186";
			
			//Sign a Payment
			public String cardNumber="4111111111111111";
			public String paymentPartial="3.21";
			public String partial="partial";
			public String paymentFull="1,133.02";
			
			//Add Credit Card to Subscription
			//public String userSPSID1="83245877";
			public String reqCardNumber1="411111xxxxxx1111";
			public String reqPaymentToken1="01019648212121";
			public String reqCardExpiryDate1="03-2017";
			public String reqAccessKey1="84854545454564564564";
			public String reqBillToEmail1;
			public String signedFieldNames1="transaction_id,decision,req_access";
			public String authAvsCode1="Y";
			public String decision1="ACCEPT";
			public String reqMerchantDefinedData11="100260033";
			public String reqMerchantDefinedData10="X";
			public String reqMerchantDefinedData19="5016001";
			public String signature1="CC2YUshjdhdsFRdsdds96856565sd656sd5";
			public String requestToken1="dsfdsfsdfsdfdsfcxvcxvcxvcv";
			public String reqBillToPhone1="5163216548";
			public String reasonCode1="100";
			public String signedDateTime1="2015-06-09T21:17:33Z";
			public String reqCurrency1="USD";
			public String message1="request+was+processed+succesfully";
			public String authTransRefNo1="WWNTYDFDFD";
			public String reqPaymentMethod1="card";
			public String transactionId1="4333XXXXXXXXXX";
			public String reqProfileId1="MAAWSQA1";
			//public String reqConsumerId="83245877";
			public String authResponse1="85";
			public String reqTransactionUuId1="b5sdfsdfdsfdsf";
			public String reqBillToSurname1="ROBERT";
			public String reqBillToForename1="KENT";
			public String reqBillToAddressCountry1="US";
			public String reqMerchantDefinedData35a="any data to send";
			public String reqMerchantDefinedData30a="true";
			public String reqMerchantDefinedData9a="101";
			public String reqMerchantDefinedData27a="356";
			public String reqMerchantDefinedData25a="ADD";
			public String reqMerchantDefinedData22a="-1";
			public String reqMerchantDefinedData23a="true";
			public String reqMerchantDefinedData20a="OTC";
			public String reqMerchantDefinedData21a="true";
			public String reqMerchantDefinedData12a="8654438";
			public String authTime1="2015-06XXXXX";
			public String reqTransactionType1="create_payment_token";
			public String reqLocale1="en";
			public String authAmount1="0.00";
			public String authAvsCodeRaw1="Y";
			public String authCode1="831000";
			public String reqCardType1="001";
			public String reqBillToAddressCity1="South Floral Park";
			public String reqBillToAddressLine1a="floral park";
			public String reqBillToAddressLine2a="line2";
			public String reqBillToAddressState1="NY";
			public String reqBillToAddressPostalCode1="11001";
			
			
			
			//Update Credit Card to Subscription
			public String reqCardExpiryDate2="04-2017";
			public String reqBillToSurname2="GEORGE";
			public String reqBillToForename2="HORN";
			public String reqMerchantDefinedData25b="EDIT";
			public String reqBillToAddressCity2="JACKSON HEIGHTS";
			public String reqBillToAddressLine1b="74-22 35th Ave";
			public String reqBillToAddressLine2b="line2";
			public String reqBillToAddressState2="NY";
			public String reqBillToAddressPostalCode2="11372";
			public String reqReferenceNumber2="0";
			public String reqMerchantDefinedData22b="1";
			
			
			
					
			//End Points
			public static final String ENDPOINT_CAPTURE_PAYMENT="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/cybersource/makePayment?clientId=SPSFacadeAPI";
			public static final String ENDPOINT_SIGN_PAYMENT="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/cybersource/sign/sale?clientId=SPSFacadeAPI";
			public static final String ENDPOINT_ADDCREDITCARD_SUBSCRIPTION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/cybersource/creditcard/subs?clientId=SPSFacadeAPI";
			public static final String ENDPOINT_EDITCREDITCARD_SUBSCRIPTION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/cybersource/creditcard/1/subs?clientId=SPSFacadeAPI";

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
			
			public Map<String, Object> createLogInSubsPayload()

			{
				Map<String, Object> createLogInSubsInfo = new HashMap<String, Object>();
				createLogInSubsInfo.put("user",user1 );
				createLogInSubsInfo.put("password",password);
				createLogInSubsInfo.put("singleToken",singleToken);
				createLogInSubsInfo.put("userForWS", userForWS);
				createLogInSubsInfo.put("addCookie",addCookie);
				createLogInSubsInfo.put("addExpiration",addExpiration);
				return createLogInSubsInfo;
			
			}

			public Map<String, Object> createCapturePaymentPayload()
					
			{
				Map<String, Object> capturePaymentInfo = new HashMap<String, Object>();
				capturePaymentInfo.put("reqCardNumber",reqCardNumber); 
				capturePaymentInfo.put("reqPaymentToken",reqPaymentToken); 
				capturePaymentInfo.put("reqCardExpiryDate",reqCardExpiryDate); 
				capturePaymentInfo.put("reqAccessKey",reqAccessKey); 
				capturePaymentInfo.put("reqBillToEmail",user); 
				capturePaymentInfo.put("signedFieldNames",signedFieldNames);
				capturePaymentInfo.put("authAvsCode",authAvsCode); 
				capturePaymentInfo.put("decision",decision);
				capturePaymentInfo.put("signature",signature); 
				capturePaymentInfo.put("reqBillToPhone",reqBillToPhone); 
				capturePaymentInfo.put("reasonCode",reasonCode); 
				capturePaymentInfo.put("signedDateTime",signedDateTime); 
				capturePaymentInfo.put("reqCurrency",reqCurrency); 
				capturePaymentInfo.put("message",message); 
				capturePaymentInfo.put("authTransRefNo",authTransRefNo); 
				capturePaymentInfo.put("reqPaymentMethod",reqPaymentMethod); 
				capturePaymentInfo.put("transactionId",transactionId); 
				capturePaymentInfo.put("reqProfileId",reqProfileId); 
				capturePaymentInfo.put("reqConsumerId",userSPSID); 
				capturePaymentInfo.put("authResponse",authResponse);
				capturePaymentInfo.put("reqTransactionUuId",reqTransactionUuId); 
				capturePaymentInfo.put("reqBillToSurname",reqBillToSurname);
				capturePaymentInfo.put("reqBillTransRefNo",reqBillTransRefNo);
				capturePaymentInfo.put("reqBillToForename",reqBillToForename); 
				capturePaymentInfo.put("reqBillToAddressCountry",reqBillToAddressCountry);
				capturePaymentInfo.put("reqMerchantDefinedData35",reqMerchantDefinedData35); 
				capturePaymentInfo.put("authTime",authTime); 
				capturePaymentInfo.put("reqTransactionType",reqTransactionType); 
				capturePaymentInfo.put("reqLocale",reqLocale);
				capturePaymentInfo.put("authAmount",authAmount);
				capturePaymentInfo.put("reqReferenceNumber",reqReferenceNumber);
				capturePaymentInfo.put("authAvsCodeRaw",authAvsCodeRaw); 
				capturePaymentInfo.put("authCode",authCode); 
				capturePaymentInfo.put("reqCardType",reqCardType);
				capturePaymentInfo.put("reqMerchantDefinedData32",reqMerchantDefinedData32);
				capturePaymentInfo.put("reqAmount",reqAmount);
				capturePaymentInfo.put("reqBillToAddressCity",reqBillToAddressCity); 
				capturePaymentInfo.put("reqBillToAddressLine1",reqBillToAddressLine1); 
				capturePaymentInfo.put("reqBillToAddressLine2",reqBillToAddressLine2); 
				capturePaymentInfo.put("reqBillToAddressState",reqBillToAddressState); 
				capturePaymentInfo.put("reqBillToAddressPostalCode",reqBillToAddressPostalCode);
				return capturePaymentInfo;
				
			}
			
			public Map<String, Object> addCreditCardToSubscriptionPayload()
			
			{
				Map<String, Object> addCreditCardToSubsInfo = new HashMap<String, Object>();
				addCreditCardToSubsInfo.put("reqCardNumber",reqCardNumber1);
				addCreditCardToSubsInfo.put("reqPaymentToken",reqPaymentToken1);
				addCreditCardToSubsInfo.put("reqCardExpiryDate",reqCardExpiryDate1);
				addCreditCardToSubsInfo.put("reqAccessKey",reqAccessKey1);
				addCreditCardToSubsInfo.put("reqBillToEmail",user1);
				addCreditCardToSubsInfo.put("signedFieldNames",signedFieldNames1);
				addCreditCardToSubsInfo.put("authAvsCode",authAvsCode1);
				addCreditCardToSubsInfo.put("decision",decision1);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData11",reqMerchantDefinedData11);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData10",reqMerchantDefinedData10);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData19",reqMerchantDefinedData19);
				addCreditCardToSubsInfo.put("signature",signature1);
				addCreditCardToSubsInfo.put("requestToken",requestToken1);
				addCreditCardToSubsInfo.put("reqBillToPhone",reqBillToPhone1);
				addCreditCardToSubsInfo.put("reasonCode",reasonCode1);
				addCreditCardToSubsInfo.put("signedDateTime",signedDateTime1);
				addCreditCardToSubsInfo.put("reqCurrency",reqCurrency1);
				addCreditCardToSubsInfo.put("message",message1);
				addCreditCardToSubsInfo.put("authTransRefNo",authTransRefNo1);
				addCreditCardToSubsInfo.put("reqPaymentMethod",reqPaymentMethod1);
				addCreditCardToSubsInfo.put("transactionId",transactionId1);
				addCreditCardToSubsInfo.put("reqProfileId",reqProfileId1);
				addCreditCardToSubsInfo.put("reqConsumerId",userSPSID);
				addCreditCardToSubsInfo.put("authResponse",authResponse1);
				addCreditCardToSubsInfo.put("reqTransactionUuId",reqTransactionUuId1);
				addCreditCardToSubsInfo.put("reqBillToSurname",reqBillToSurname1);
				addCreditCardToSubsInfo.put("reqBillToForename",reqBillToForename1);
				addCreditCardToSubsInfo.put("reqBillToAddressCountry",reqBillToAddressCountry1);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData35",reqMerchantDefinedData35a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData30",reqMerchantDefinedData30a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData9",reqMerchantDefinedData9a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData27",reqMerchantDefinedData27a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData25",reqMerchantDefinedData25a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData22",reqMerchantDefinedData22a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData23",reqMerchantDefinedData23a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData20",reqMerchantDefinedData20a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData21",reqMerchantDefinedData21a);
				addCreditCardToSubsInfo.put("reqMerchantDefinedData12",reqMerchantDefinedData12a);
				addCreditCardToSubsInfo.put("authTime",authTime1);
				addCreditCardToSubsInfo.put("reqTransactionType",reqTransactionType1);
				addCreditCardToSubsInfo.put("reqLocale",reqLocale1);
				addCreditCardToSubsInfo.put("authAmount",authAmount1);
				addCreditCardToSubsInfo.put("authAvsCodeRaw",authAvsCodeRaw1);
				addCreditCardToSubsInfo.put("authCode",authCode1);
				addCreditCardToSubsInfo.put("reqCardType",reqCardType1);
				addCreditCardToSubsInfo.put("reqBillToAddressCity",reqBillToAddressCity1);
				addCreditCardToSubsInfo.put("reqBillToAddressLine1",reqBillToAddressLine1a);
				addCreditCardToSubsInfo.put("reqBillToAddressLine2",reqBillToAddressLine2a);
				addCreditCardToSubsInfo.put("reqBillToAddressState",reqBillToAddressState1);
				addCreditCardToSubsInfo.put("reqBillToAddressPostalCode",reqBillToAddressPostalCode1);
				return addCreditCardToSubsInfo;
				
			}
			
	public Map<String, Object> editCreditCardToSubscriptionPayload()
			
			{
				Map<String, Object> editCreditCardToSubsInfo = new HashMap<String, Object>();
				editCreditCardToSubsInfo.put("reqCardNumber",reqCardNumber1);
				editCreditCardToSubsInfo.put("reqPaymentToken",reqPaymentToken1);
				editCreditCardToSubsInfo.put("reqCardExpiryDate",reqCardExpiryDate2);
				editCreditCardToSubsInfo.put("reqAccessKey",reqAccessKey1);
				editCreditCardToSubsInfo.put("reqBillToEmail",user1);
				editCreditCardToSubsInfo.put("signedFieldNames",signedFieldNames1);
				editCreditCardToSubsInfo.put("authAvsCode",authAvsCode1);
				editCreditCardToSubsInfo.put("decision",decision1);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData11",reqMerchantDefinedData11);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData10",reqMerchantDefinedData10);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData19",reqMerchantDefinedData19);
				editCreditCardToSubsInfo.put("signature",signature1);
				editCreditCardToSubsInfo.put("requestToken",requestToken1);
				editCreditCardToSubsInfo.put("reqBillToPhone",reqBillToPhone1);
				editCreditCardToSubsInfo.put("reasonCode",reasonCode1);
				editCreditCardToSubsInfo.put("signedDateTime",signedDateTime1);
				editCreditCardToSubsInfo.put("reqCurrency",reqCurrency1);
				editCreditCardToSubsInfo.put("message",message1);
				editCreditCardToSubsInfo.put("authTransRefNo",authTransRefNo1);
				editCreditCardToSubsInfo.put("reqPaymentMethod",reqPaymentMethod1);
				editCreditCardToSubsInfo.put("transactionId",transactionId1);
				editCreditCardToSubsInfo.put("reqProfileId",reqProfileId1);
				editCreditCardToSubsInfo.put("reqConsumerId",userSPSID);
				editCreditCardToSubsInfo.put("authResponse",authResponse1);
				editCreditCardToSubsInfo.put("reqTransactionUuId",reqTransactionUuId1);
				editCreditCardToSubsInfo.put("reqBillToSurname",reqBillToSurname2);
				editCreditCardToSubsInfo.put("reqBillToForename",reqBillToForename2);
				editCreditCardToSubsInfo.put("reqBillToAddressCountry",reqBillToAddressCountry1);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData35",reqMerchantDefinedData35a);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData30",reqMerchantDefinedData30a);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData9",reqMerchantDefinedData9a);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData27",reqMerchantDefinedData27a);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData25",reqMerchantDefinedData25b);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData22",reqMerchantDefinedData22b);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData23",reqMerchantDefinedData23a);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData20",reqMerchantDefinedData20a);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData21",reqMerchantDefinedData21a);
				editCreditCardToSubsInfo.put("reqMerchantDefinedData12",reqMerchantDefinedData12a);
				editCreditCardToSubsInfo.put("authTime",authTime1);
				editCreditCardToSubsInfo.put("reqTransactionType",reqTransactionType1);
				editCreditCardToSubsInfo.put("reqLocale",reqLocale1);
				editCreditCardToSubsInfo.put("authAmount",authAmount1);
				editCreditCardToSubsInfo.put("authAvsCodeRaw",authAvsCodeRaw1);
				editCreditCardToSubsInfo.put("authCode",authCode1);
				editCreditCardToSubsInfo.put("reqCardType",reqCardType1);
				editCreditCardToSubsInfo.put("reqBillToAddressCity",reqBillToAddressCity2);
				editCreditCardToSubsInfo.put("reqBillToAddressLine1",reqBillToAddressLine1b);
				editCreditCardToSubsInfo.put("reqBillToAddressLine2",reqBillToAddressLine2b);
				editCreditCardToSubsInfo.put("reqBillToAddressState",reqBillToAddressState2);
				editCreditCardToSubsInfo.put("reqBillToAddressPostalCode",reqBillToAddressPostalCode2);
				editCreditCardToSubsInfo.put("reqReferenceNumber",reqReferenceNumber2);
				return editCreditCardToSubsInfo;

				
			}
			
			
			public Map<String, Object> createSignPaymentPayload()
			
			{
				Map<String, Object> signPaymentInfo = new HashMap<String, Object>();
				signPaymentInfo.put("cardNumber",cardNumber);
				signPaymentInfo.put("paymentPartial",paymentPartial);
				signPaymentInfo.put("partial",partial);
				signPaymentInfo.put("paymentFull",paymentFull);
				return signPaymentInfo;
				
			}
}
