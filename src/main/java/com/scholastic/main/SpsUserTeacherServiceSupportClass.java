package com.scholastic.main;


import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jayway.restassured.builder.ResponseSpecBuilder;

import com.jayway.restassured.specification.ResponseSpecification;

public class SpsUserTeacherServiceSupportClass 
{
	//public String title="MR";
	public String firstName="Top";
	public String lastName="Barel";
	public String email;
	public String password="passed1";
	public String schoolId="453926";
	public List<String> userType=new ArrayList<String>();
	public String teacherSPSID;
	public String displayName="TopSecret";
	public List<String> subjectInterest=new ArrayList<String>();
	public List<String> gradesRecommended=new ArrayList<String>();
	public List<String> interesParent=new ArrayList<String>();
	public String parentPrimaryRole="2";
	public String userName;
			
	public static final String ENDPOINT_TEACHER_REGISTRATION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_TEACHER_GET="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_TEACHER_UPDATE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_TEACHER_DELETE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
			
	public String getEmail()
	{
		email="sps_qa"+String.valueOf(System.currentTimeMillis())+"@mobile.com";
		return email;
	}
				
	public Map<String, Object> createTeacherPayload()
	{
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
				
	public Map<String, Object> updateTeacherPayload()
	{
		Map<String, Object> updateTeacherInfo = new HashMap<String, Object>();
		updateTeacherInfo.put("displayName",displayName);
		subjectInterest.add("5");
		subjectInterest.add("6");
		updateTeacherInfo.put("subjectInterest", subjectInterest);
		gradesRecommended.add("3");
		gradesRecommended.add("4");
		updateTeacherInfo.put("gradesRecommended", gradesRecommended);
		interesParent.add("1");
		interesParent.add("2");
		updateTeacherInfo.put("interesParent", interesParent);
		updateTeacherInfo.put("parentPrimaryRole",parentPrimaryRole);
		return updateTeacherInfo;
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
				
	public ResponseSpecification createTeacherUpdateResponseValidator()
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		//.expectBody("userName",equalTo(email))
		//.expectBody("modifiedDate",equalTo(""))
		//.expectBody("registrationDate",equalTo(new Date()))
		//.expectBody("displayName",equalTo(displayName))
		//.expectBody("subjectInterest",equalTo(subjectInterest))
		//.expectBody("gradesRecommended",equalTo(gradesRecommended))
		//.expectBody("interesParent",equalTo(interesParent))
		//.expectBody("parentPrimaryRole",equalTo(parentPrimaryRole))
		.expectBody("spsId",is(not(empty())));
		return rspec.build();		
	}		
}
