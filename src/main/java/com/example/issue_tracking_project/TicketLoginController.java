package com.example.issue_tracking_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class TicketLoginController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/login")
    public ResponseEntity<TicketResponseEntity<TicketLoginModel>> login(@RequestBody TicketLoginModel  ticketLoginModel ){

        if(ticketLoginModel.getEmailId() == null || ticketLoginModel.getPassword() == null){
            return ResponseEntity.ok(new TicketResponseEntity<>(false,"Email Id and Password cannot be Null", null));
        }
        
        TicketLoginModel ticketlogin = ticketService.getLogin(ticketLoginModel);

         return ResponseEntity.ok(new TicketResponseEntity<>(false,"Email Id and Password cannot be Null", ticketlogin));
    }



}
