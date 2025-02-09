package com.example.issue_tracking_project;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TicketRoleModel {

@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;
@Id
private String RoleId;
private String RoleName;
private String RoleDescription;
private String RoleType;

}
