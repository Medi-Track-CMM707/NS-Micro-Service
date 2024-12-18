package com.notificationservice.controller;

import com.notificationservice.model.Notification;
import com.notificationservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService service;

    @PostMapping("/send")
    public Notification sendNotification(@RequestParam Long appointmentId,
                                         @RequestParam Long patientId,
                                         @RequestParam String channel,
                                         @RequestParam String message) {
        return service.sendNotification(appointmentId, patientId, channel, message);
    }
}
