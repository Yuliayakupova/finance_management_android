package com.example.afinal.boundedContext.budget.dto;

import androidx.annotation.NonNull;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal totalBalance;

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }

    @NonNull
    @Override
    public String toString() {
        return "Budget{totalBalance=" + totalBalance + '}';
    }
}
