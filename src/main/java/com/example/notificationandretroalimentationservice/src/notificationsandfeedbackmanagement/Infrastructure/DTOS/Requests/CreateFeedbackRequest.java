package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateFeedbackRequest {
    private String shipment_uuid;
    private String user_uuid;
    private String comment;
    private float rating;
}
