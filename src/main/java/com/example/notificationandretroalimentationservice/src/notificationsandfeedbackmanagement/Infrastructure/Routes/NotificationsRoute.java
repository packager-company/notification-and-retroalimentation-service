package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Routes;


import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Controllers.NotificationsControllers.CreateNotificationsController;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Requests.CreateNotificationRequest;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationsRoute {
    @Autowired
    CreateNotificationsController createController;

    @PostMapping
    public BaseResponse createNotification(@RequestBody CreateNotificationRequest request) {return createController.run(request);}
}