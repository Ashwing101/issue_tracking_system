package com.example.issue_tracking_project;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class IssueTrackingProjectApplication {

    
    public static void main(String[] args) throws IOException {

        SpringApplication.run(IssueTrackingProjectApplication.class, args);
    }

}
