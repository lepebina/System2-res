package com.scholastic.main;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.jayway.restassured.builder.ResponseSpecBuilder;

import com.jayway.restassured.specification.ResponseSpecification;


public class SpsSchoolEditServiceSupportClass 
{
	//Login for Session Id and TSP Id
		public String user;
		public String password ="passed1";
		public boolean singleToken = true;
		public boolean userForWS = false;
		public boolean addCookie = true;
		public boolean addExpiration = true;
		public String sps_session;
		public String sps_tsp;
		public String userSPSID;
		
		
		//public String title="MR";
		public String firstName="Eric";
		public String lastName="Jackson";
		public String email;
		public String schoolId="453926";
		public String i_schoolSPSID="30152192";
		public List<String> userType=new ArrayList<String>();
		public String teacherSPSID;
		
		//Home School
		public String h_name ="Home School Inc. 2015";
		public String h_address1 ="568 Broadway";
		public String h_address2 ="";
		public String h_address3 ="";
		public String h_address4 ="";
		public String h_address5 ="";
		public String h_city ="NYC";
		public String h_state ="NY";
		public String h_zipcode ="10012";
		public String h_country ="";
		public String h_poBox ="";
		public String h_county ="";
		public String h_phone ="2123438565";
		public String h_reportingSchoolType ="HOS";
		public String h_schoolSPSID;
		
		//Manual School
		public String m_name ="Manual School Inc. 2016";
		public String m_address1 ="550 Broadway";
		public String m_address2 ="";
		public String m_address3 ="";
		public String m_address4 ="";
		public String m_address5 ="";
		public String m_city ="NYC";
		public String m_state ="NY";
		public String m_zipcode ="10012";
		public String m_country ="";
		public String m_poBox ="";
		public String m_county ="";
		public String m_phone ="2123434535";
		public String m_reportingSchoolType ="PS";
		public String m_schoolSPSID;
		
		//Review School
		public String r_spsId="";
		public String r_name ="Sch Inc.";
		public String r_schoolUCN="";
		public String r_borderId="";
		public String r_address1 ="568 Broadway";
		public String r_address2 ="";
		public String r_address3 ="";
		public String r_address4 ="";
		public String r_address5 ="";
		public String r_city ="NYC";
		public String r_state ="NY";
		public String r_creditCardState ="";
		public String r_zipcode ="10012";
		public String r_country ="";
		public String r_poBox ="";
		public String r_county ="";
		public String r_phone ="2123436100";
		public String r_schoolNote ="";
		public String r_schoolStatus="";
		public String r_groupType="";
		public String r_internatIonalDomestIcCode="";
		public String r_publicPrivateKey="";
		public String r_uspsTypeCode="0";
		public String r_addressTypeCode="";
		public String r_lastModifiedDate="";
		public String r_modifiedDate="";
		public String r_createdSource="";
		public String r_createDate="";
		public String r_reportingSchoolType ="";
		public String r_survivingUcn="";
		
			
		//End Points
		public static final String ENDPOINT_TEACHER_REGISTRATION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_CHANGE_SCHOOL="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/spsorganization?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_CREATE_SCHOOL="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsorganization/?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_REVIEW_SCHOOL="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsorganization/{spsId}/reviewschooladdress?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_GET_SCHOOL="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
		
		public String getEmail()
		{
			email="sps_qa"+String.valueOf(System.currentTimeMillis())+"@sample.com";
			return email;
		
		}
			
		public Map<String, Object> createLogInPayload()

		{
			Map<String, Object> createLogInInfo = new HashMap<String, Object>();
			createLogInInfo.put("user",user);
			createLogInInfo.put("password",password);
			createLogInInfo.put("singleToken",singleToken);
			createLogInInfo.put("userForWS", userForWS);
			createLogInInfo.put("addCookie",addCookie);
			createLogInInfo.put("addExpiration",addExpiration);
			//System.out.println("!!!!!!!!!!!!!"+createLogInInfo.toString());
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
			teacherRegistrationInfo.put("email",getEmail());
			userType.add("TEACHER");
			teacherRegistrationInfo.put("userType", userType);
			teacherRegistrationInfo.put("password",password);
			teacherRegistrationInfo.put("userName",email);
			teacherRegistrationInfo.put("schoolId",schoolId);
			return teacherRegistrationInfo;
				
		}
			
