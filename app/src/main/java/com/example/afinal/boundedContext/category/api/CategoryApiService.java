package com.example.afinal.boundedContext.category.api;

import com.example.afinal.boundedContext.category.dto.Category;
import com.example.afinal.boundedContext.category.request.CreateCategoryRequest;
import com.example.afinal.boundedContext.category.request.UpdateCategoryRequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CategoryApiService {

    @GET("category")
    Call<List<Category>> getAllCategories();

    @POST("category")
    Call<Void> createCategory(@Body CreateCategoryRequest request);

    @POST("category/custom")
    Call<Void> createCustomCategory(@Body CreateCategoryRequest request);

    @GET("category/{id}")
    Call<Category> getCategoryById(@Path("id") int id);

    @PUT("category/{id}")
    Call<Void> updateCategory(@Path("id") int id, @Body UpdateCategoryRequest request);
}