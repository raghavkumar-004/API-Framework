package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {

    @Test
    public void forgotPasswordTest(){
        AuthService authService= new AuthService();
      Response response=  authService.forgotPassword("testautomationacademy33@gmail.com");
        System.out.println(response.asPrettyString());
    }

}
