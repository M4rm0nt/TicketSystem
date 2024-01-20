package controllers;

import models.Ticket;
import repositorys.TicketRepository;

import java.util.List;

public class TicketController {

    private TicketRepository ticketRepository = new TicketRepository();

    public void addTicket(Ticket ticket) {
        ticketRepository.addTicket(ticket);
    }

    public List<Ticket> fetchAllTickets() {
        return ticketRepository.getAllTickets();
    }

}
