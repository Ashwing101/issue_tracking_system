package com.example.issue_tracking_project;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketLoginModel {

    private String username;
    private String password;
    private String emailId;
    private String roleId;
}
