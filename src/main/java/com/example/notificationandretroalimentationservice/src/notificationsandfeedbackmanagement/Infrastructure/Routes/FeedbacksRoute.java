package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Routes;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Controllers.FeedbacksControllers.CreateFeedbacksController;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Requests.CreateFeedbackRequest;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedbacks")
public class FeedbacksRoute {
    @Autowired
    private CreateFeedbacksController createController;

    @PostMapping
    private BaseResponse create(@RequestBody CreateFeedbackRequest request) {return createController.run(request);}

}