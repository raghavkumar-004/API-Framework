package com.api.base;

import com.api.filters.LoggingFilter;
import com.api.models.request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class BaseService {
    /*
    It is responsible for setting up requestSpecification
    this class is the wrapper for restassured
    It is responsible for handling the baseURI
    It is responsible for creating the request
    It is responsible forHandling the Response
    */

    static {
        RestAssured.filters(new LoggingFilter());
    }

    private static final String BASE_URL="http://64.227.160.186:8080"; // It is constant that's why we make this final and then static as well
    RequestSpecification requestSpecification; //RequestSpecification is interface and it allow you to specify how the request will look like

    /*
    we initialize the instance variable inside the constructor so here requestSpecification is instance
    */
    public BaseService()
    {
          requestSpecification=  RestAssured.given().baseUri(BASE_URL);//return type of given and baseUri method is requestSpecification
    }

    /*
    here we pass Object as first parameter because Object is the parent class of all the classes in java
    we use in build method contentType method here instead of Header
     */

      protected Response postRequest(Object payload, String endPont)
      {
      return  requestSpecification.contentType(ContentType.JSON) .body(payload).post(endPont);
      }

      /*
      put Request
       */

    protected Response putRequest(Object payload, String endPont)
    {
        return  requestSpecification.contentType(ContentType.JSON) .body(payload).put(endPont);
    }

      /*/
      getMethod
       */
    protected  Response getRequest(String endPoint){
       return requestSpecification.get(endPoint);
    }

    /*
    Set Auth Token
     */
    protected  void setAuthToken(String token){
          requestSpecification.header("Authorization","Bearer",token);
    }
}
