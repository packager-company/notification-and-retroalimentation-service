package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Ports;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Entity.Feedbacks;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;

public interface FeedbacksPort {
    BaseResponse crearFeedback (Feedbacks feedback);
}
