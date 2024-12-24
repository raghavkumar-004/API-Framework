package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreationTest {


    @Test
    public void accountCreationTest(){

     SignUpRequest signUpRequest=   new SignUpRequest.Builder().userName("rk1")
        .password("Testing@12345")
                .email("rk1@yopmail.com")
                .firstName("raghav")
                .lastName("kumar")
                .mobileNumber("123456754").build();
        AuthService authService= new AuthService();
       Response response= authService.signUp(signUpRequest);
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
