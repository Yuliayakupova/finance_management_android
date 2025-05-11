package com.example.afinal.boundedContext.transaction.dto;

import java.math.BigDecimal;

public class Transaction {
    private int id;
    private BigDecimal amount;
    private String description;
    private String createdAt;
    private int category;
    private int moneyboxId;

    public Transaction(int id, BigDecimal amount, String description, String createdAt, int category, int moneyboxId) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.createdAt = createdAt;
        this.category = category;
        this.moneyboxId = moneyboxId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getMoneyboxId() {
        return moneyboxId;
    }

    public void setMoneyboxId(int moneyboxId) {
        this.moneyboxId = moneyboxId;
    }
}
