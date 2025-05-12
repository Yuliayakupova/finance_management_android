package com.example.afinal.boundedContext.transaction.request;

import java.math.BigDecimal;

public class CreateTransactionRequest {
    private BigDecimal amount;
    private String description;
    private String createdAt;
    private int moneyboxId;
    private int categoryId;

    public CreateTransactionRequest(BigDecimal amount, String description, String createdAt, int moneyboxId, int categoryId) {
        this.amount = amount;
        this.description = description;
        this.createdAt = createdAt;
        this.moneyboxId = moneyboxId;
        this.categoryId = categoryId;
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

    public int getMoneyboxId() {
        return moneyboxId;
    }

    public void setMoneyboxId(int moneyboxId) {
        this.moneyboxId = moneyboxId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
