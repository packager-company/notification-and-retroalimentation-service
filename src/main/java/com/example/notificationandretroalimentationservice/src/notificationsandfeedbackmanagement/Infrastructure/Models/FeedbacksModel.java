package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Models;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "feedbacks")
@Getter @Setter
public class FeedbacksModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;


    @Column(nullable = false, unique = true)
    public String uuid;

    @Column(nullable = false, unique = true)
    public String shipment_uuid;

    @Column(nullable = false, unique = true)
    public String user_uuid;

    @Column(nullable = false)
    public String comment;

    @Column(nullable = false)
    public float rating;

    @Column(nullable = false)
    public Date created_at;
}

