package edu.ticket.state;

import edu.ticket.Ticket;

public class ResolvedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolved");
        ticket.setState(new InProgressState());
    }

    @Override
    public String getName() {
        return "RESOLVED";
    }
}
