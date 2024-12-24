package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileTest {


@Test
    public void getProfileTest(){
    LoginRequest loginRequest = new LoginRequest("uday1234","uday1234");
    AuthService authService = new AuthService();
    Response response = authService.login(loginRequest);
    //Deserialize
    LoginResponse loginResponse = response.as(LoginResponse.class);
    System.out.println(loginResponse.getToken());
    UserProfileManagementService userProfileManagementService= new UserProfileManagementService();
   Response response1=  userProfileManagementService.getProfile(loginResponse.getToken());
    System.out.println(response1.asPrettyString());
}
}
