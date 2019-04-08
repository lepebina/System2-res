package com.scholastic.main;


import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jayway.restassured.builder.ResponseSpecBuilder;

import com.jayway.restassured.specification.ResponseSpecification;


public class SpsGradeClassSizeServiceSupportClass 
{
// Teacher Info
	public String teacherfirstName="Robert";
	public String teacherlastName="Sheehan";
	public String email;
	public String password="passed1";
	public String schoolId="163392";
	public List<String> userType1=new ArrayList<String>();
	public String teacherSPSID;
	//public boolean firstYearTeaching = true;
				
	//GradeClassSize Info
	public String grade="02";
	//public List<String> classSize=new ArrayList<String>();
	public String classSize="25";
	public String gradeclasssizeSPSID;
			
	//Update GradeClassSize Info
	public String grade1="04";
	public String classSize1="21";
								
//End Points
	public static final String ENDPOINT_TEACHER_REGISTRATION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_CREATE_GRADECLASSSIZE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsgradeclasssize/?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_GET_UPDATE_DELETE_GRADECLASSSIZE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsgradeclasssize/{spsId}?clientId=SPSFacadeAPI";
	
	public String getEmail()
	{
		email="sps_qa"+String.valueOf(System.currentTimeMillis())+"@sample.com";
		return email;
	}
	
	public Map<String, Object> createTeacherPayload()
	
	{
		Map<String, Object> teacherRegistrationInfo = new HashMap<String, Object>();
		teacherRegistrationInfo.put("firstName",teacherfirstName);
		teacherRegistrationInfo.put("lastName",teacherlastName);
		teacherRegistrationInfo.put("email",getEmail());
		userType1.add("TEACHER");
		teacherRegistrationInfo.put("userType", userType1);
		teacherRegistrationInfo.put("password",password);
		teacherRegistrationInfo.put("userName",email);
		teacherRegistrationInfo.put("schoolId",schoolId);
		return teacherRegistrationInfo;
		
	}

	public Map<String, Object> createGradeClassSizePayload()
			
	{
		Map<String, Object> gradeClassSizeInfo = new HashMap<String, Object>();
		gradeClassSizeInfo.put("grade",grade);
		gradeClassSizeInfo.put("classSize",classSize);
		gradeClassSizeInfo.put("spsUserId",teacherSPSID);
		return gradeClassSizeInfo;
		
	}
	
	public Map<String, Object> updateGradeClassSizePayload()
	
	{
		Map<String, Object> gradeClassSizeUpdateInfo = new HashMap<String, Object>();
		gradeClassSizeUpdateInfo.put("grade",grade1);
		gradeClassSizeUpdateInfo.put("classSize",classSize1);
		gradeClassSizeUpdateInfo.put("spsUserId",teacherSPSID);
		return gradeClassSizeUpdateInfo;
		
	}
	
	public ResponseSpecification createTeacherResponseValidator()
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		//.expectBody("userName",equalTo(email))
		//.expectBody("modifiedDate",equalTo(""))
		//.expectBody("registrationDate",equalTo(new Date()))
		//.expectBody("schoolId",equalTo(schoolId))
		.expectBody("orgZip",is(not(empty())))
		//.expectBody("userType",equalTo(userType1))
		.expectBody("isEducator",is(not(empty())))
		.expectBody("cac",is(not(empty())))
		.expectBody("cacId",is(not(empty())))
		.expectBody("isIdUsed",is(not(empty())))
		.expectBody("isEnabled",is(not(empty())))
		.expectBody("schoolUcn",is(not(empty())))
		//.expectBody("email",equalTo(email))
		//.expectBody("firstName",equalTo(teacherfirstName))
		//.expectBody("lastName",equalTo(teacherlastName))
		//.expectBody("password",equalTo(password))
		.expectBody("spsId",is(not(empty())));
		return rspec.build();		
	}
	
	public ResponseSpecification createGradeClassSizeResponseValidator()
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		//.expectBody("grade",equalTo(grade))
		.expectBody("classSize",equalTo(classSize))
		.expectBody("spsUserId",equalTo(teacherSPSID))
		.expectBody("spsId",is(not(empty())));
		return rspec.build();		
	}
	
	public ResponseSpecification updateGradeClassSizeResponseValidator()
	
	//Light Parent Registration Validation
	{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			//.expectBody("grade",equalTo(grade1))
			.expectBody("classSize",equalTo(classSize1))
			.expectBody("spsUserId",equalTo(teacherSPSID))
			.expectBody("spsId",is(not(empty())));
			return rspec.build();		
	}
}
