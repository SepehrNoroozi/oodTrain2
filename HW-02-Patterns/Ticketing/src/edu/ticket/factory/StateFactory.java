package edu.ticket.factory;

import edu.ticket.state.*;

public class StateFactory {

    public static TicketState create(String stateName) {

        switch (stateName) {
            case "NEW":
                return new NewState();
            case "ASSIGNED":
                return new AssignedState();
            case "IN_PROGRESS":
                return new InProgressState();
            case "RESOLVED":
                return new ResolvedState();
            case "CLOSED":
                return new ClosedState();
            default:
                throw new IllegalArgumentException("Unknown state: " + stateName);
        }
    }
}