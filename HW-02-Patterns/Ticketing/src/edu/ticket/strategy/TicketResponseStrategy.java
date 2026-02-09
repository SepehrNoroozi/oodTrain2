package edu.ticket.strategy;

import edu.ticket.Ticket;

public interface TicketResponseStrategy {
    void respond(Ticket ticket);
}