package com.notificationservice.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long appointmentId;
    private Long patientId;
    private String contactChannel; // EMAIL or SMS
    private String message;
    private LocalDateTime sentTime;
    private String status; // SENT, FAILED, PENDING
}
