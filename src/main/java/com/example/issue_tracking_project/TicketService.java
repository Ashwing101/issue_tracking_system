package com.example.issue_tracking_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketService {
 

    @Autowired
    public TicketRepository ticketrepository;

    @Autowired  // This can also be omitted if there's only one constructor
    public TicketService(TicketRepository ticketrepository) {
        this.ticketrepository = ticketrepository;
    }



    public List<TicketModel> getAllTickets() {
        String status = "Open";
        List<TicketModel> tickets = ticketrepository.findBySStatus(status);
        //Code to be added to return all the tickets 
        return  tickets;
    }

    public TicketModel updateTicket(TicketModel ticketId) {
        //Code to be added regarding updating a ticket with the perticular Id 
        if(ticketId != null){
           //Database Select * from table where nticketId = ticketId;
      
        }
        return null;
    }
    
    public String deleteTicket(Integer ticketId) {
        //Code to be added regarding updating a ticket with the perticular Id 
        if(ticketId != null){
            
            //Delete from the table where nticketId = ticketId
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
