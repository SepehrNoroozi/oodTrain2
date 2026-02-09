package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.strategy.BugResponseStrategy;
import edu.ticket.strategy.GenericResponseStrategy;
import edu.ticket.strategy.TicketResponseStrategy;

public class InProgressState implements TicketState {

    @Override
    public void handle(Ticket ticket) {

        System.out.println("Working on ticket");

        TicketResponseStrategy strategy;

        if (ticket.getType().equals("BUG")) {
            strategy = new BugResponseStrategy();
        } else {
            strategy = new GenericResponseStrategy();
        }

        strategy.respond(ticket);

        // ✅ انتقال صحیح و نهایی
        ticket.setState(new ResolvedState());
    }

    @Override
    public String getName() {
        return "IN_PROGRESS";
    }
}

