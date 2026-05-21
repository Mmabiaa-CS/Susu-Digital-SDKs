package com.susudigital.savings;

import java.math.BigDecimal;

public class SavingsService {

    public SavingsAccount createSavingsAccount(String customerId, BigDecimal initialDeposit) {
        // Logic to create a savings account for the customer
        return new SavingsAccount(customerId, initialDeposit);
    }

    public SavingsAccount getSavingsAccount(String accountId) {
        // Logic to retrieve a savings account by its ID
        return new SavingsAccount(accountId, BigDecimal.ZERO); // Placeholder implementation
    }

    public BigDecimal withdrawFromSavings(String accountId, BigDecimal amount) {
        // Logic to withdraw an amount from the savings account
        return amount; // Placeholder implementation
    }

    // Additional methods can be added as needed
}

class SavingsAccount {
    private String accountId;
    private String customerId;
    private BigDecimal balance;

    public SavingsAccount(String customerId, BigDecimal initialDeposit) {
        this.customerId = customerId;
        this.balance = initialDeposit;
        // Generate accountId and other initialization logic
    }

    // Getters and setters can be added here
}