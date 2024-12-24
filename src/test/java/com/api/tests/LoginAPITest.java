package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest {


    @Test
    public void loginTest()
    {
        LoginRequest loginRequest = new LoginRequest("uday1234","uday1234");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        //Deserialize
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getEmail());
        System.out.println(loginResponse.getId());
        System.out.println(loginResponse.getType());
        System.out.println(loginResponse.getUsername());
        System.out.println(loginResponse.getRoles());
        Assert.assertEquals(response.getStatusCode(),200);
    }

}
