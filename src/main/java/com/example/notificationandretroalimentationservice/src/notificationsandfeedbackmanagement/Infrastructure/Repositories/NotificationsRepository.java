package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Repositories;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Entity.Notifications;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Ports.NotificationsPort;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Models.NotificationsModel;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Repositories.JPA.INotificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class NotificationsRepository implements NotificationsPort{

    @Autowired
    INotificationsRepository repository;

    @Override
    public BaseResponse createNotification(Notifications notification) {
        return from(repository.save(from(notification)));
    }

    private NotificationsModel from(Notifications notification) {
        NotificationsModel model = new NotificationsModel();
        model.setUuid(notification.getUuid());
        model.setShipment_uuid(notification.getShipment_uuid());
        model.setUser_uuid(notification.getUser_uuid());
        model.setEmail(notification.getEmail());
        model.setMessage(notification.getMessage());
        model.setCreated_at(notification.getDate());
        return model;
    }

    private BaseResponse from(NotificationsModel model) {
        return BaseResponse.builder().data(model).message("Notification Created")
                .httpStatus(HttpStatus.CREATED).success(true).build();
    }
}