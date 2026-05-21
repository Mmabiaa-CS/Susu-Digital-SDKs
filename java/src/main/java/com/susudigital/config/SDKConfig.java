package com.susudigital.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SDKConfig {
    private String apiKey;
    private String environment;
    private String organization;
    private int timeout;
    private int retryAttempts;
    private boolean enableLogging;

    public SDKConfig() {
        loadConfig();
    }

    private void loadConfig() {
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new IOException("Unable to find application.properties");
            }
            properties.load(input);
            this.apiKey = properties.getProperty("api.key");
            this.environment = properties.getProperty("environment");
            this.organization = properties.getProperty("organization");
            this.timeout = Integer.parseInt(properties.getProperty("timeout", "30000"));
            this.retryAttempts = Integer.parseInt(properties.getProperty("retry.attempts", "3"));
            this.enableLogging = Boolean.parseBoolean(properties.getProperty("enable.logging", "false"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getOrganization() {
        return organization;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getRetryAttempts() {
        return retryAttempts;
    }

    public boolean isEnableLogging() {
        return enableLogging;
    }
}