package edu.ticket;

import edu.ticket.state.TicketState;
import edu.ticket.state.NewState;

public class Ticket {

    int id;

    // موقتاً نگه داشته شده برای لاگ و سازگاری
    String status = "NEW";

    String channel;
    String type;
    String request;
    String response;

    // State Pattern
    TicketState currentState;

    public Ticket(int id, String channel, String type) {
        this.id = id;
        this.channel = channel;
        this.type = type;

        // وضعیت اولیه
        this.currentState = new NewState();
    }

    /* ================= State related ================= */

    public void handle() {
        currentState.handle(this);
    }

    public void setState(TicketState state) {
        this.currentState = state;
        this.status = state.getName(); // همگام‌سازی موقت
    }

    public String getStateName() {
        return currentState.getName();
    }

    /* ================= Getters & Setters ================= */

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    // این setter فعلاً باقی می‌ماند، ولی دیگر استفاده اصلی ندارد
    public void setStatus(String status) {
        this.status = status;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
