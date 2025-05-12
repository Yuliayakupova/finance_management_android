package com.example.afinal.boundedContext.budget.api;

import com.example.afinal.boundedContext.budget.dto.Budget;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface BudgetApiService {
    @GET("budget")
    Call<Budget> getUserBudget();
}