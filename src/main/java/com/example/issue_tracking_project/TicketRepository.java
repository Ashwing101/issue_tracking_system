package com.example.issue_tracking_project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends JpaRepository<TicketDao, Integer> {

    List<TicketDao> findBystatus(String status);

    List<TicketDao> findAll();

    List<TicketDao> findById(TicketDao ticketId);

}
