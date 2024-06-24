package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.DTOS.Responses;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter @Builder
public class BaseResponse {
    private Object data;
    private String message;
    private Boolean success;
    private HttpStatus httpStatus;

}
