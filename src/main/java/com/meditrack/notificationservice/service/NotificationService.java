package com.notificationservice.service;

import com.notificationservice.model.Notification;
import com.notificationservice.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository repository;

    public Notification sendNotification(Long appointmentId, Long patientId, String channel, String message) {
        Notification notification = new Notification();
        notification.setAppointmentId(appointmentId);
        notification.setPatientId(patientId);
        notification.setContactChannel(channel);
        notification.setMessage(message);
        notification.setSentTime(LocalDateTime.now());
        notification.setStatus("SENT");
        return repository.save(notification);
    }
}
