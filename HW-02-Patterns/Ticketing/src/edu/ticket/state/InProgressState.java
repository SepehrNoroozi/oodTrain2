package edu.ticket.state;

import edu.ticket.Ticket;

public class InProgressState implements TicketState {

    @Override
    public void handle(Ticket ticket) {

        System.out.println("Working on ticket");

        if (ticket.getType().equals("BUG")) {
            System.out.println("Sending bug response");
        } else {
            System.out.println("Sending generic response");
        }

        ticket.setState(new InProgressState());
    }

    @Override
    public String getName() {
        return "IN_PROGRESS";
    }
}
