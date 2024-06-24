package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateNotificationRequest {
    private String shipment_uuid;
    private String user_uuid;
    private String message;
}
