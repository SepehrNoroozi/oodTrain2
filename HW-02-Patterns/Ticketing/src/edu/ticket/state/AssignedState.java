package edu.ticket.state;

import edu.ticket.Ticket;

public class AssignedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {

        if (ticket.getType().equals("BUG")) {
            System.out.println("Assigned to engineering");
        } else {
            System.out.println("Assigned to support");
        }

        ticket.setState(StateFactory.create("RESOLVED"));
    }

    @Override
    public String getName() {
        return "ASSIGNED";
    }
}
