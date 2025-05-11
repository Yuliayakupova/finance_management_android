package com.example.afinal.boundedContext.userManagement.api;

import com.example.afinal.boundedContext.userManagement.dto.User;
import com.example.afinal.boundedContext.userManagement.request.UpdateUserRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
public interface UserApiService {
    @POST("users/")
    Call<Void> createUser(@Body User user);

    @PUT("users/{id}")
    Call<Void> updateUser(@Path("id") int id, @Body UpdateUserRequest updateUserRequest);

    @DELETE("users/{id}")
    Call<Void> deleteUser(@Path("id") int id);
}
