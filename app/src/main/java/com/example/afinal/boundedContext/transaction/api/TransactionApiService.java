package com.example.afinal.boundedContext.transaction.api;


import com.example.afinal.boundedContext.transaction.dto.Transaction;
import com.example.afinal.boundedContext.transaction.request.CreateTransactionRequest;
import com.example.afinal.boundedContext.transaction.request.UpdateTransactionRequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
public interface TransactionApiService {

    @POST("transactions/")
    Call<Void> createTransaction(@Body CreateTransactionRequest createTransactionRequest);

    @PUT("transactions/{id}")
    Call<Void> updateTransaction(@Path("id") int id, @Body UpdateTransactionRequest updateTransactionRequest);

    @DELETE("transactions/{id}")
    Call<Void> deleteTransaction(@Path("id") int id);

    @GET("transactions/")
    Call<List<Transaction>> getAllTransactions();
}