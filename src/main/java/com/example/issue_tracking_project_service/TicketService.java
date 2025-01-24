package com.example.issue_tracking_project_service;

import com.example.issue_tracking_project_model.TicketModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    public List<TicketModel> getAllTickets() {

        //Code to be added to return all the tickets 
        return  null;
    }

    public TicketModel UpdateTicket(Integer ticketId) {
        //Code to be added regarding updating a ticket with the perticular Id 

        return null;
    }
    
    public TicketModel DeleteTicket(Integer ticketId) {
        //Code to be added regarding updating a ticket with the perticular Id 

        return null;
    }
    public TicketModel createTicket(TicketModel ticket) {
        //Code to be added regarding creating a Ticket 

        return null;
    }
}
