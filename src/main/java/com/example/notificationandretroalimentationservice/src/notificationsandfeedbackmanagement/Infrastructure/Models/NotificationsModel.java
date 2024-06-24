package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Models;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "notifications")
@Getter @Setter
public class NotificationsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = true)
    private String uuid;

    @Column(nullable = false)
    private String shipment_uuid;

    @Column(nullable = false)
    private String user_uuid;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Date created_at;
}
