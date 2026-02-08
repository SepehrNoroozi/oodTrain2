package edu.ticket;

public class TicketService {

    public void handle(Ticket ticket) {

        // delegation به State
        ticket.handle();

        // لاگ (مطابق خواسته تمرین)
        System.out.println(
            "Logging ticket handling : " +
            ticket.getId() + " -> " +
            ticket.getStateName()
        );
    }
}
