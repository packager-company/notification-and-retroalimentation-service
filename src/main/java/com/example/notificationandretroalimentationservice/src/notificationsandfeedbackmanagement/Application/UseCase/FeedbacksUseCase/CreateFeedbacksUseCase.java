package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Application.UseCase.FeedbacksUseCase;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Entity.Feedbacks;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Ports.FeedbacksPort;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Requests.CreateFeedbackRequest;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateFeedbacksUseCase {
    @Autowired
    private FeedbacksPort feedbacksPort;

    public BaseResponse run(CreateFeedbackRequest request){
        Feedbacks feedback = new Feedbacks(request.getShipment_uuid(), request.getUser_uuid(), request.getComment(), request.getRating());
        return feedbacksPort.crearFeedback(feedback);
    }
}
