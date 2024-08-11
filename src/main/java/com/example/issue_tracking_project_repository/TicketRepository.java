package com.example.issue_tracking_project_repository;

import com.example.issue_tracking_project_model.TicketModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketModel, Long> {
}
