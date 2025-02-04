package com.example.issue_tracking_project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends JpaRepository<TicketModel, Integer> {

    List<TicketModel> findBysStatus(String status);

}
