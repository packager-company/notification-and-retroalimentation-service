package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Entity;

import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
public class Notifications {
    private String uuid;
    private String shipment_uuid;
    private String user_uuid;
    private String email;
    private String message;
    private Date date;

    public Notifications(String shipment_uuid, String user_uuid, String email, String message) {
        this.uuid = UUID.randomUUID().toString();
        this.shipment_uuid = shipment_uuid;
        this.user_uuid = user_uuid;
        this.email = email;
        this.message = message;
        this.date = new Date();
    }

}
