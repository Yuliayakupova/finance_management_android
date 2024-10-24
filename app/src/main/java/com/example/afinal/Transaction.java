package com.example.afinal;

public class Transaction {
    private Long id;
    private String title;
    private String description;
    private double amount;
    private String date;
    private Long userId;

    public Transaction(Long id, String title, String description, double amount, String date, Long userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
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
