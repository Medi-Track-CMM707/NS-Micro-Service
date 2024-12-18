package com.notificationservice.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationScheduler {

    @Scheduled(fixedRate = 3600000) // Run every hour
    public void sendScheduledNotifications() {
        // Implement logic to fetch appointments and send reminders
        System.out.println("Sending scheduled notifications...");
    }
}
