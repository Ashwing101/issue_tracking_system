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

    //This is use when you have mutiple service to Autowired in that case no need of creating mutiple 
    // Autowired just use Constructor.
    @Autowired  // This can also be omitted if there's only one constructor /
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    // Retrieve all tickets
    @GetMapping("/getAllTickets")
    public ResponseEntity<List<TicketModel>> getTickets() {
        List<TicketModel> tickets = ticketService.getAllTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    // Create a ticket
    @PostMapping("/createTicket")
    public ResponseEntity<String> createTicket(@RequestBody TicketModel ticket) {
        ticketService.createTicket(ticket);
        return new ResponseEntity<>("Ticket Created Successfully", HttpStatus.CREATED);
    }

    // Update a specific ticket
    @PutMapping("updateTicket/{ticketId}/{status}")
    public ResponseEntity<String> updateTicket(@PathVariable Integer ticketId,
    @PathVariable String status) {
        try {
            ticketService.updateTicket(ticketId, status);
            return ResponseEntity.ok("Ticket status updated successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to update ticket status: " + e.getMessage());
        }
    }

    // Delete a specific ticket
    @DeleteMapping("deleteTicket/{ticketId}")
    public ResponseEntity<String> deleteTicket(@PathVariable Integer ticketId) {
        try{
            String message = ticketService.deleteTicket(ticketId);
            return new ResponseEntity<>(message, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>("Failed to Delete Ticket", HttpStatus.NOT_FOUND);
        }
       
    }

    // Test endpoint
    @GetMapping("/test")
    public ResponseEntity<String> testEndPoint() {
        return new ResponseEntity<>("Test endpoint is working!", HttpStatus.OK);
    }
}
