package com.example.issue_tracking_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketLoginRepository extends JpaRepository<TicketUserDao,Integer> {
  
    TicketUserDao findAllByemailId(String email_id);

}
