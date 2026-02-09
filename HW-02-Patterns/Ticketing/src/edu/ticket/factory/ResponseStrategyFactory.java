package edu.ticket.factory;

import edu.ticket.strategy.*;

public class ResponseStrategyFactory {

    public static TicketResponseStrategy create(String type) {
        if (type.equals("BUG")) {
            return new BugResponseStrategy();
        }
        return new GenericResponseStrategy();
    }
}