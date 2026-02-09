package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.factory.ResponseStrategyFactory;
import edu.ticket.factory.StateFactory;
import edu.ticket.strategy.TicketResponseStrategy;

public class InProgressState implements TicketState {

    @Override
    public void handle(Ticket ticket) {

        System.out.println("Working on ticket");

        // Strategy: انتخاب نوع پاسخ
        TicketResponseStrategy strategy =
                ResponseStrategyFactory.create(ticket.getType());

        strategy.respond(ticket);

        // ✅ انتقال صحیح به وضعیت بعدی
        ticket.setState(StateFactory.create("RESOLVED"));
    }

    @Override
    public String getName() {
        return "IN_PROGRESS";
    }
}
