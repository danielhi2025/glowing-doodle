package PACKAGE_NAME;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private final int id;
    private final String name;
    private final String date;
    private final List<Ticket> tickets;
    public Show(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.tickets = new ArrayList<>(); // Initialize empty list
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
    
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }
    
    public double calculateRevenue() {
        double revenue = 0;
        for (Ticket ticket : tickets) {
            revenue += ticket.getPrice();
        }
        return revenue;
    }
}
