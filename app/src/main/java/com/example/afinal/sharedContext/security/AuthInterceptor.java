package com.example.afinal.sharedContext.security;


import android.content.Context;
import android.content.SharedPreferences;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthInterceptor implements Interceptor {
    private final SharedPreferences sharedPreferences;

    public AuthInterceptor(Context context) {
        this.sharedPreferences = context.getSharedPreferences("auth", Context.MODE_PRIVATE);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String token = sharedPreferences.getString("jwt", null);
        Request original = chain.request();
        Request.Builder builder = original.newBuilder();

        if (token != null && !original.url().encodedPath().contains("/authentication")) {
            builder.addHeader("Authorization", "Bearer " + token);
        }

        return chain.proceed(builder.build());
    }
}