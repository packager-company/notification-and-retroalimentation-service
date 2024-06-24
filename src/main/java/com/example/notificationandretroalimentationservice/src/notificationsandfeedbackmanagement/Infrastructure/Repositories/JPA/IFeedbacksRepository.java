package com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Repositories.JPA;

import com.example.notificationandretroalimentationservice.src.notificationsandfeedbackmanagement.Infrastructure.Models.FeedbacksModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedbacksRepository extends JpaRepository<FeedbacksModel, Long> {
}
