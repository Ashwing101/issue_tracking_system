package com.example.issue_tracking_project_controller;

import com.example.issue_tracking_project_model.TicketModel;
import com.example.issue_tracking_project_service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    TicketService ticketService;

    // Retrieve all tickets
    @GetMapping
    public ResponseEntity<List<TicketModel>> getAllTickets() {
        List<TicketModel> tickets = ticketService.getAllTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    //Create ticket
    @PostMapping
    public  ResponseEntity<TicketModel> createTicket(@RequestBody TicketModel ticketId){

        TicketModel createdTicket = ticketService.createTicket(ticketId);

        return new ResponseEntity<>(createdTicket, HttpStatus.OK);
    }

    // Update specific ticket
    @PutMapping
    public ResponseEntity<TicketModel> updateTicket(Integer ticketId){

        TicketModel updatedticketId =  ticketService.UpdateTicket(ticketId);

        return new ResponseEntity<>(updatedticketId, HttpStatus.OK);
    }

    // Delete specific ticket
    @PostMapping
    public ResponseEntity<TicketModel> deleteTicket(@RequestBody TicketModel ticketId){

        TicketModel deletedticketId =  ticketService.UpdateTicket(ticketId);

        return  new ResponseEntity<>(deletedticketId, HttpStatus.OK);
    }
}
