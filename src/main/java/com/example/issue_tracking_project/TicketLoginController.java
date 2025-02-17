package com.example.issue_tracking_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TicketLoginController {

    
    TicketService ticketService;

    public TicketLoginController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/login")
    public ResponseEntity<TicketResponseEntity<TicketLoginModel>> login(@RequestBody TicketLoginModel  ticketLoginModel ){

        if(ticketLoginModel.getEmailId() == null || ticketLoginModel.getPassword() == null){
            return ResponseEntity.ok(new TicketResponseEntity<>(false,"Email Id and Password cannot be Null", null));
        }
        return ticketService.getLogin(ticketLoginModel);

     
    }

}
