package com.day4.eventmanager;

public class EventManagerMain {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket("Concert A", 1500),
            new Ticket("Concert B", 800),
            new Ticket("Concert C", 2200),
            new Ticket("Concert D", 500),
            new Ticket("Concert E", 1200)
        };

        TicketSorter sorter = new TicketSorter();
        sorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Top Cheapest Tickets:");
        sorter.displayTickets(tickets, Math.min(3, tickets.length));
    }
}
