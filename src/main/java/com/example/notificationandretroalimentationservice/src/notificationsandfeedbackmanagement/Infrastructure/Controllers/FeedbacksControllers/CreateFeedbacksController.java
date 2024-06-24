package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Controllers.FeedbacksControllers;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Requests.CreateFeedbackRequest;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Application.UseCase.FeedbacksUseCase.*;

@Service
public class CreateFeedbacksController {
    @Autowired
    private CreateFeedbacksUseCase useCase;

    public BaseResponse run(CreateFeedbackRequest request) {return useCase.run(request);}
}
