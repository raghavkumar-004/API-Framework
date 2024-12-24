package com.api.base;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService {
    private static final String BASE_PATH = "/api/auth/";

    public AuthService() {

    }

    /*
    login is the end point so in the AuthService page class we are creating the method of endpoint
     */
    public Response login(LoginRequest payload) {
        return postRequest(payload, BASE_PATH + "login");
    }

    public Response signUp(SignUpRequest payload) {
        return postRequest(payload, BASE_PATH + "signup");
    }

    /*
    we are not creating any pojo for this because there is only single field
    email and for single field it is not recommend to create pojo
     */
    public Response forgotPassword(String emailAddress) {
        HashMap<String, String> payload = new HashMap<String, String>();
        payload.put("email", emailAddress);
        return postRequest(payload, BASE_PATH + "forgot-password");

    }
}
