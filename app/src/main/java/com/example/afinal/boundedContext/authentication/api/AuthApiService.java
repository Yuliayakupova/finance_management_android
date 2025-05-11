package com.example.afinal.boundedContext.authentication.api;


import com.example.afinal.boundedContext.authentication.request.CreateUserRequest;
import com.example.afinal.boundedContext.authentication.request.LoginRequest;
import com.example.afinal.sharedContext.security.JwtResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface AuthApiService {

        @POST("/api/v1/authentication/register")
        Call<ResponseBody> register(@Body CreateUserRequest request);

        @POST("/api/v1/authentication/login")
        Call<JwtResponse> login(@Body LoginRequest loginRequest);
}
