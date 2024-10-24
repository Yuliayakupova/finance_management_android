package com.example.afinal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserApiService {

    @POST("users/")
    Call<Void> createUser(@Body UserRequest userRequest);

    @POST("transactions/")
    Call<Void> createTransaction(@Body TransactionRequest transactionRequest);

    @GET("transactions/user/{userId}/dates")
    Call<List<Transaction>> getTransactionsByUserIdAndDates(
            @Path("userId") Long userId,
            @Query("startDate") String startDate,
            @Query("endDate") String endDate);
}