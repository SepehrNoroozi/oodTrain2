package edu.ticket.strategy;

import edu.ticket.Ticket;

public class BugResponseStrategy implements TicketResponseStrategy {

    @Override
    public void respond(Ticket ticket) {
        System.out.println("Sending bug response");
        ticket.setResponse("Bug has been fixed");
    }
}