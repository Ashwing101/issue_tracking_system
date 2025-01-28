package com.example.issue_tracking_project_model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TicketModel {

    private String description;
    private String sStatus;
    private String sAssigned;
    private String sSupervisor;

  
}
