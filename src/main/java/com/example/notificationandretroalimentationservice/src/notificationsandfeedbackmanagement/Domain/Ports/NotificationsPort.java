package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Ports;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Entity.Notifications;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;


public interface NotificationsPort {
    BaseResponse createNotification(Notifications notification);
}
