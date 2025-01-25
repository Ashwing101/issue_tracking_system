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
    
    public String DeleteTicket(Integer ticketId) {
        //Code to be added regarding updating a ticket with the perticular Id 
        if(ticketId != null){
            //Database Select * from table where nticketId = ticketId;
            return "Ticket Deleted Successfully";
        }else{
            return "Ticket Not Found";
        }
    }
    public TicketModel createTicket(TicketModel ticket) {
        //Code to be added regarding creating a Ticket 

        return null;
    }
}
