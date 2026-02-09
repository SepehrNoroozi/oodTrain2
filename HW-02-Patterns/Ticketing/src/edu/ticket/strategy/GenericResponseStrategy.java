package edu.ticket.strategy;

import edu.ticket.Ticket;

public class GenericResponseStrategy implements TicketResponseStrategy {

    @Override
    public void respond(Ticket ticket) {
        System.out.println("Sending generic response");
        ticket.setResponse("Your request has been handled");
    }
}