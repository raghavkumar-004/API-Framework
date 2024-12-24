package com.api.models.request;

public class SignUpRequest
{
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    public SignUpRequest(String userName, String password, String email, String firstName, String lastName, String mobileNumber) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
public static class Builder
{
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    public Builder userName(String userName){
        this.userName=userName;
        return this;// return the current object
    }
    public Builder password(String password){
        this.password=password;
        return this;
    }
    public Builder email(String email){
        this.email=email;
        return this;
    }
    public Builder firstName(String firstName){
        this.firstName=firstName;
        return this;
    }
    public Builder lastName(String lastName){
        this.lastName=lastName;
        return this;
    }
    public Builder mobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;
        return this;
    }
    public SignUpRequest build(){
            SignUpRequest signUpRequest= new SignUpRequest(userName,password,email,firstName,lastName,mobileNumber);
        return signUpRequest;
    }
}
}
