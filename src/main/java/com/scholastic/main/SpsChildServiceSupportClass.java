package com.scholastic.main;


import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import com.jayway.restassured.builder.ResponseSpecBuilder;

import com.jayway.restassured.specification.ResponseSpecification;

public class SpsChildServiceSupportClass 
{
	//Child
		//public String title="MR";
		public String childfirstName="Tim";
		public String childlastName="Green";
		public String childbirthYear="2005";
		public String childbirthMonth="08";
		public String childbirthDay="26";
		public String childGrade="05";
		public String childSPSID;
		public List<String> teacherIds=new ArrayList<String>();
		public List<String> parentIds=new ArrayList<String>();
		public List<String> readinglevelIds=new ArrayList<String>();
		public List<String> interestIds=new ArrayList<String>();
				
	//Update Child Info
		public String changedchildfirstName="Jack";
		public String changedchildlastName="Moore";
		public String changedchildbirthYear="2004";
		public String changedchildbirthMonth="07";
		public String changedchildbirthDay="27";
		public String changedchildGrade="06";
		//public List<String> changedreadinglevelIds=new ArrayList<String>();
		//public List<String> changedinterestIds=new ArrayList<String>();
		//Teacher
		public String teacherfirstName="Robert";
		public String teacherlastName="Sheehan";
		public String email;
		public String password="passed1";
		public String schoolId="163392";
		public List<String> userType1=new ArrayList<String>();
		public String teacherSPSID;
		//public boolean firstYearTeaching = true;
				
	//Parent
		public String parentfirstName="William";
		public String parentlastName="Green";
		public String parentSPSID;
		public List<String> userType2=new ArrayList<String>();
		//public String displayName="TicToc";
		//public List<String> interesParent=new ArrayList<String>();
		//public String parentPrimaryRole="2";
				
		//End Points
		public static final String ENDPOINT_PARENT_REGISTRATION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_PARENT_GET="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_TEACHER_REGISTRATION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_TEACHER_GET="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_ADDCHILD="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spschilduser/?clientId=SPSFacadeAPI";
		public static final String ENDPOINT_GET_EDIT_DELETE_CHILD="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spschilduser/{spsId}?clientId=SPSFacadeAPI";
		
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

		public Map<String, Object> createParentPayload()
				
		{
			Map<String, Object> parentRegistrationInfo = new HashMap<String, Object>();
			parentRegistrationInfo.put("firstName",parentfirstName);
			parentRegistrationInfo.put("lastName",parentlastName);
			parentRegistrationInfo.put("email",getEmail());
			userType2.add("CONSUMER");
			parentRegistrationInfo.put("userType", userType2);
			parentRegistrationInfo.put("password",password);
			parentRegistrationInfo.put("userName",email);
			return parentRegistrationInfo;
			
		}
		
		public Map<String, Object> addChildPayload()
		
		{
			Map<String, Object> addChildInfo = new HashMap<String, Object>();
			addChildInfo.put("firstName",childfirstName);
			addChildInfo.put("lastName",childlastName);
			addChildInfo.put("birthYear",childbirthYear);
			addChildInfo.put("birthMonth",childbirthMonth);
			addChildInfo.put("birthDay",childbirthDay);
			addChildInfo.put("grade",childGrade);
			teacherIds.add(teacherSPSID);
			addChildInfo.put("teacherIds", teacherIds);
			parentIds.add(parentSPSID);
			addChildInfo.put("parentIds", parentIds);
			readinglevelIds.add("100");
			readinglevelIds.add("200");
			addChildInfo.put("readingLevelIds", readinglevelIds);
			interestIds.add("10");
			addChildInfo.put("interestIds", interestIds);
			return addChildInfo;
		}
		
		public Map<String, Object> updateChildPayload()
		
		{
			Map<String, Object> updateChildInfo = new HashMap<String, Object>();
			updateChildInfo.put("firstName",changedchildfirstName);
			updateChildInfo.put("lastName",changedchildlastName);
			updateChildInfo.put("birthYear",changedchildbirthYear);
			updateChildInfo.put("birthMonth",changedchildbirthMonth);
			updateChildInfo.put("birthDay",changedchildbirthDay);
			updateChildInfo.put("grade",changedchildGrade);
			//teacherIds.add(teacherSPSID);
			updateChildInfo.put("teacherIds", teacherIds);
			//parentIds.add(parentSPSID);
			updateChildInfo.put("parentIds", parentIds);
			//readinglevelIds.add("100");
			//readinglevelIds.add("200");
			updateChildInfo.put("readingLevelIds", readinglevelIds);
			//interestIds.add("10");
			updateChildInfo.put("interestIds", interestIds);
			return updateChildInfo;
		}
		
		public ResponseSpecification createTeacherResponseValidator()
		
		//Light Teacher Registration Validation
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
		
		public ResponseSpecification createParentResponseValidator()
		
		//Light Parent Registration Validation
		{
				ResponseSpecBuilder rspec=new ResponseSpecBuilder()
				//.expectBody("userName",equalTo(email))
				//.expectBody("userType",equalTo(userType2))
				//.expectBody("email",equalTo(email))
				//.expectBody("firstName",equalTo(parentfirstName))
				//.expectBody("lastName",equalTo(parentlastName))
				//.expectBody("password",equalTo(password))
				.expectBody("spsId",is(not(empty())));
				return rspec.build();		
		}
		
				
		public ResponseSpecification addChildResponseValidator()
		
		// Add Child Validation
		{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
				//.expectBody("birthYear",equalTo(childbirthYear))
				//.expectBody("modifiedDate",equalTo(""))
				//.expectBody("registrationDate",equalTo(new Date()))
				.expectBody("cac",is(not(empty())))
				//.expectBody("firstName",equalTo(childfirstName))
				//.expectBody("lastName",equalTo(childlastName))
				//.expectBody("lastName",equalTo(childlastName))
				//.expectBody("birthMonth",equalTo(childbirthMonth))
				//.expectBody("birthDay",equalTo(childbirthDay))
				//.expectBody("birthYear",equalTo(childbirthYear))
				//.expectBody("grade",equalTo(childGrade))
				//.expectBody("readingLevelIds",equalTo(readinglevelIds))
				//.expectBody("interestIds",equalTo(interestIds))
				.expectBody("spsId",is(not(empty())));
				return rspec.build();		
		}
		
	public ResponseSpecification updateChildResponseValidator()
		
		//Update Child Validation
		{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
				//.expectBody("birthYear",equalTo(changedchildbirthYear))
				//.expectBody("modifiedDate",equalTo(""))
				//.expectBody("registrationDate",equalTo(new Date()))
				.expectBody("cac",is(not(empty())))
				//.expectBody("firstName",equalTo(changedchildfirstName))
				//.expectBody("lastName",equalTo(changedchildlastName))
				//.expectBody("lastName",equalTo(changedchildlastName))
				//.expectBody("birthMonth",equalTo(changedchildbirthMonth))
				//.expectBody("birthDay",equalTo(changedchildbirthDay))
				//.expectBody("birthYear",equalTo(changedchildbirthYear))
				//.expectBody("grade",equalTo(changedchildGrade))
				//.expectBody("readingLevelIds",equalTo(readinglevelIds))
				//.expectBody("interestIds",equalTo(interestIds))
				.expectBody("spsId",is(not(empty())));
				return rspec.build();		
		}
}
