package com.susudigital.notifications;

import java.util.HashMap;
import java.util.Map;

public class NotificationService {

    private Map<String, String> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    public void sendNotification(String recipient, String message) {
        // Logic to send notification
        notifications.put(recipient, message);
        System.out.println("Notification sent to " + recipient + ": " + message);
    }

    public void scheduleNotification(String recipient, String message, long delay) {
        // Logic to schedule notification
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                sendNotification(recipient, message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Notification scheduling interrupted");
            }
        }).start();
    }

    public Map<String, String> getNotifications() {
        return notifications;
    }
}