package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Application.UseCase.NotificationsUseCase;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Entity.Notifications;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Ports.NotificationsPort;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Requests.CreateNotificationRequest;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateNotificationsUseCase {
    @Autowired
    NotificationsPort repository;

    public BaseResponse run(CreateNotificationRequest request){
        String email = "";
        Notifications notification = new Notifications(request.getShipment_uuid(), request.getUser_uuid(), email, request.getMessage());
        return repository.createNotification(notification);
    }
}
