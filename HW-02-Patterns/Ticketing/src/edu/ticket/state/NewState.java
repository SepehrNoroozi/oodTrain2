package edu.ticket.state;

import edu.ticket.Ticket;

public class NewState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket created");

        if (ticket.getChannel().equals("WEB")) {
            System.out.println("Received from web");
        } else if (ticket.getChannel().equals("EMAIL")) {
            System.out.println("Received from email");
        }

        // انتقال به وضعیت بعدی (فعلاً فقط مفهومی)
        ticket.setState(StateFactory.create("RESOLVED"));
    }

    @Override
    public String getName() {
        return "NEW";
    }
}
