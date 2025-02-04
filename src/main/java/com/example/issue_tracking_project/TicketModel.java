package com.example.issue_tracking_project;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_issue_tracking", schema = "db_issue_tracking")
public class TicketModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nId;
    private String description;
    private String sStatus;
    private String sAssigned;
    private String sSupervisor;

 

  
}
