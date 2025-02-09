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
        
        List<TicketModel> tickets = ticketrepository.findAll(); 
        return  tickets; 

    }

    public List<TicketModel> updateTicket(TicketModel ticketId) {

        List<TicketModel> tickets = null;
        //Code to be added regarding updating a ticket with the perticular Id 
        if(ticketId != null){
           //Database Select * from table where nticketId = ticketId;
         String status = "Open";
         tickets = ticketrepository.findBystatus(status);
        }
        return tickets;
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
        TicketModel ticketModel = new TicketModel();
        ticketModel.setTitle(ticket.getTitle());
        ticketModel.setDescription(ticket.getDescription());
        ticketModel.setStatus(ticket.getStatus());
        ticketModel.setAssignedto(ticket.getAssignedto());
        ticketModel.setAssignedby(ticket.getAssignedby());

        TicketModel ticketSave = ticketrepository.save(ticket);
        

        return ticketSave;
    }
}
