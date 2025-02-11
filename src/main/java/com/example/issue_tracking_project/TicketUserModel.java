package com.example.issue_tracking_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_user_details", schema = "db_issue_tracking")
public class TicketUserModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int UserId;
private String UserName;
private String RoleAttached;
private String RoleId;
private String Password;

}
