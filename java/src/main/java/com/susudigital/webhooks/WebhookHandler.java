package com.susudigital.webhooks;

import java.util.HashMap;
import java.util.Map;

public class WebhookHandler {
    private final String secretKey;
    private final boolean verifySignatures;
    private final Map<String, WebhookListener> listeners;

    public WebhookHandler(String secretKey, boolean verifySignatures) {
        this.secretKey = secretKey;
        this.verifySignatures = verifySignatures;
        this.listeners = new HashMap<>();
    }

    public void registerWebhook(String eventType, WebhookListener listener) {
        listeners.put(eventType, listener);
    }

    public void handleEvent(String eventType, String payload) {
        WebhookListener listener = listeners.get(eventType);
        if (listener != null) {
            listener.onEvent(payload);
        }
    }

    public interface WebhookListener {
        void onEvent(String payload);
    }
}