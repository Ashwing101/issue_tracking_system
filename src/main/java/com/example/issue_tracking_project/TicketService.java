package com.example.issue_tracking_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TicketService {
 

    @Autowired
    public TicketRepository ticketrepository;

    @Autowired  // This can also be omitted if there's only one constructor
    public TicketService(TicketRepository ticketrepository) {
        this.ticketrepository = ticketrepository;
    }

    public List<TicketDao> getAllTickets() {
        
        List<TicketDao> tickets = ticketrepository.findAll(); 
        if(tickets.isEmpty()){
            throw new RuntimeException("No Tickets Found");
        }
        return  tickets; 

    }

    public void updateTicket(Integer ticketId, String status) {

        //Code to be added regarding updating a ticket with the perticular Id 
        if(ticketId != null){
           Optional<TicketDao> ticket = ticketrepository.findById(ticketId);
           ticket.get().setStatus(status);
           ticketrepository.save(ticket.get());
        }else{
            throw new RuntimeException("Ticket Not Found for ticketId" + ticketId);
        }
       
    }
    
    public String deleteTicket(Integer ticketId) {
        //Code to be added regarding updating a ticket with the perticular Id 
        if(ticketId != null){
            //Delete from the table where nticketId = ticketId
            ticketrepository.deleteById(ticketId);
            return "Ticket Deleted Successfully";
        }else{
            return "Ticket Not Found";
        }
    }
    public TicketDao createTicket(TicketDao ticket) {
        //Code to be added regarding creating a Ticket 
        TicketDao ticketModel = new TicketDao();
        ticketModel.setTitle(ticket.getTitle());
        ticketModel.setDescription(ticket.getDescription());
        ticketModel.setStatus(ticket.getStatus());
        ticketModel.setAssignedto(ticket.getAssignedto());
        ticketModel.setAssignedby(ticket.getAssignedby());

        TicketDao ticketSave = ticketrepository.save(ticket);
        

        return ticketSave;
    }

    public TicketLoginModel getLogin(TicketLoginModel ticketLoginModel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLogin'");
    }

}