		public Map<String, Object> changedToInternationalSchoolPayload()
			
		{
			Map<String, Object> existingInternationalSchoolInfo = new HashMap<String, Object>();
			existingInternationalSchoolInfo.put("spsId",i_schoolSPSID);
			return existingInternationalSchoolInfo;
		}
		
		public Map<String, Object> createHomeSchoolPayload()
		
		{
			Map<String, Object> createHomeSchoolInfo = new HashMap<String, Object>();
			createHomeSchoolInfo.put("name",h_name );
			createHomeSchoolInfo.put("address1",h_address1);
			createHomeSchoolInfo.put("address2",h_address2);
			createHomeSchoolInfo.put("address3", h_address3);
			createHomeSchoolInfo.put("address4",h_address4);
			createHomeSchoolInfo.put("address5",h_address5);
			createHomeSchoolInfo.put("city",h_city);
			createHomeSchoolInfo.put("state", h_state);
			createHomeSchoolInfo.put("zipcode",h_zipcode);
			createHomeSchoolInfo.put("country",h_country);
			createHomeSchoolInfo.put("poBox",h_poBox);
			createHomeSchoolInfo.put("county",h_county);
			createHomeSchoolInfo.put("phone", h_phone);
			createHomeSchoolInfo.put("reportingSchoolType",h_reportingSchoolType);
			return createHomeSchoolInfo;
			
		}
		
		public Map<String, Object> changedToHomeSchoolPayload()
		
		{
			Map<String, Object> homeSchoolInfo = new HashMap<String, Object>();
			homeSchoolInfo.put("spsId",h_schoolSPSID);
			return homeSchoolInfo;
			
		}
		
		public Map<String, Object> createManualSchoolPayload()
		
		{
			Map<String, Object> createManualSchoolInfo = new HashMap<String, Object>();
			createManualSchoolInfo.put("name",m_name );
			createManualSchoolInfo.put("address1",m_address1);
			createManualSchoolInfo.put("address2",m_address2);
			createManualSchoolInfo.put("address3", m_address3);
			createManualSchoolInfo.put("address4",m_address4);
			createManualSchoolInfo.put("address5",m_address5);
			createManualSchoolInfo.put("city",m_city);
			createManualSchoolInfo.put("state", m_state);
			createManualSchoolInfo.put("zipcode",m_zipcode);
			createManualSchoolInfo.put("country",m_country);
			createManualSchoolInfo.put("poBox",m_poBox);
			createManualSchoolInfo.put("county",m_county);
			createManualSchoolInfo.put("phone", m_phone);
			createManualSchoolInfo.put("reportingSchoolType",m_reportingSchoolType);
			return createManualSchoolInfo;
			
		}
		
		public Map<String, Object> changedToManualSchoolPayload()
		
		{
			Map<String, Object> manualSchoolInfo = new HashMap<String, Object>();
			manualSchoolInfo.put("spsId",m_schoolSPSID);
			return manualSchoolInfo;
			
		}
		
		public Map<String, Object> sendSchoolInfoForReviewPayload()
		
