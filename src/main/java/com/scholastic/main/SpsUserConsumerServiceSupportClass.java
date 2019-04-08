package com.scholastic.main;


import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jayway.restassured.builder.ResponseSpecBuilder;

import com.jayway.restassured.specification.ResponseSpecification;

public class SpsUserConsumerServiceSupportClass 
{
	//public String title="MR";
	public String firstName="Shawn";
	public String lastName="Crutz";
	public String email;
	public String password="passed1";
	public String childfirstName="George";
	public String childlastName="Crutz";
	public String childbirthYear="2006";
	public String childbirthMonth="09";
	public String childbirthDay="22";
	public String childGrade="04";
	public String schoolId="163392";
	public String childSPSID;
	public boolean firstYearTeaching = true;
	public List<String> teacherIds=new ArrayList<String>();
	public List<String> parentIds=new ArrayList<String>();
	public List<String> userType=new ArrayList<String>();
	public String consumerSPSID;
	public String displayName="RutGut";
	public List<String> interesParent=new ArrayList<String>();
	public List<String> readinglevelIds=new ArrayList<String>();
	public List<String> interestIds=new ArrayList<String>();
	public String parentPrimaryRole="2";
	
	public static final String ENDPOINT_CONSUMER_REGISTRATION="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_CONSUMER_GET="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_CONSUMER_UPDATE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_CONSUMER_DELETE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_TEACHER_DELETE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_CONSUMER_ADDCHILD="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spschilduser/?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_CONSUMER_GETCHILD="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spschilduser/{spsId}?clientId=SPSFacadeAPI";
	public static final String ENDPOINT_CONSUMER_UPGRADETEACHER="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{spsId}/upgradetoeducator?clientId=SCSToolsApp";

	public String getEmail()
	{
		email="sps_qa"+String.valueOf(System.currentTimeMillis())+"@tample.com";
		return email;
	
	}
	
	public Map<String, Object> createConsumerPayload()
	{
		Map<String, Object> consumerRegistrationInfo = new HashMap<String, Object>();
		consumerRegistrationInfo.put("firstName",firstName);
		consumerRegistrationInfo.put("lastName",lastName);
		consumerRegistrationInfo.put("email",getEmail());
		userType.add("CONSUMER");
		consumerRegistrationInfo.put("userType", userType);
		consumerRegistrationInfo.put("password",password);
		consumerRegistrationInfo.put("userName",email);
		return consumerRegistrationInfo;
	}
	
	public ResponseSpecification createConsumerResponseValidator()
	
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			//.expectBody("userName",equalTo(email))
			//.expectBody("userType",equalTo(userType))
			//.expectBody("email",equalTo(email))
			//.expectBody("firstName",equalTo(firstName))
			//.expectBody("lastName",equalTo(lastName))
			//.expectBody("password",equalTo(password))
			.expectBody("spsId",is(not(empty())));
			return rspec.build();		
	}
	
	public Map<String, Object> updateConsumerPayload()
	{
		Map<String, Object> updateConsumerInfo = new HashMap<String, Object>();
		updateConsumerInfo.put("displayName", displayName);
		interesParent.add("1");
		interesParent.add("2");
		updateConsumerInfo.put("interesParent", interesParent);
		updateConsumerInfo.put("parentPrimaryRole", parentPrimaryRole);
		return updateConsumerInfo;
	}
	
	public ResponseSpecification createConsumerUpdateResponseValidator()
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			.expectBody("spsId",is(not(empty())));
			//.expectBody("displayName",equalTo(displayName))
			//.expectBody("interesParent",equalTo(interesParent))
			//.expectBody("parentPrimaryRole",equalTo(parentPrimaryRole));
			//.expectBody("userName",equalTo(email));
			return rspec.build();		
	}
	
	public Map<String, Object> upgradeConsumerToEducatorPayload()
	{
		Map<String, Object> upgradeConsumerToEducatorInfo = new HashMap<String, Object>();
		upgradeConsumerToEducatorInfo.put("schoolId",schoolId);
		Map<String, Object> gradesSize = new HashMap<String, Object>();
		gradesSize.put("98", "19");
		gradesSize.put("05", "21");
		upgradeConsumerToEducatorInfo.put("gradesSize", gradesSize);
		upgradeConsumerToEducatorInfo.put("firstYearTeaching", firstYearTeaching);
		return upgradeConsumerToEducatorInfo;
	}
	
	public ResponseSpecification createConsumerUpgradeResponseValidator()
	{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			//.expectBody("userName",equalTo(email))
			//.expectBody("modifiedDate",equalTo(""))
			//.expectBody("registrationDate",equalTo(new Date()))
			//.expectBody("schoolId",equalTo(schoolId))
			.expectBody("orgZip",is(not(empty())))
			//.expectBody("userType",hasItems(userType))
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
	
	public Map<String, Object> addChildPayload()
	{
		Map<String, Object> addChildInfo = new HashMap<String, Object>();
		addChildInfo.put("firstName",childfirstName);
		addChildInfo.put("lastName",childlastName);
		addChildInfo.put("birthYear",childbirthYear);
		addChildInfo.put("birthMonth",childbirthMonth);
		addChildInfo.put("birthDay",childbirthDay);
		addChildInfo.put("grade",childGrade);
		teacherIds.add("83931883");
		addChildInfo.put("teacherIds", teacherIds);
		parentIds.add(consumerSPSID);
		addChildInfo.put("parentIds", parentIds);
		readinglevelIds.add("100");
		readinglevelIds.add("200");
		addChildInfo.put("readingLevelIds", readinglevelIds);
		interestIds.add("10");
		addChildInfo.put("interestIds", interestIds);
		return addChildInfo;
	}
	
	public ResponseSpecification addChildResponseValidator()
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
			//.expectBody("readingLevelIds",hasItem(readinglevelIds))
			//.expectBody("interestIds",hasItem(interestIds))
			.expectBody("spsId",is(not(empty())));
			return rspec.build();		
	}
}
