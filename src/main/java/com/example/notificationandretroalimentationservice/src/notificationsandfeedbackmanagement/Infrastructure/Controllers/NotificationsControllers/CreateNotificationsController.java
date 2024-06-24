package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Controllers.NotificationsControllers;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Application.UseCase.NotificationsUseCase.CreateNotificationsUseCase;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Requests.CreateNotificationRequest;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateNotificationsController {
    @Autowired
    CreateNotificationsUseCase useCase;

    public BaseResponse run (CreateNotificationRequest request){return useCase.run(request);}
}