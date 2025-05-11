package com.example.afinal.boundedContext.userManagement.request;

public class UpdateUserRequest {
    private String name;
    private String email;
    private String password;

    /**
     * Constructs an UpdateUserRequest with the specified user details.
     *
     * @param name     the user's name
     * @param email    the user's email
     * @param password the user's password
     */
    public UpdateUserRequest(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
