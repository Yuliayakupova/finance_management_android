package com.example.afinal.boundedContext.authentication.request;

public class LoginRequest {

    private String email;
    private String password;

    /**
     * Constructor to create a new LoginRequest with email and password.
     *
     * @param email The email of the user.
     * @param password The password of the user.
     */
    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}