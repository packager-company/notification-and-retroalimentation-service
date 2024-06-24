package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Repositories;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Entity.Feedbacks;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Domain.Ports.FeedbacksPort;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses.BaseResponse;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Models.FeedbacksModel;
import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Repositories.JPA.IFeedbacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
class FeedbacksRepsotory implements FeedbacksPort{

    @Autowired
    private IFeedbacksRepository repository;

    @Override
    public BaseResponse crearFeedback(Feedbacks feedback) {
        return from(repository.save(from(feedback)));
    }

    private FeedbacksModel from(Feedbacks feedback) {
        FeedbacksModel model = new FeedbacksModel();
        model.setUuid(feedback.getUuid());
        model.setUser_uuid(feedback.getUser_uuid());
        model.setShipment_uuid(feedback.getShipment_uuid());
        model.setComment(feedback.getComment());
        model.setRating(feedback.getRating());
        model.setCreated_at(feedback.getDate());
        return model;
    }

    private BaseResponse from(FeedbacksModel model) {
        return BaseResponse.builder().data(model).message("Feedback created successfully")
                .httpStatus(HttpStatus.CREATED).success(true).build();
    }
}
