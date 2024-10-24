package com.example.afinal;

public class TransactionRequest {
    private String description;
    private double amount;
    private String date;
    private Long userId;

    public TransactionRequest(String description, double amount, String date, Long userId) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public Long getUserId() {
        return userId;
    }
}
