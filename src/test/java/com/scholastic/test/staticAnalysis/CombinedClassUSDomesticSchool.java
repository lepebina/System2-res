package com.scholastic.test.staticAnalysis;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;
import com.scholastic.main.SpsSchoolEditServiceSupportClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CombinedClassUSDomesticSchool {
    
    public void targetScenarioOne(String x, String y) {
        System.out.println(x);
        
        // ##########  Edit School-option 1 international Existing Schools ##########
       // ExtractableResponse<Response> createTeacherResponse=
        //given()
                        //.log().all()
        //.contentType("application/json")
        //.body(createTeacherPayload()).
        //when()
        //.post(ENDPOINT_TEACHER_REGISTRATION).
        //then()
        // .statusCode(201)
        // .spec(createTeacherResponseValidator())
        //.extract();     
        // teacherSPSID=createTeacherResponse.path("spsId");
        //user=createTeacherResponse.path("userName");
        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
        //System.out.println(">>>>>>>User Name is: "+user);
        
        //Thread.sleep(6000L);
        
        //Authentication
        /*ExtractableResponse<Response> createLogInResponse=
                given()
                        //.log().all()
                        .contentType("application/json")
                        .body(createLogInPayload()).
                when()
                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
                then()
                        .statusCode(200)
                        .extract(); 
        /*sps_session=createLogInResponse.path("SPS_SESSION.value");
        sps_tsp=createLogInResponse.path("SPS_TSP.value");
        //System.out.println(createLogInResponse.path("SPS_UD.value"));
        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
        
        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID);
        
        //Change School to Existing International School
        
        /*ExtractableResponse<Response> changedToInternationalSchoolResponse=
                given()
                        //.log().all()
                        .pathParam("spsId",userSPSID)
                        .cookies("SPS_SESSION",sps_session)
                        .cookie("SPS_TSP",sps_tsp)
                        .contentType("application/json")
                        .body(changedToInternationalSchoolPayload()).
                when()
                        .put(ENDPOINT_CHANGE_SCHOOL).
                then()
                        .statusCode(200)
                        .extract();
        teacherSPSID=changedToInternationalSchoolResponse.path("spsId");*/ // block comment may need revisiting
        //System.out.println(">>>>>>>Teacher SPSID is: "+teacherSPSID);
        // Get School Info after change school
        // ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
                        /*given()
                                //.log().all()
                                .pathParam("spsId",teacherSPSID)
                                .contentType("application/json").
                        when()
                                .get(ENDPOINT_GET_SCHOOL).
                        then()
                                .statusCode(200)
                                .spec(changedToInternationalSchoolResponseValidator())
                                .extract();     
        //System.out.println("******************** Teacher's Initial Registerd School Was **********************");
        //System.out.println(createTeacherResponse.asString());
        //System.out.println("**********************************************************************************");
        
        //System.out.println("******************** Changed To International School is **************************");
        //System.out.println(afterChangedSchoolGetInfoResponse.asString());
        //System.out.println("**********************************************************************************");
                        
                        System.out.println(y);
    }
    
    public void targetScenarioTwo(String a, String b) {
        System.out.println(a);
        
        ExtractableResponse<Response> createTeacherResponse=
                given()
                        //.log().all()
                        .contentType("application/json")
                        .body(createTeacherPayload()).
                when()
                        .post(ENDPOINT_TEACHER_REGISTRATION).
                then()
                        .statusCode(201)
                        .spec(createTeacherResponseValidator())
                        .extract();     
        teacherSPSID=createTeacherResponse.path("spsId");
        user=createTeacherResponse.path("userName");
        //System.out.println(">>>>>>User SPSID is: "+teacherSPSID);
        //System.out.println(">>>>>>>User Name is: "+user);
        
        //Create Home School
        ExtractableResponse<Response> createHomeSchoolResponse=
                given()
                        //.log().all()
                        .contentType("application/json")
                        .body(createHomeSchoolPayload()).
                when()
                        .post(ENDPOINT_CREATE_SCHOOL).
                then()
                        .statusCode(201)
                        .spec(createHomeSchoolResponseValidator())
                         .extract();    
        h_schoolSPSID=createHomeSchoolResponse.path("spsId");
        //System.out.println(createHomeSchoolResponse.asString());
        //System.out.println(">>>>>>Home School SPSID is: "+h_schoolSPSID);
        
        //Thread.sleep(6000L);
        //Authentication
        ExtractableResponse<Response> createLogInResponse=
                given()
                        .contentType("application/json")
                        .body(createLogInPayload()).
                when()
                        .post("http://fs-iam-spsapifacade-qa1.scholastic-labs.io/sps-api-facade/spsuser/login?clientId=SPSFacadeAPI").
                then()
                        .statusCode(200)
                        .extract(); 
        
        /*sps_session=createLogInResponse.path("SPS_SESSION.value");
        sps_tsp=createLogInResponse.path("SPS_TSP.value");
        //System.out.println(createLogInResponse.path("SPS_UD.value"));
        userSPSID=((String)createLogInResponse.path("SPS_UD.value")).split("\\|")[0];*/
        
        //System.out.println(">>>>>>>>>>> SPS Session Id: "+sps_session);
        //System.out.println(">>>>>>>>>>> SPS TSP Id: "+sps_tsp);
        //System.out.println(">>>>>>>>>>> User SPSID: "+userSPSID); 
        
        //Change School to Home School
        
        /*ExtractableResponse<Response> changedToHomeSchoolResponse=
                given()
                        //.log().all()
                        .pathParam("spsId",userSPSID)
                        .cookies("SPS_SESSION",sps_session)
                        .cookie("SPS_TSP",sps_tsp)
                        .contentType("application/json")
                        .body(changedToHomeSchoolPayload()).
                when()
                        .put(ENDPOINT_CHANGE_SCHOOL).
                then()
                        .statusCode(200)
                        .extract();
        userSPSID=changedToHomeSchoolResponse.path("spsId");*/  
        //System.out.println("User SPSID is: "+userSPSID);
        // Get School Info after change school
        //ExtractableResponse<Response> afterChangedSchoolGetInfoResponse=
                 /*given()
                        //.log().all()
                        .pathParam("spsId",teacherSPSID)
                        .contentType("application/json").
                 when()
                        .get(ENDPOINT_GET_SCHOOL).
                 then()
                        .statusCode(200)
                        .spec(changedToHomeSchoolResponseValidator())
                        .extract(); */    
        //System.out.println("******************** Teacher's Initial Registerd School Was *********************");
        //System.out.println(createTeacherResponse.asString());
        //System.out.println("**********************************************************************************");
                
        //System.out.println("******************** Changed To Home School is ***********************************");
        //System.out.println(afterChangedSchoolGetInfoResponse.asString());
        //System.out.println("**********************************************************************************");
                 
                 //System.out.println(b);
    }

}
