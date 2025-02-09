package com.example.issue_tracking_project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends JpaRepository<TicketModel, Integer> {

    List<TicketModel> findBystatus(String status);

    List<TicketModel> findAll();

    List<TicketModel> findById(TicketModel ticketId);

}
