package com.susudigital.transactions;

import com.susudigital.config.SDKConfig;

public class TransactionService {
    private final SDKConfig config;

    public TransactionService(SDKConfig config) {
        this.config = config;
    }

    public Transaction createTransaction(Transaction transaction) {
        // Logic to create a transaction
        return transaction;
    }

    public Transaction getTransaction(String transactionId) {
        // Logic to retrieve a transaction by ID
        return new Transaction(); // Placeholder return
    }

    public Transaction refundTransaction(String transactionId) {
        // Logic to refund a transaction
        return new Transaction(); // Placeholder return
    }
}