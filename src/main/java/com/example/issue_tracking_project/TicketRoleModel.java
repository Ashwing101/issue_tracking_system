package com.example.issue_tracking_project;


import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "tb_roles", schema = "db_issue_tracking")
public class TicketRoleModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;

private String RoleId;
private String RoleName;
private String RoleDescription;
private String RoleType;

@OneToMany(mappedBy = "TicketRoleModel")
private List<UserDetails> users;

}
