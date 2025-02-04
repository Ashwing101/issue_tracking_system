package com.example.issue_tracking_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

 
    private final TicketService ticketService;

    @Autowired  // This can also be omitted if there's only one constructor
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    // // Constructor Injection for TicketService
    // public TicketController(TicketService ticketService) {
    //     this.ticketService = ticketService;
    // }

    // Retrieve all tickets
    @GetMapping
    public ResponseEntity<List<TicketModel>> getAllTickets() {
        List<TicketModel> tickets = ticketService.getAllTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    // Create a ticket
    @PostMapping
    public ResponseEntity<TicketModel> createTicket(@RequestBody TicketModel ticket) {
        TicketModel createdTicket = ticketService.createTicket(ticket);
        return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
    }

    // Update a specific ticket
    @PutMapping("/{ticketId}")
    public List<TicketModel> updateTicket(@RequestBody TicketModel ticket) {
        List<TicketModel> updatedTicket = ticketService.updateTicket(ticket);
        return  updatedTicket;
    }

    // Delete a specific ticket
    @DeleteMapping("/{ticketId}")
    public ResponseEntity<String> deleteTicket(@PathVariable Integer ticketId) {
        String message = ticketService.deleteTicket(ticketId);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    // Test endpoint
    @GetMapping("/test")
    public ResponseEntity<String> testEndPoint() {
        return new ResponseEntity<>("Test endpoint is working!", HttpStatus.OK);
    }
}
