package com.example.afinal.boundedContext.transaction.request;

import java.math.BigDecimal;

public class UpdateTransactionRequest {
    private BigDecimal amount;
    private String description;
    private String createdAt;
    private String category;

    public UpdateTransactionRequest(BigDecimal amount, String description, String createdAt, String category) {
        this.amount = amount;
        this.description = description;
        this.createdAt = createdAt;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