		{
			Map<String, Object> reviewSchoolInfo = new HashMap<String, Object>();
			reviewSchoolInfo.put("spsId",r_spsId);
			reviewSchoolInfo.put("name",r_name );
			reviewSchoolInfo.put("schoolUCN",r_schoolUCN );
			reviewSchoolInfo.put("borderId",r_borderId );
			reviewSchoolInfo.put("address1",r_address1);
			reviewSchoolInfo.put("address2",r_address2);
			reviewSchoolInfo.put("address3", r_address3);
			reviewSchoolInfo.put("address4",r_address4);
			reviewSchoolInfo.put("address5",r_address5);
			reviewSchoolInfo.put("city",r_city);
			reviewSchoolInfo.put("state", r_state);
			reviewSchoolInfo.put("creditCardState", r_creditCardState);
			reviewSchoolInfo.put("zipcode",r_zipcode);
			reviewSchoolInfo.put("country",r_country);
			reviewSchoolInfo.put("poBox",r_poBox);
			reviewSchoolInfo.put("county",r_county);
			reviewSchoolInfo.put("phone", r_phone);
			reviewSchoolInfo.put("schoolNote", r_schoolNote);
			reviewSchoolInfo.put("schoolStatus", r_schoolStatus);
			reviewSchoolInfo.put("groupType", r_groupType);
			reviewSchoolInfo.put("internatIonalDomestIcCode", r_internatIonalDomestIcCode);
			reviewSchoolInfo.put("publicPrivateKey", r_publicPrivateKey);
			reviewSchoolInfo.put("uspsTypeCode", r_uspsTypeCode);
			reviewSchoolInfo.put("addressTypeCode", r_addressTypeCode);
			reviewSchoolInfo.put("lastModifiedDate", r_lastModifiedDate);
			reviewSchoolInfo.put("modifiedDate", r_modifiedDate);
			reviewSchoolInfo.put("createdSource", r_createdSource);
			reviewSchoolInfo.put("createDate", r_createDate);
			reviewSchoolInfo.put("reportingSchoolType",r_reportingSchoolType);
			reviewSchoolInfo.put("survivingUcn", r_survivingUcn);
			return reviewSchoolInfo;
			
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

		public ResponseSpecification changedToInternationalSchoolResponseValidator()

		{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			.expectBody("spsId",equalTo(teacherSPSID));
			//.expectBody("schoolId",equalTo(i_schoolSPSID));
			return rspec.build();		
		}
		
		public ResponseSpecification createHomeSchoolResponseValidator()
		
		{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			.expectBody("name",equalTo("Home School Inc. 2015"))
			.expectBody("address1",equalTo("568 Broadway"))
			.expectBody("address2",isEmptyString())
			.expectBody("address3",isEmptyString())
			.expectBody("address4",isEmptyString())
			.expectBody("address5",isEmptyString())
			.expectBody("city",equalTo("NYC"))
			.expectBody("state",equalTo("NY"))
			.expectBody("country",isEmptyString())
			.expectBody("poBox",isEmptyString())
			.expectBody("phone",equalTo("2123438565"))
			.expectBody("reportingSchoolType",equalTo("HOS"));
			return rspec.build();
		}
		
		public ResponseSpecification changedToHomeSchoolResponseValidator()

		{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			.expectBody("spsId",equalTo(teacherSPSID));
			//.expectBody("schoolId",equalTo(h_schoolSPSID));
			return rspec.build();		
		}
		
		public ResponseSpecification createManualSchoolResponseValidator()
		
		{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			.expectBody("name",equalTo("Manual School Inc. 2016"))
			.expectBody("address1",equalTo("550 Broadway"))
			.expectBody("address2",isEmptyString())
			.expectBody("address3",isEmptyString())
			.expectBody("address4",isEmptyString())
			.expectBody("address5",isEmptyString())
			.expectBody("city",equalTo("NYC"))
			.expectBody("state",equalTo("NY"))
			.expectBody("country",isEmptyString())
			.expectBody("poBox",isEmptyString())
			.expectBody("phone",equalTo("2123434535"))
			.expectBody("reportingSchoolType",equalTo("PS"));
			return rspec.build();
		}
		
		public ResponseSpecification changedToManualSchoolResponseValidator()

		{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			.expectBody("spsId",equalTo(teacherSPSID));
			//.expectBody("schoolId",equalTo(m_schoolSPSID));
			return rspec.build();
		}
}
