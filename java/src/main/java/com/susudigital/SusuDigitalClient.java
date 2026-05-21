package com.susudigital;

import com.susudigital.authentication.AuthenticationManager;
import com.susudigital.customers.CustomerService;
import com.susudigital.transactions.TransactionService;
import com.susudigital.loans.LoanService;
import com.susudigital.savings.SavingsService;
import com.susudigital.analytics.AnalyticsService;
import com.susudigital.compliance.ComplianceService;
import com.susudigital.notifications.NotificationService;
import com.susudigital.webhooks.WebhookHandler;
import com.susudigital.organizations.OrganizationService;
import com.susudigital.config.SDKConfig;

public class SusuDigitalClient {
    private final AuthenticationManager authenticationManager;
    private final CustomerService customerService;
    private final TransactionService transactionService;
    private final LoanService loanService;
    private final SavingsService savingsService;
    private final AnalyticsService analyticsService;
    private final ComplianceService complianceService;
    private final NotificationService notificationService;
    private final WebhookHandler webhookHandler;
    private final OrganizationService organizationService;
    private final SDKConfig config;

    public SusuDigitalClient(SDKConfig config) {
        this.config = config;
        this.authenticationManager = new AuthenticationManager(config);
        this.customerService = new CustomerService(config);
        this.transactionService = new TransactionService(config);
        this.loanService = new LoanService(config);
        this.savingsService = new SavingsService(config);
        this.analyticsService = new AnalyticsService(config);
        this.complianceService = new ComplianceService(config);
        this.notificationService = new NotificationService(config);
        this.webhookHandler = new WebhookHandler(config);
        this.organizationService = new OrganizationService(config);
    }

    public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public TransactionService getTransactionService() {
        return transactionService;
    }

    public LoanService getLoanService() {
        return loanService;
    }

    public SavingsService getSavingsService() {
        return savingsService;
    }

    public AnalyticsService getAnalyticsService() {
        return analyticsService;
    }

    public ComplianceService getComplianceService() {
        return complianceService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public WebhookHandler getWebhookHandler() {
        return webhookHandler;
    }

    public OrganizationService getOrganizationService() {
        return organizationService;
    }

    public SDKConfig getConfig() {
        return config;
    }
}