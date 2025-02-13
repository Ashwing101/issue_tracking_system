package com.example.issue_tracking_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_user_details", schema = "db_issue_tracking")
public class TicketUserDao {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String userName;
private String roleAttached;
private String password;
private String emailId;

 @ManyToOne
    @JoinColumn(name = "RoleId") // The foreign key column in tb_user_details
    private TicketRoleDao role;

}
