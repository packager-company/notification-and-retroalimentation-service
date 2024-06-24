package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
public class Feedbacks {
    private String uuid;
    private String shipment_uuid;
    private String user_uuid;
    private String comment;
    private float rating;
    private Date date;

    public Feedbacks(String shipment_uuid, String user_uuid, String comment, float rating) {
        this.uuid = UUID.randomUUID().toString();
        this.shipment_uuid = shipment_uuid;
        this.user_uuid = user_uuid;
        this.comment = comment;
        this.rating = rating;
        this.date = new Date();
    }
}
